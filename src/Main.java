import Database.HotelDatabase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("HOTEL MANAGEMENT SYSTEM");

        Scanner sc = new Scanner(System.in);

        HotelDatabase hotelDatabase = new HotelDatabase();
        boolean nextData = true;
        while(nextData == true){
            System.out.println("1. Add Guest");

            System.out.println("Enter Choice : ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter Guest Id : ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Guest Name : ");
                    String name= sc.nextLine();
                    System.out.print("Enter Guest Mobile : ");
                    String mobile = sc.nextLine();
                    System.out.print("Enter Guest RoodNo : ");
                    String roomNo = sc.nextLine();
                    hotelDatabase.createGuest(id,name,mobile,roomNo);
                    break;
                default:
                    System.out.print("Enter Valid Option");
                    break;
            }
            System.out.println("Do you want to continue true/false");
            nextData = sc.nextBoolean();
        }
        
    }
}