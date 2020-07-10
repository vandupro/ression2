/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai1 {
    
    public static void main(String[] args) {
        System.out.print("Mời nhập Họ và tên: ");
        Scanner scan = new Scanner(System.in);
        String hoTen = scan.nextLine();
        System.out.print("Mời nhập vào điểm: ");
        double diem = scan.nextDouble();
        System.out.println("..................");
        System.out.printf("Họ và tên: %s\nĐiểm: %.1f\n", hoTen, diem);
        
    }
}
