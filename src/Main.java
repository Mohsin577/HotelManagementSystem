import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        Scanner sc = new Scanner(System.in);

        List<Guest> guests = new ArrayList<>();
        System.out.print("Enter number of Guests : ");
        int n = sc.nextInt();
        int i =0;

        while(i<n) {
            System.out.print("Enter Guest Id : ");
            long id = sc.nextLong();
            System.out.print("Enter Guest Name : ");
            String name = sc.next();
            System.out.print("Enter Guest Mobile : ");
            String Mobile = sc.next();
            System.out.print("Enter Guest RoomNo : ");
            String roomNo = sc.next();

            Guest newGuest = new Guest(id, name, Mobile, roomNo);
            guests.add(newGuest);
            i++;
        }
        System.out.println(guests);
    }
}