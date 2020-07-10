/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        int choose;
        Scanner s = new Scanner(System.in);
        XPoly a = new XPoly();
        a.menu();
        do{
            System.out.printf("Moi nhap chuc nang: ");
            choose = Integer.parseInt(s.nextLine());
            
            switch(choose){
                case 1:{
                    System.out.print("Moi nhap so tham so truyen vao: ");
                    int n = Integer.parseInt(s.nextLine());
                    double array[] = new double[n];
                    for(int i = 0; i < n; i++){
                        System.out.printf("Tham so %d: ", i +1);
                        array[i] = Double.parseDouble(s.nextLine());
                    }
                    System.out.printf("Tong tham so truyen vao la: %.1f\n", a.sum(array));
                    break;
                }
                case 2:{
                    System.out.print("Moi nhap so tham so truyen vao: ");
                    int n = Integer.parseInt(s.nextLine());
                    double array[] = new double[n];
                    for(int i = 0; i < n; i++){
                        System.out.printf("Tham so %d: ", i +1);
                        array[i] = Double.parseDouble(s.nextLine());
                    }
                    System.out.printf("Tham so lon nhat: %.1f\n", a.lonNhat(array));
                    System.out.printf("Tham so nho nhat: %.1f\n", a.nhoNhat(array));
                    break;
                }
                case 3:{
                    System.out.print("Moi nhap vao chuoi: ");
                    String n = s.nextLine();
                    System.out.printf("Ket qua: %s\n", a.toUpperFirstChar(n));
                    break;
                }
                case 4:{
                    System.out.println("Thoat.");
                    System.exit(0);
                    break;
                }
            }
        }while(choose != 4);
    }
}
