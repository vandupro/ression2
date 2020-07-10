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
public class NhanVien {
    public String manv;
    public String hoTen;
    public double luong;
    private double tn;
    private double thuetn;
    
    public void nhap(){
        Scanner s = new Scanner(System.in);
            System.out.print("\nMoi nhap ma: ");
            manv = s.nextLine();
            System.out.print("Moi nhap ho ten: ");
            hoTen = s.nextLine();
            System.out.print("Moi nhap luong: ");
            luong = Double.parseDouble(s.nextLine());
    }
    
    double getTn(){
        tn = luong - this.getthueTn();
       return tn; 
    }
    
    double getthueTn(){
        if(luong < 9000000) 
            thuetn = 0;
        else if(luong > 15000000)
            thuetn = 0.12 * luong;
        else 
            thuetn = 0.1*luong;
        return thuetn;
    }
    
    public void xuat(){
        System.out.printf("%-20s %-20s %-20.0f %-20.0f\n", manv, hoTen, this.getTn(), this.getthueTn());
    }
}
