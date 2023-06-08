package com.MessageRoom.MessageRoom.Entity;

import javax.persistence.*;

@Entity
@Table(name = "RoomMates")
public class RoomMate {

    @Id
    @Column(name = "roommate_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int roommate_Id;
    @Column(name = "roommate_name")
    private String roommate_Name;

    public RoomMate(String roommate_Name) {
        this.roommate_Id = roommate_Id;
        this.roommate_Name = roommate_Name;
    }

    public RoomMate() {
    }

    public int getRoommate_Id() {
        return roommate_Id;
    }

    public void setRoommate_Id(int roommate_Id) {
        this.roommate_Id = roommate_Id;
    }

    public String getRoommate_Name() {
        return roommate_Name;
    }

    public void setRoommate_Name(String roommate_Name) {
        this.roommate_Name = roommate_Name;
    }

    @Override
    public String toString() {
        return "RoomMate{" +
                "roommate_Id=" + roommate_Id +
                ", roommate_Name='" + roommate_Name + '\'' +
                '}';
    }
}
