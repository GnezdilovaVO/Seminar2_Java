
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class program2_2 {

    public static void main(String[] args) {

        int[] arr = new int[] { 1, 5, 6, 2, 4, 9 };

        sortPuzir(arr);
        for (int item : arr) {
            System.out.println(item);
        }
    }

    static void writeToFile(int[] data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt", true))) {
            for (int item : data) {
                writer.write(item + " ");
            }

        } catch (IOException e) {
            System.out.println("Error" + e.getMessage());
        }
    }

    static void sortPuzir(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 2; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            writeToFile(array);
        }
    }
}
