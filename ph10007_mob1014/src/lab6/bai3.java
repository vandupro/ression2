/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class bai3 {
    public static void main(String[] args) {
        qlsv ql = new qlsv();
        int choose;
        do{
           Scanner s = new Scanner(System.in);
           System.out.println("+..........MENU.........+");
            System.out.println("1.Nhap thong tin sinh vien");
            System.out.println("2.Xuat danh sach sinh vien");
            System.out.println("0.Thoat");
            System.out.println("........................");
            System.out.print("Moi chon chuc nang: ");
            choose = Integer.parseInt(s.nextLine());
            
            switch(choose){
                case 1:{
                    ql.nhap();
                    break;
                }
                case 2:{
                    ql.xuat();
                    break;
                }
                case 0:{
                    System.out.println("Thoat!");
                    break;
                }
                default:
                    System.out.println("Moi chon dung chuc nang!");
                    break;
            }
        }while(choose !=0);
    }
}
