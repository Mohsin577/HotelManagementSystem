
public class Guest {

    private long id;
    private String name;
    private String mobile;
    private String roomNo;

    public Guest(long id,String name, String mobile, String roomNo) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.roomNo = roomNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", roomNo='" + roomNo + '\'' +
                '}';
    }
}
