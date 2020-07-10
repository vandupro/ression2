/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Admin
 */
public class Bai2 {
    public static void main(String[] args) {
        System.out.println("Bang cuu chuong: ");
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++){
                System.out.printf("%d x %d = %d\n", i, j, i*j);
            }
            System.out.println("_________");
        }
    }
}
