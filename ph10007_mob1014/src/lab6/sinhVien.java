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
public class sinhVien {
    String ht;
    String email;
    String sdt;
    String cmnd;
    
    Scanner s = new Scanner(System.in);
    String ktEmail(){
        String kt = "\\w+@\\w+(\\.\\w+){1,2}";
        System.out.print("Moi nhap email: ");
        String email = s.nextLine();
        while(email.matches(kt) == false){
            System.out.print("Email nhap sai ding dang, moi nhap lai:" );
            email = s.nextLine();
        }
        return email;
    }
    String ktsdt(){
        String kt = "0\\d{9,10}";
        System.out.print("Moi nhap so dien thoai: ");
        String sdt = s.nextLine();
        while(sdt.matches(kt) == false){
            System.out.print("So dien thoai nhap sai ding dang, moi nhap lai:" );
            sdt = s.nextLine();
        }
        return sdt;
    }
    
    String ktcmnd(){
        String kt = "\\d{10}";
        System.out.print("So cmnd: ");
        String cmnd = s.nextLine();
        while(cmnd.matches(kt) == false){
            System.out.print("cmnd nhap sai ding dang, moi nhap lai:" );
            cmnd = s.nextLine();
        }
        return cmnd;
    }
}
