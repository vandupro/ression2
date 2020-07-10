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
public class SinhVienNuocNgoai extends SinhVien {
    double diemUT;
    Scanner s = new Scanner(System.in);
    
    @Override
    public void nhap(){
        super.nhap();
        System.out.print("Nhap diem uu tien: ");
        diemUT = Double.parseDouble(s.nextLine());
    }
    
    @Override
    public double getTongDiem(){
        return(diemToan*2 + diemVan + diemUT);
    }
}
