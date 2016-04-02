package entities;

public class Room {
    private int roomNum;
    private RoomStatus status;
    private boolean smoking;
    private boolean freeWifi;
    private String view;
    private BedType bedType;
    private CheckIn checkIn;
    
    
    public Room(int roomNum, RoomStatus status, BedType bedType){
        this.roomNum = roomNum;
        this.status = status;
        this.bedType = bedType;
        freeWifi = false;
        smoking = false;
        view = "";
        checkIn = null;
    }
    
    public Room(int roomNum, RoomStatus status, BedType bedType, String view, boolean smoking, boolean wifi){
        this.roomNum = roomNum;
        this.status = status;
        this.bedType = bedType;
        this.view = view;
        this.smoking = smoking;
        this.freeWifi = wifi;
        checkIn = null;
    }
	
}
