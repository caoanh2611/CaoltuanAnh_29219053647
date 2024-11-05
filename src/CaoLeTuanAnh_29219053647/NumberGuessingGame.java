
package CaoLeTuanAnh_29219053647;


import java.util.Random;
import java.util.Scanner;


public class NumberGuessingGame {
    public static void main(String[] args){
        Scanner NGG = new Scanner(System.in);
        Random rand = new Random();
        int randomNuber = rand.nextInt(50)+1 ;
        int dudoan = 0 ;
        
        while(dudoan!=randomNuber){
        System.out.print(" Nhap so du doan cua ban : ");
        dudoan = NGG.nextInt();
        if(dudoan>randomNuber)System.out.print("So du doan cua ban lon hon dap an ! ");
        else if(dudoan<randomNuber)System.out.print("So du doan cua ban behon dap an ! ");   
        else System.out.print("So du doan cua ban da dung chuc  mung ban ! ");    
    }
    }
}


