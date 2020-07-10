/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double d, r, c;
        for (int i = 0; i < 2; i++) {
            System.out.printf("Hinh chu nhat thu %d:\n", i + 1);
            System.out.print("Chieu dai: ");
//           double dai = Double.parseDouble(s.nextline());
            d = s.nextDouble();
            System.out.print("Chieu rong: ");
            r = s.nextDouble();
            HinhCn cn = new HinhCn(r,d);
            System.out.println("Ket qua: ");
            cn.xuat();
        }
        System.out.print("\nMoi nhap canh hinh vuong: ");
        c = s.nextDouble();
        HinhVuong hv = new HinhVuong(c);
        System.out.println("Ket qua: ");
        hv.xuat();
        
    }
}
