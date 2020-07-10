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
public class Bai1 {

    public static void main(String[] args) {
        SanPham x = new SanPham();
        x.nhap();
        System.out.println("KET QUA: ");
        System.out.println("Ten\tDon gia\tGiam gia\tThue nhap khau");
        x.xuat();
    }
}
