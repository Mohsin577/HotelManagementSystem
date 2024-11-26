import Entity.Guest;
import Services.GuestService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        Scanner sc = new Scanner(System.in);

//        List<Guest> guests = new ArrayList<>();
        System.out.print("Enter number of Guests : ");
        int n = sc.nextInt();
        int i =0;

        GuestService guestService = new GuestService();

        while(i<n) {
            System.out.print("Enter Guest Id : ");
            long id = sc.nextLong();
            sc.nextLine();
            System.out.print("Enter Guest Name : ");
            String name = sc.nextLine();
            System.out.print("Enter Guest Mobile : ");
            String Mobile = sc.nextLine();
            System.out.print("Enter Guest RoomNo : ");
            String roomNo = sc.next();

//            Guest newGuest = new Guest(id, name, Mobile, roomNo);
            guestService.addGuest(id, name, Mobile, roomNo);
            i++;
        }
//        System.out.println(guests);
    }
}