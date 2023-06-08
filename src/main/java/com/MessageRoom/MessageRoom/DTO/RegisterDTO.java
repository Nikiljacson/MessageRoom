package com.MessageRoom.MessageRoom.DTO;

public class RegisterDTO {

    private String username;
    private String password;

    public RegisterDTO(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public RegisterDTO() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "RegisterDTO{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
