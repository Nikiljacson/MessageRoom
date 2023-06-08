package com.MessageRoom.MessageRoom.Entity;

import javax.persistence.*;

@Entity
@Table(name = "Register")
public class UserRegister {

    @Id
    @Column(name = "userid",length = 50)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userid;
    @Column(name = "username",length = 50)
    private String username;
    @Column(name = "password",length = 50)
    private String password;

    public UserRegister(String username, String password) {
        this.userid = userid;
        this.username = username;
        this.password = password;
    }

    public UserRegister() {
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
        return "UserRegister{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
