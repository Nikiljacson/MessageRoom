package com.MessageRoom.MessageRoom.DTO;

public class ChatRoomDTO {

    private String username;

    private String chat;

    public ChatRoomDTO(String username, String chat) {

        this.username = username;
        this.chat = chat;
    }

    public ChatRoomDTO() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getChat() {
        return chat;
    }

    public void setChat(String chat) {
        this.chat = chat;
    }

    @Override
    public String toString() {
        return "ChatRoomDTO{" +
                ", username='" + username + '\'' +
                ", chat='" + chat + '\'' +
                '}';
    }
}
