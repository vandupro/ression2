/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

/**
 *
 * @author Admin
 */
final public class XPoly {

    public static double sum(double... x) {
        int s = 0;
        for (double a : x) {
            s += a;
        }
        return s;
    }

    public static double nhoNhat(double... x) {
        double min = x[0];
        for (int i = 0; i < x.length; i++) {
            if(min > x[i]) min = x[i];
        }
        return min;
    }

    public static double lonNhat(double... x) {
        double max = x[0];
        for (int i = 0; i < x.length; i++) {
            if(max < x[i]) max = x[i];
        }
        return max;
    }

    public static String toUpperFirstChar(String s) {
        s = s.toLowerCase();
        String s2 = "";
        String words[] = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            char firstChar = words[i].charAt(0);
            String upperFirstChar = String.valueOf(firstChar).toUpperCase();
            words[i] = upperFirstChar + words[i].substring(1, words[i].length());
            s2 += words[i] + " ";
        }
        return s2;
    }

    public void menu() {
        System.out.println("+............MENU..............+");
        System.out.println("1.Chuc nang 1");
        System.out.println("2.Chuc nang 2");
        System.out.println("3.Chuc nang 3");
        System.out.println("4.Thoat");
    }
}
