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
public class Bai2 {

    public static void main(String[] args) {
        SanPham sp1 = new SanPham();
        SanPham sp2 = new SanPham();
        System.out.println("Moi nhap thong tin san pham 1:");
        sp1.nhap();
        System.out.println("Moi nhap thong tin san pham 2:");
        sp2.nhap();
        System.out.println("KET QUA:");
        System.out.println("Ten\tDon gia\tgiam gia\tThue nhap khau");
        sp1.xuat();
        sp2.xuat();
    }
}
