//Adeva Stria Arif Wibawa
//2502012464 - LA20;

package restaurant_uts_no_2;

import java.util.Scanner;
import java.util.*;

public class RESTAURANT_UTS_NO_2 {
    public static void main(String[] args) {
        int choice;
        Scanner Input = new Scanner(System.in);
        do{
            System.out.println("===================================");
            System.out.println("|   Selamat Datang Di menu Login  |");
            System.out.println("===================================");
            System.out.println("1. Admin");
            System.out.println("2. Customer");
            System.out.println("0. EXIT");
            System.out.print("Masukkan pilihan anda : ");
            
            choice = Input.nextInt();
            switch(choice){
                case 1:   
                    Scanner user = new Scanner (System.in);
                    Scanner pass = new Scanner (System.in);
                    
                    System.out.println("==================================");
                    System.out.println("|   Selamat Datang | ++ Admin ++ |");
                    System.out.println("==================================");
                    System.out.print("Masukkan Username : ");
                    String Username = user.next();
                    System.out.print("Masukkan Password : ");
                    String Password = pass.next();
                    LOGIN input = new LOGIN("Username","Password");
                    if (Username.equals("Admin")&& Password.equals("ad123")){
                        System.out.println("\t==========================");
                        System.out.println("\t| Selamat datang kembali |");
                        System.out.println("\t==========================");
                        Admin cust = new Admin();
                        cust.menu();  
                    }else if(Username.equals(Username)){
                        System.out.println("\n");
                        System.out.println("==========================");
                        System.out.println("|   Kata Sandi Salah !   |");
                        System.out.println("=========================="); 
                    }else if (Password.equals(Password)){
                        System.out.println("\n");
                        System.out.println("==========================");
                        System.out.println("|     Username Salah !   |");
                        System.out.println("==========================");
                    }else{
                        System.out.println("\n");
                        System.out.println("==================================");
                        System.out.println("| Sandi dan username anda salah !|");
                        System.out.println("==================================");
                        break;
                    }
                    break;
                case 2:
                    
                    Scanner user2 = new Scanner (System.in);
                    Scanner pass2 = new Scanner (System.in);
                    
                    System.out.println("=====================================");
                    System.out.println("|   Selamat Datang | ++ Customer ++ |");
                    System.out.println("=====================================");
                    System.out.print("Masukkan Username :");
                    String username2 = user2.next();
                    System.out.print("Masukkan Password : ");
                    String password2 = pass2.next();
                    
                    if(username2.equals("customer") && password2.equals("cust123")){
                        System.out.println("\t==========================");
                        System.out.println("\t| Selamat datang kembali |");
                        System.out.println("\t==========================");
                        Customer cust = new Customer();
                        cust.order();
                    }else if(username2.equals(username2)){
                        System.out.println("\n");
                        System.out.println("==========================");
                        System.out.println("|   Kata Sandi Salah !   |");
                        System.out.println("=========================="); 
                    }else if(password2.equals(password2)){
                        System.out.println("\n");
                        System.out.println("==========================");
                        System.out.println("|     Username Salah !   |");
                        System.out.println("==========================");
                    }else{
                        System.out.println("\n");
                        System.out.println("==================================");
                        System.out.println("| Sandi dan username anda salah !|");
                        System.out.println("==================================");
                        break;
                    }
                    break;
            }
        }while(choice!=0);
         
    }
}
