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
public class Bai3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Mời nhập cạnh: ");
        double x = scan.nextDouble();
        System.out.println("............");
        System.out.printf("The tich hinh lap phuong la: %.1f\n", Math.pow(x, 3));
        
    }
}
