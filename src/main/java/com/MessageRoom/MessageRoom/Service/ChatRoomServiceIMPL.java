package com.MessageRoom.MessageRoom.Service;

import com.MessageRoom.MessageRoom.DTO.ChatRoomDTO;
import com.MessageRoom.MessageRoom.DTO.ShowChatsDTO;
import com.MessageRoom.MessageRoom.Entity.ChatRoom;
import com.MessageRoom.MessageRoom.Repo.ChatRoomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChatRoomServiceIMPL implements ChatRoomService{

    @Autowired
    private ChatRoomRepo chatRoomRepo;
    @Override
    public String addChats(ChatRoomDTO chatRoomDTO) {
        ChatRoom chatroom = new ChatRoom(
                chatRoomDTO.getUsername(),
                chatRoomDTO.getChat()
        );
        chatRoomRepo.save(chatroom);
        return chatroom.getUsername();
    }

    @Override
    public List<ShowChatsDTO> getChats() {
        List<ChatRoom> getDetails = chatRoomRepo.findAll();
        List<ShowChatsDTO> chatDTOList = new ArrayList<>();
        for(ChatRoom a:getDetails){
            ShowChatsDTO chats = new ShowChatsDTO(
                    a.getChatID(),
                    a.getUsername(),
                    a.getChat()
            );
            chatDTOList.add(chats);
        }
        return chatDTOList;
    }
}
