import java.util.*;

class Guest {
    private String Guest_Name;
    private String Room_no;

    public Guest(String Guest_name, String Room_no) {
        this.Guest_Name = Guest_name;
        this.Room_no = Room_no;
    }

    public String getGuest_Name() {
        return Guest_Name;
    }

    public String getRoom_no() {
        return Room_no;
    }

    public String toString() {
        return "Guest Name : " + Guest_Name + "\nRoom Number : " + Room_no;
    }
}

class Hotel {
    private static ArrayList<Guest> guests = new ArrayList<>();

    public static void addGuest(Guest guest) {
        guests.add(guest);
    }

    public static void display() {

        if (guests.isEmpty()) {
            System.out.println("Empty Hotel");
        } else {
            System.out.println("Guests : ");
            for (Guest guest : guests) {
                System.out.println(guest);
            }
        }
    }

    public static void searchGuest(String name) {
        if (guests.isEmpty()) {
            System.out.println("Empty Hotel");
        } else {
            for (Guest guest : guests) {
                if (guest.getGuest_Name().equalsIgnoreCase(name)) {
                    System.out.println("Guest Found : " + guest);
                    return;
                }
            }
        }
    }
}

public class HotelManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Guest");
            System.out.println("2. Display");
            System.out.println("3. Search Guest");
            System.out.println("4. Exit");
            System.out.print("Enter Choice : ");
            int n = sc.nextInt();
            sc.nextLine();
            switch (n) {
                case 1:
                    System.out.print("Enter Guest Name : ");
                    String Guest_Name = sc.nextLine();
                    System.out.print("Enter Room Number : ");
                    String room_no = sc.nextLine();
                    Guest newGuest = new Guest(Guest_Name, room_no);
                    Hotel.addGuest(newGuest);
                    System.out.println("Guest Added Successfully! ");
                    break;
                case 2:
                    Hotel.display();
                    break;
                case 3:
                    System.out.println("Enter guest Name : ");
                    String name = sc.nextLine();
                    Hotel.searchGuest(name);
                    break;
                case 4:
                    sc.close();
                    System.exit(0);
            }
        }
    }
}