package me.choi;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String str1 = "testcase1";
        String str2 = "testcase1";

        boolean result = isTrue(str1, str2);
        System.out.println(result);
    }

    private static boolean isTrue(String str1, String str2) {

        return str1 == str2;
    }
}
