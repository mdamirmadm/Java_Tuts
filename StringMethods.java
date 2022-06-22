public class StringMethods{

    public static void main(String[] args){

        String str = new String("www.google.com");

        String substr = str.substring(4,10);
        System.out.println(substr);

        String str2 = new String("abcd");
        String str3 = new String("efgh");
        System.out.println(str3.compareTo(str2));//gives negative value if 1st string is lexographically smaller than the 2nd string.
    }
}