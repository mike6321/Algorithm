package me.choi.interview;

public class StringTest {
    public static void main(String[] args) {
        String str1 = "junwoo";
        String str2 = "junwoo";

        System.out.println(str1 == str2);

        String str3 = new String("junwoo");
        String str4 = new String("junwoo");

        System.out.println(str1 == str2);
        System.out.println(str3 == str4);


        String str5 = "na";
        String str6 = "na";
        String str7 = str5.intern();
        String str8 = new String("na");
        String str9 = str8.intern();
//        System.out.println(str5 == str7);
//        System.out.println(str8 == str9);
//       System.out.println(str5 + str6 == "nana");
//        System.out.println(str5 == "na");

        StringBuilder sb = new StringBuilder();
        sb.append("jun2oo");


        System.out.println(str5 == str9);


    }
}
