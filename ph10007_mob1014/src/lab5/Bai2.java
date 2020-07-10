/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author Admin
 */

import java.util.Scanner;
public class Bai2 {
    

    public static void main(String[] args) {
         ht a = new ht();
         int choose;
        a.menu();
        do{
        System.out.print("Moi chon chuc nang: ");
        Scanner s = new Scanner(System.in);
        choose = Integer.parseInt(s.nextLine());
        switch(choose){
            case 1:{
                a.nhap();
                break;
            }
            case 2:{
                a.xuat();
                break;
            }
            case 3:{
                a.ngauNhien();
                break;
            }
            case 4:{
                a.sapXep();
                break;
            }
            case 5:{
                a.xoa();
                break;
            }
            case 6:{
                System.out.println("Chuong trinh da thoat!");
                System.exit(0);
                break;
            }
        }}while(choose != 6);
        
        
    }
}
