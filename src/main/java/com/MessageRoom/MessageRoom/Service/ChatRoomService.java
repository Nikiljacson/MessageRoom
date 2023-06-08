package com.MessageRoom.MessageRoom.Service;

import com.MessageRoom.MessageRoom.DTO.ChatRoomDTO;
import com.MessageRoom.MessageRoom.DTO.ShowChatsDTO;

import java.util.List;

public interface ChatRoomService {

    String addChats(ChatRoomDTO chatRoomDTO);

    List<ShowChatsDTO> getChats();
}
