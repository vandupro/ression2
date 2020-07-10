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

public class Program {

    public static void main(String[] args) {
        QLNhanvien A = new QLNhanvien();
        A.menu();
        int choose;
        do {
            Scanner s = new Scanner(System.in);
            System.out.print("Moi ban nhap chuc nang: ");
            choose = Integer.parseInt(s.nextLine());
            switch (choose) {
                case 1: {
                    System.out.println("1.Nhap danh sach sinh vien");
                    A.Y01();
                    break;
                }
                case 2: {
                    System.out.println("2.Xuat danh sach sinh vien");
                    A.Y02();
                    break;
                }
                case 3: {
                    System.out.println("3.Tim kiem nhan vien theo ma nhan vien");
                    A.Y03();
                    break;
                }
                case 4: {
                    System.out.println("4.Xoa nhan vien theo ma nhap vao");
                    A.Y04();
                    break;
                }
                case 5: {
                    System.out.println("5.Tim kiem hoc vien theo ma so va cap nhat");
                    A.Y05();
                    break;
                }
                case 6: {
                    System.out.println("6.Tim nhan vien theo khoang luong");
                    A.Y06();
                    break;
                }
                case 7: {
                    System.out.println("7.Sap xep nhan vien theo ho ten");
                    A.Y07();
                    break;
                }
                case 8: {
                    System.out.println("8.Sap xep nhan vien theo thu nhap");
                    A.Y08();
                    break;
                }
                case 9: {
                    System.out.println("9.Xuat 5 nhan vien co thu nhap cao nhat");
                    A.Y09();
                    break;
                }
                case 0: {
                    System.out.println("Ban da thoat thanh cong!");
                    System.exit(0);
                }
                default: {
                    System.out.println("Ban da nhap sai chuc nang, xin moi nhap lai: ");
                    //continue;
                }
            }
        } while (choose != 0);
    }
}
