/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Mời nhập độ dài cạnh thứ nhất: ");
        double a = scan.nextDouble();
        System.out.print("Mời nhập độ dài cạnh thứ hai: ");
        double b = scan.nextDouble();
        System.out.println("..............");
        System.out.printf("Chu vi: %.1f\nDien tich: %.1f", (a+b)*2, a*b);
        System.out.printf("\nĐộ dài cạnh nhỏ nhất là: %.1f\n", Math.min(a, b));
    }
}
