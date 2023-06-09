package com.MessageRoom.MessageRoom.DTO;

public class UserDetailDTO {

    private int userid;
    private String username;
    private String password;

    public UserDetailDTO(int userid, String username, String password) {
        this.userid = userid;
        this.username = username;
        this.password = password;
    }

    public UserDetailDTO() {
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
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
        return "UserDetailDTO{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
