
package CaoLeTuanAnh_29219053647;

import java.util.Scanner;


public class Multipcation {
    public static void Multiplication(int n ){
 for(int i =1 ;  i<=10 ;  i++){
            System.out.println(n+"x"+i+"="+(n*i));
        } 
    }
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Nhap so ban muon in bang cuu chuong : ");
        int num = number.nextInt();
        Multiplication(num);
}
    }

