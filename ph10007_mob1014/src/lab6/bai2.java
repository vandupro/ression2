/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
import java.util.ArrayList;

public class bai2 {

    public static void main(String[] args) {
        ArrayList<SanPham> list = new ArrayList<SanPham>();
        System.out.println("Moi nhap vao thong tin 5 san pham: ");
        for (int i = 0; i < 5; i++) {
            SanPham sp = new SanPham();
            sp.nhap();
            list.add(sp);
        }
        System.out.println("Ket qua:");
        System.out.printf("%-20s %-20s %-20s\n", "Ten san pham", "Don gia", "Hang");
        for (SanPham a : list) {
            if (a.hang.equalsIgnoreCase("Nokia")) {
                a.xuat();
            }
        }
    }
}
