import java.lang.*; //String class is present in lang package

public class StringPractice{

    public static void main(String[] args){

        String str = new String("HelloWorld");
        System.out.println(str);

        //String Methods
        String str1 = str.toUpperCase();
        System.out.println("In Capital letters "+str1);

        String str2 = str.toLowerCase();
        System.out.println("In lowercase "+ str2);

        String str3 = str.replace('l','k');
        System.out.println("String after replacing "+str3);

        int index = str.indexOf('e');
        System.out.println("Index of e : "+index);

        char c = str.charAt(1);
        System.out.println("Character at index 1: "+c);

        String newStr = new String("HelloWorld"); //a new instance will be created.
        System.out.println(newStr.equals(str));

        System.out.println(newStr==str);// False because both the strings have been created using new keyword.
    }
}