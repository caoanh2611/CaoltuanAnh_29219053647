
package CaoLeTuanAnh_29219053647;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Nhap so hang kim tu thap : ");
        int n = number.nextInt();
        for(int i =1 ;  i<=n ;  i++){
            for(int j = 1 ; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
            
    }
 
}
