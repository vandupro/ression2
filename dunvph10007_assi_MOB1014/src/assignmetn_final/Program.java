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
import assignmetn_final.QuanLy;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        QuanLy ql = new QuanLy();

        Scanner s = new Scanner(System.in);
        int choose;
        ql.menu();
        do {
        System.out.print("<>Moi chon chuc nang<>: ");
            choose = Integer.parseInt(s.nextLine());
            
            switch(choose){
                case 1:{
                    System.out.println("1.Nhap danh sach nhan vien");
                    ql.Y01();
                    break;
                }
                case 2:{
                    System.out.println("2.Xuat danh sach nhan vien");
                    ql.Y02();
                    break;
                }
                case 3:{
                    System.out.println("3.Tim va hien thi nhan vien theo ma nhap vao");
                    ql.Y03();
                    break;
                }
                case 4:{
                    System.out.println("4.Xoa nhan vien theo ma nhap vao");
                    ql.Y04();
                    break;
                }
                case 5:{
                    System.out.println("5.Cap nhat thong tin nhan vien theo ma nhap vao");
                    ql.Y05();
                    break;
                }
                case 6:{
                    System.out.println("6.Tim cac nhan vien theo khoang luong");
                    ql.Y06();
                    break;
                }
                case 7:{
                    System.out.println("7.Sap xep nhan vien theo ho ten");
                    ql.Y07();
                    break;
                }
                case 8:{
                    System.out.println("8.Sap xep nhan vien theo thu nhap");
                    ql.Y08();
                    break;
                }
                case 9:{
                    System.out.println("9.Xuat 5 nhan vien co thu nhap cao nhat");
                    ql.Y09();
                    break;
                }
                case 0:{
                    System.out.println("Chuong trinh da thoat!");
                    System.exit(0);
                }
                default :{
                    System.out.println("Moi chon dung chuc nang");
                }
            }

        } while (choose != 0);
    }
}
