package org.example;

import java.util.List;
import java.util.Scanner;

public class App 
{
    static Scanner sc = new Scanner(System.in);
    static Mess_system ms = new Mess_system();

    public static void main( String[] args ) throws Exception
    {
//        One_fifty_thali th= new One_fifty_thali();

        System.out.println("Enter the option");
        int option = sc.nextInt();
        /* 1. add new order.
           2. view all order.
        * */
        switch (option){
            case 1:
                String s = new_order();
                System.out.println(s);
                break;
            case 2: List<One_fifty_thali> thali = ms.get_thali();
                for(One_fifty_thali item: thali){
                    System.out.println(item);
                }
                break;
        }
    }
    public static  String new_order() throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter price");
        int price= sc.nextInt();
        System.out.println("item for 1st dish");
        String dish1 = sc.nextLine();
        System.out.println("item for 2nd dish");
        String dish2= sc.nextLine();
        System.out.println("item for 3rd dish");
        String dish3= sc.nextLine();
        System.out.println("item for 4th dish");
        String dish4= sc.nextLine();
        System.out.println("item for 5th dish");
        String dish5= sc.nextLine();
        ms.add_new_thali(new One_fifty_thali(price,dish1,dish2,dish3,dish4,dish5));
        return "Order added successfulY...";
    }
}
