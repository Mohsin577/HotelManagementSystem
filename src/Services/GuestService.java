package Services;

import Database.HotelDatabase;
import Entity.Guest;

import java.util.ArrayList;
import java.util.List;

public class GuestService {
//    static List<Guest> guests = new ArrayList<>();
    static HotelDatabase hotelDatabase = new HotelDatabase();

    public static void addGuest(long id, String name, String mobile, String roomNo){
        hotelDatabase.createGuest(id, name, mobile, roomNo);
    }
}
