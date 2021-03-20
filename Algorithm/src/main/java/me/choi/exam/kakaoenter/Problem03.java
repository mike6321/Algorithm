package me.choi.exam.kakaoenter;

import java.util.ArrayList;
import java.util.List;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 11:29 오후
 */
public class Problem03 {
    private static final String NEITHER = "Neither";
    private static final String IPV4 = "IPv4";
    private static final String IPV6 = "IPv6";

    public static void main(String[] args) {
        List<String> result = new ArrayList<>();
        result.add("000.012.234.23");
        result.add("666.666.23.23");
        result.add(".213.123.23.32");
        result.add("23.45.22.32.");
        result.add("272:2624:235e:3bc2:c46d:682:5d46:638g");
        result.add("1:22:333:4444");
        result.add("9598:ca53:c45:6099:b2d6:6ff2:56d4:ba53:abdb:d2e5:b039:8b5a:6643:c56a:7531:c68d");
        result.add("1::1::1");
        List<String> list = validateAddresses(result);
        System.out.println(list);
    }

    public static List<String> validateAddresses(List<String> addresses) {
        // Write your code here
        List<String> result = new ArrayList<>();
        for (String ip : addresses) {
            if ((ip.indexOf(":") > 0 || ip.indexOf("::") > -1) && ip.indexOf(".") < 0 && validationIpv6(ip)) {
                result.add(IPV6);
                continue;
            } else if (ip.indexOf(".") > 0 && ip.indexOf(":") < 0 && validationIpv4(ip)) {
                result.add(IPV4);
                continue;
            } else if (ip.contains(":::")){
                result.add(NEITHER);
                continue;
            } else {
                result.add(NEITHER);
            }
        }
        return result;
    }

    public static boolean validationIpv4(String ip) {
        String[] ipChars = ip.split("\\.", 4);
        if (ipChars.length != 4) {
            return false;
        }
        for (String ipChar : ipChars) {
            if (ipChar.length() == 0 || !ipChar.matches("[0-9]+") || (ipChar.length() > 1 && ipChar.charAt(0) == '0')) {
                return false;
            }

            if (ipChar.length() > 3 || Integer.parseInt(ipChar) > 255) {
                return false;
            }
        }

        return true;
    }

    public static boolean validationIpv6(String ip) {
        String[] ipChars = ip.split(":", 8);
        boolean hasDoubleColon = ip.contains("::");
        if (ipChars.length != 8) {
            if (!hasDoubleColon) {
                return false;
            }
        }

        for (String ipChar : ipChars) {
            if (ipChar.length() == 0 || ipChar.length() > 4) {
                if (hasDoubleColon) {
                    continue;
                }
                return false;
            }

            for (char c : ipChar.toCharArray()) {

                if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F')) {
                    continue;
                } else {
                    return false;
                }
            }
        }

        return true;
    }

}
