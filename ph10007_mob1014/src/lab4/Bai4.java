/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author Admin
 */
public class Bai4 {
    public static void main(String[] args) {
        SanPham a = new SanPham();
        SanPham b = new SanPham();
        System.out.println("Moi nhap thong tin san pham 1:");
        a.nhap();
        System.out.println("Moi nhap thong tin san pham 2:");
        b.nhap();
        System.out.println("KET QUA:");
        System.out.println("Ten\tDon gia\tGiam gia\tThue nhap khau");
        a.xuat();
        b.xuat();
    }
}
