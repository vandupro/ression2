/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class TiepThi extends NhanVien {
    private double doanhSo;
    private double hoaHong;
    Scanner s = new Scanner(System.in);
    
    @Override
    public void nhap(){
        super.nhap();
        System.out.print("Moi nhap doanh so: ");
        doanhSo = Double.parseDouble(s.nextLine());
        System.out.print("Moi nhap hoa hong: ");
        hoaHong = Double.parseDouble(s.nextLine());
    }
    @Override
    double getTn(){
       return(super.getTn() + 0.05 * doanhSo + hoaHong);
    }
}
