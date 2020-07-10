/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class bai1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Moi nhap ho ten: ");
             String ht = s.nextLine();
             int n = ht.lastIndexOf(" ");
             int m = ht.indexOf(" ");
             int d = ht.length();
             
             String first = ht.substring(0,m).toUpperCase();
             String dem = ht.substring(m,n);
             String last = ht.substring(n,d).toUpperCase();
             System.out.println("Ket qua: ");
             System.out.printf("Ho: %s, dem: %s, ten: %s\n", first, dem, last);
   }

}
