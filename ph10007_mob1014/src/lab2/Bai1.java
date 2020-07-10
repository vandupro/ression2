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
public class Bai1 {
    public static void main(String[] args) {
        System.out.println("Giai PT: a*x + b = 0");
        Scanner scan = new Scanner(System.in);
        System.out.print("Moi nhap a: ");
        int a = scan.nextInt();
        System.out.print("Moi nhap b: ");
        int b = scan.nextInt();
        
        if(a == 0){
            if(b == 0){
                System.out.println("PT vo so nghiem");
            }else
                System.out.println("PT vo nghiem");
        }else
            System.out.println("PT co nghiem: " + (-b/a));
    }
}
