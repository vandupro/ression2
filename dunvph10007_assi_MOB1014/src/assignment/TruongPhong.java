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

public class TruongPhong extends NhanVien {

    private double luongTrachNhiem;
    Scanner s = new Scanner(System.in);

    @Override
    public void nhap() {
        super.nhap();
        System.out.print("Moi nhap luong trach nhiem: ");
        luongTrachNhiem = Double.parseDouble(s.nextLine());
    }

    @Override
    double getTn() {
        return (super.getTn() + luongTrachNhiem);
    }
    
}
