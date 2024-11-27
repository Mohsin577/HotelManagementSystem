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
            System.out.println("2. View Guest");
            System.out.println("3. Update Guest");
            System.out.println("4. Delete Guest");
            System.out.println("5. Get All guests");
            System.out.println("0. Exit");

            System.out.print("Enter Choice : ");
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
                case 2:
                    System.out.print("Enter Guest Id : ");
                    id = sc.nextInt();
                    hotelDatabase.readGuest(id);
                    break;
                case 3:
                    System.out.print("Enter Guest Id : ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Updated Guest Name : ");
                    name= sc.nextLine();
                    System.out.print("Enter Updated Guest Mobile : ");
                    mobile = sc.nextLine();
                    System.out.print("Enter Updated Guest RoodNo : ");
                    roomNo = sc.nextLine();
                    hotelDatabase.updateGuest(id, name, mobile, roomNo);
                    break;
                case 4:
                    System.out.print("Enter Guest id : ");
                    id = sc.nextInt();
                    hotelDatabase.deleteGuest(id);
                    break;
                case 5:
                    System.out.println("Guest List");
                    hotelDatabase.readAllGuest();
                    break;
                case 0:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.print("Enter Valid Option");
                    break;
            }
        }
        
    }
}