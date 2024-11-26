package Services;

import Entity.Guest;

import java.util.ArrayList;
import java.util.List;

public class GuestService {
    static List<Guest> guests = new ArrayList<>();

    public static void addGuest(long id, String name, String mobile, String roomNo){
        Guest guest = new Guest(id, name, mobile, roomNo);
        guests.add(guest);
        System.out.println("Guest Added Successfully with ID : "+id);
    }
}
