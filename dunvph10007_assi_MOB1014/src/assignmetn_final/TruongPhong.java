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
public class TruongPhong extends NhanVien {
    private double luongTrachNhiem;
    
    Scanner s = new Scanner(System.in);
    
    
    @Override
    public void nhap(){
        super.nhap();
        System.out.print("Nhap luong trach nhiem: ");
        luongTrachNhiem = Double.parseDouble(s.nextLine());
    }
    @Override
    public double getThuNhap(){
        return getLuong() - getThue() + luongTrachNhiem;
    }
}
