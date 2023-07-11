public class HW2 {
    public static void main(String[] args) {
        StringBuilder request = new StringBuilder();
        String[] str = { "name:Ivanov", "country:Russia", "city:Moscow", "age:null" };
        for (int i = 0; i < str.length; i++) {
            if (str[i].indexOf("null") == (-1))
            {
                // если индекс строки "null" будет не найден
                request.append(str[i].replace(":", " = "));
                if (i != str.length - 2)
                {
                    request.append(" AND ");
                }
            }
        }
        System.out.println(request);
    }
}