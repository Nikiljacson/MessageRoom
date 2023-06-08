package com.MessageRoom.MessageRoom.DTO;

public class RoomMateDTO {
    private String roommatename;

    public RoomMateDTO(String roommatename) {
        this.roommatename = roommatename;
    }

    public RoomMateDTO() {
    }

    public String getRoommatename() {
        return roommatename;
    }

    public void setRoommatename(String roommatename) {
        this.roommatename = roommatename;
    }

    @Override
    public String toString() {
        return "RoomMateDTO{" +
                "roommatename='" + roommatename + '\'' +
                '}';
    }
}
