
package CaoLeTuanAnh_29219053647;

import java.util.Scanner;

public class NumberFibonnacii {
    public static void main(String[] args) {
        Scanner Fibonaci = new Scanner(System.in);
        System.out.print("Nhap so phan tu Fibonaci can hien thi : ");
        int n = Fibonaci.nextInt();
        if(n<1){
            System.out.print("So Fibonacii :");
            System.out.print(0);
        }else if(n<=1){
            System.out.print("So Fibonacii :");
            System.out.print("  "+0 +" "+1);
        }else{
            System.out.print("So Fibonacii :");
            int first = 0 ;int second =  1;int tam = 0 ;
             System.out.print("  "+first +" "+second+" ");
            for(int i = 2 ; i <n ; i++){
                tam = first + second;
                first = second;
                second = tam ;
                 System.out.print(tam + " ");
                
            }
        }
    }

}
