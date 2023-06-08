package com.MessageRoom.MessageRoom.Service;

import com.MessageRoom.MessageRoom.DTO.RoomMateDTO;
import com.MessageRoom.MessageRoom.Entity.RoomMate;
import com.MessageRoom.MessageRoom.Repo.RoommateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomMateServiceIMPL implements RoomMateService{


    @Autowired
    private RoommateRepo roommateRepo;


    @Override
    public String saveRoomMate(RoomMateDTO roomMateDTO) {
        RoomMate roommate = new RoomMate(
                roomMateDTO.getRoommatename()
        );
        roommateRepo.save(roommate);
        return roommate.getRoommate_Name();
    }
}
