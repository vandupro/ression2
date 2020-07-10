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
public  class SinhVienIt extends SinhVien {
    double java, html, css;

    public SinhVienIt(double java, double html, double css, String hoTen) {
        super(hoTen, "IT");
        this.java = java;
        this.html = html;
        this.css = css;
    }
    @Override
    public double getDiem(){
        return (2*java + html + css)/4;
    }
    
}
