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
import java.util.Scanner;

public class SanPham {

    private String ten;
    private double donGia;
    private double giamGia;

    public SanPham() {
    }
    
    public SanPham(String ten, double donGia, double giamGia) {
        this.ten = ten;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SanPham(String ten, double donGia) {
        this.ten = ten;
        this.donGia = donGia;
    }
    
    public void nhap() {
        Scanner s = new Scanner(System.in);
        System.out.print("Moi nhap ten: ");
        ten = s.nextLine();
        System.out.print("Moi nhap don gia: ");
        donGia = s.nextDouble();
        System.out.print("Moi nhap giam gia: ");
        giamGia = s.nextDouble();
    }

    private double getThueNhapKhau() {
        return (0.1 * (donGia - giamGia));
    }

    public void xuat() {
        System.out.printf("%s\t%.0f\t%.0f\t\t%.0f\n", this.getTen(),this.getDonGia(),this.getGiamGia(),this.getThueNhapKhau());
    }

    public String getTen() {
        return ten;
    }

    public double getDonGia() {
        return donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }
    
}
