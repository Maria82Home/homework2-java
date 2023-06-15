public class homework2 {
    public static void main(String[] args) {
        String s ="select * from students where ";
        String str = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        str = str.replace("{","")
        .replace(":"," ")
        .replace("}","")
        .replace("\"","")
        .replace(",","")
        .replace("null","0");
        String[] array = str.split(" ");
        StringBuilder builder = new StringBuilder(s);
        builder.append(array[0]).append(" = '").append(array[1]).append("' and ")
        .append(array[2]).append(" = '").append(array[3]).append("' and ")
        .append(array[4]).append(" = '").append(array[5]).append("'");
        System.out.println(builder);

        
 }
}



