package assignments;

import java.util.Scanner;

public class baitap1 {

    public static void main(String[] args) {
        Scanner ah = new Scanner(System.in);
        System.out.print("Enter of fullName: ");
        String name = ah.nextLine();

        System.out.print("Enter of Age : ");
        int age = ah.nextInt();
        
        System.out.print("Enter OfSex: ");
        ah.nextLine();
        String sex = ah.next();

        System.out.print("Enter of specialized: ");
        ah.nextLine();
        String specialized = ah.nextLine();

        System.out.print("Enter of GPA : ");
        double GPA = ah.nextDouble();

        System.out.print("Enter of Howtown : ");
        ah.nextLine();
        String Howtown = ah.nextLine();
        
        System.out.println("\nOutput of Information !");
        System.out.println("Name :" + name);
        System.out.println("Age :" + age);
        System.out.println("Sex :" + sex);
        System.out.println("specialized :" + specialized);
        System.out.println("GPA :" + GPA);
        System.out.println("Howtown :" + Howtown);
 
    }

}
