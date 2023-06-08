package com.MessageRoom.MessageRoom.DTO;

public class ShowChatsDTO {

    private int chatID;
    private String username;
    private String chat;

    public ShowChatsDTO(int chatID, String username, String chat) {
        this.chatID = chatID;
        this.username = username;
        this.chat = chat;
    }

    public ShowChatsDTO() {
    }

    public int getChatID() {
        return chatID;
    }

    public void setChatID(int chatID) {
        this.chatID = chatID;
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
        return "ShowChatsDTO{" +
                "chatID=" + chatID +
                ", username='" + username + '\'' +
                ", chat='" + chat + '\'' +
                '}';
    }
}
