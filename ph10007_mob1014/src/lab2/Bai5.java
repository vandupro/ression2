/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Bai5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Moi nhap ban kinh: ");
        double r = scan.nextDouble();
        System.out.println("Ket qua:");
        System.out.println("Chu vi hinh tron la: "+ 2*r*3.14);
        System.out.println("Dien tich hinh tron la: "+ 3.14 * r *r);
    }
}
