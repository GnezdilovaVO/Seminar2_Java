public class program2_1 {
    public static void main(String[] args) {
        StringBuilder data = new StringBuilder("select * from students where ");
        StringBuilder newData = new StringBuilder();
        String[] oldData = new String[] { "name:Ivanov", "country:Russia", "city:Moscow", "age:null" };
        for (int i = 0; i < oldData.length; i++) {
            newData.append(oldData[i]);
            newData.append(",");
        }
        String newData1 = newData.toString().replace(':', ',');
        String[] result = newData1.split(",");
        for (int i = 0; i < result.length - 1; i += 2) {
            if (result[i + 1].equals("null")) {
                // System.out.println(result[i + 1]);
            } else {
                data.append(result[i]);
                data.append(" = ");
                data.append("'" + result[i + 1] + "'");
                data.append(" and ");
            }
        }
        System.out.println(data);
    }
}
