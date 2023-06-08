package com.MessageRoom.MessageRoom.Controller;

import com.MessageRoom.MessageRoom.DTO.*;
import com.MessageRoom.MessageRoom.Service.ChatRoomService;
import com.MessageRoom.MessageRoom.Service.RegisterService;
import com.MessageRoom.MessageRoom.Service.RoomMateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    @Autowired
    private RoomMateService roomMateService;

    @Autowired
    private ChatRoomService chatRoomService;

    @PostMapping
    public String registerUserDetails(@RequestBody RegisterDTO registerDTO){
        String data = registerService.saveData(registerDTO);
        return data;
    }

    @GetMapping("/logincheck")
    public List<UserDetailDTO> getDetails(){
        List<UserDetailDTO> allDetails = registerService.getDetails();
        return allDetails;
    }

    @PostMapping("/addRoomMates")
    public String addRoomMates(@RequestBody RoomMateDTO roomMateDTO){
        String roommate = roomMateService.saveRoomMate(roomMateDTO);
        return roommate;
    }

    @PostMapping("/addChat")
    public String addChat(@RequestBody ChatRoomDTO chatRoomDTO){
        String chat = chatRoomService.addChats(chatRoomDTO);
        return chat;
    }

    @GetMapping("/showChats")
    public List<ShowChatsDTO> getChats(){
        List<ShowChatsDTO> allChats = chatRoomService.getChats();
        return allChats;
    }

}
