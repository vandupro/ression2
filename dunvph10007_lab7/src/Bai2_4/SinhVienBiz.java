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
public  class SinhVienBiz extends SinhVien {
    double diemMarketing;
    double diemSale;

    public SinhVienBiz(double diemMarketing, double diemSale, String hoTen) {
        super(hoTen, "Biz");
        this.diemMarketing = diemMarketing;
        this.diemSale = diemSale;
    }
    @Override
    public double getDiem(){
        return (2*diemMarketing + diemSale)/3;
    }
    
}
