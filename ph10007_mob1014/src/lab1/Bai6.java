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
public class Bai6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String x, y, a, b;
        System.out.print("Moi nhap vao chuoi thu nhat: ");
        x = scan.nextLine();
        System.out.print("Moi nhap vao chuoi thu hai: ");
        y = scan.nextLine();
        System.out.print("Moi nhap vao chuoi a: ");
        a = scan.nextLine();
        System.out.print("Moi nhap vao chuoi b: ");
        b = scan.nextLine();
        
        System.out.println("Ket Qua:");
        System.out.println(x);
        System.out.println(y);
        System.out.println(a + b);
        
        
    }
    
}
