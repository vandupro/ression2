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
public class Bai6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String hoTen;
        double toan, ly, hoa;
        System.out.print("Moi nhap ho ten: ");
        hoTen = scan.nextLine();
        System.out.print("Moi nhap diem toan: ");
        toan = scan.nextDouble();
        System.out.print("Moi nhap diem ly: ");
        ly = scan.nextDouble();
        System.out.print("Moi nhap diem hoa: ");
        hoa = scan.nextDouble();
        System.out.println("Ket qua:");
        System.out.printf("Ho ten: %s\nDiem trung binh: %.1f", hoTen,(toan + ly + hoa)/3);
    }
}
