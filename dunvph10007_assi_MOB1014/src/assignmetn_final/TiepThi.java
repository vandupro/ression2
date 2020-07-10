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
public class TiepThi extends NhanVien{
    
    private double doanhSo;
    private double hoaHong;
    
    Scanner s = new Scanner(System.in);
    
    @Override
    public void nhap(){
        super.nhap();
        System.out.print("Nhap doanh so: ");
        doanhSo = Double.parseDouble(s.nextLine());
        System.out.print("Nhap hoa hong: ");
        hoaHong = Double.parseDouble(s.nextLine());
    }

    public double getDoanhSo() {
        return doanhSo;
    }

    public double getHoaHong() {
        return hoaHong;
    }
    
    @Override
    public double getThuNhap(){
        return getLuong() + doanhSo * hoaHong/100 - getThue();
    }
}
