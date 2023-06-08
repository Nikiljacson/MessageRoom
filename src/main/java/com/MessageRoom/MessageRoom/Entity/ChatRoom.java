package com.MessageRoom.MessageRoom.Entity;

import javax.persistence.*;

@Entity
@Table(name = "Chat")
public class ChatRoom {
    @Id
    @Column(name = "chatid", length = 100)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int chatID;
    @Column(name = "username", length = 100)
    private String username;
    @Column(name = "chat", length = 1000)
    private String chat;

    public ChatRoom(String username, String chat) {
        this.chatID = chatID;
        this.username = username;
        this.chat = chat;
    }

    public ChatRoom() {
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
        return "ChatRoom{" +
                "chatID=" + chatID +
                ", username='" + username + '\'' +
                ", chat='" + chat + '\'' +
                '}';
    }
}
