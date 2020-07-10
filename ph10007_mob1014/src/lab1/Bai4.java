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
public class Bai4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pt bac 2: a*x*x + b*x + c = 0");
        System.out.print("Moi nhap he so a: ");
        int a = scan.nextInt();
        System.out.print("Moi nhap he so b: ");
        int b = scan.nextInt();
        System.out.print("Moi nhap he so c: ");
        int c = scan.nextInt();
        System.out.println(".............");
        double denta = Math.pow(b, 2) - 4*a*c;
        if(denta <= 0)
            System.out.println("denta <=0. Do do khong co can denta");
        else
        System.out.printf("Gia tri can denta: %.1f\n", Math.sqrt(denta));
    }
}
