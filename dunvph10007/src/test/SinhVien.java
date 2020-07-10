/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class SinhVien {
    String maSV;
    String hoTen;
    double diemToan;
    double diemVan;
    Scanner s = new Scanner(System.in);
    public void nhap(){
        
        System.out.print("Nhap ma sinh vien: ");
        maSV = s.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = s.nextLine();
        System.out.print("Nhap diem toan: ");
        diemToan = Double.parseDouble(s.nextLine());
        System.out.print("Nhap diem van: ");
        diemVan = Double.parseDouble(s.nextLine());
    }
    public double getTongDiem(){
        return(diemToan*2 + diemVan);
    }
    
    public String getXetLoai(){
        if(this.getTongDiem() < 15)
            return("Rot");
        else
            return"Dau";
    }
    
    public void xuat(){
        
        System.out.printf("%-20s %-20s %-20.0f %-20.0f %-20.0f %-20s\n", maSV, hoTen, diemToan, diemVan, this.getTongDiem(), this.getXetLoai());
        
    }
}
