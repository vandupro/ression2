/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2_4;

/**
 *
 * @author Admin
 */
public abstract class SinhVien {
    String hoTen;
    String nganh;

    public SinhVien(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }
     public abstract double getDiem();
     
     
    
    String getHocLuc(){
       String hl;
       if(this.getDiem() < 5) hl = "Yeu";
       else if(this.getDiem() <6.5) hl = "Trung binh";
       else if(this.getDiem() < 7.5) hl = "Kha";
       else if(this.getDiem() < 9) hl = "Gioi";
       else hl = "Xuat sac";
       return hl;
    }
    
    
     public void xuat(){
        System.out.printf("%-20s %-20s %-20.0f %-20s\n", hoTen, nganh, this.getDiem(), this.getHocLuc());
    }
}
