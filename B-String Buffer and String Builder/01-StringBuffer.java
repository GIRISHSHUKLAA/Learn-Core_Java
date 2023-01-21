public class Stringbuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("GIRISH");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.append(" SHUKLA"));

        String str = sb.toString();
        System.out.println(str);


    }
}
