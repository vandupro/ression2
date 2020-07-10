/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmetn_final;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class NhanVien {
    private String manv;
    private String hoTen;
    private double luong;
//    private double thuNhap;
//    private double thueThuNhap;
    
    Scanner s = new Scanner(System.in);
    
    public void nhap(){
        System.out.print("Nhap ma nhan vien:  ");
        manv = s.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = s.nextLine();
        System.out.print("Nhap luong: ");
        luong = Double.parseDouble(s.nextLine());
    }

    public String getManv() {
        return manv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public double getLuong() {
        return luong;
    }
    
    public double getThue(){
        if(luong < 9000000)
            return 0;
        else if(luong > 15000000)
            return 0.12 * luong;
        else
            return 0.1 * luong;
    }
    public double getThuNhap() {
        return luong - getThue();
    }
    
    
    
    public void xuat(){
        System.out.printf("%-15s %-15s %-15.0f %-15.0f %-15.0f \n", manv, hoTen, luong, getThue(), getThuNhap());
    }
}
