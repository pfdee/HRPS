public enum RoomStatus {
    VACANT, OCCUPIED, RESERVED, UNDER_MAINTENANCE;
    
    @Override
    public String toString(){
        String s = "";
        switch(this){
            case VACANT:
                s = "Vacant";
                break;
            case OCCUPIED:
                s = "Occupied";
                break;
            case RESERVED:
                s = "Reserved";
                break;
            case UNDER_MAINTENANCE:
                s = "Under maintenance";
                break;
        }
        return s;
    }
}
