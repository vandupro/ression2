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
public class HinhVuong extends HinhCn{
    double canh;
    public HinhVuong(double canh) {
        super(canh, canh);
        this.canh = canh;
    }
    @Override
    public void xuat(){
        System.out.printf("Canh: %f\nChu vi: %f\nDien tich: %f\n", canh, super.getChuVi(), super.getDienTich());
    }        
    
}
