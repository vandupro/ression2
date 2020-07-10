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
public class HinhCn {

    double rong;
    double dai;

    public HinhCn(double rong, double dai) {
        this.rong = rong;
        this.dai = dai;
    }
    
    public double getChuVi(){
        return (rong + dai)* 2;
    }
    
    public double getDienTich(){
        return rong*dai;
    }
    
    public void xuat(){
        System.out.printf("Chieu rong: %f\nChieu dai: %f\nDien tich: %f\nChu vi: %f\n", rong, dai, this.getDienTich(), this.getChuVi());
    }
}
