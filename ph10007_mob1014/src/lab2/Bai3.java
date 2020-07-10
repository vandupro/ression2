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
public class Bai3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Moi nhap vao so dien: ");
        int n = scan.nextInt();
        int tien;
        if(n < 50)
            tien = n * 1000;
        else
            tien = 50 * 1000 +(n - 50) * 1200;
        System.out.println("So tien phai tra hang thang: "+ tien);
    }
}
