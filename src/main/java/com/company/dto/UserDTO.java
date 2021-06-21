package com.company.dto;

public class UserDTO {
    private Integer Id;
    private String userName;
    private String password;

    public UserDTO() {
    }

    public UserDTO(Integer id, String userName, String password) {
        Id = id;
        this.userName = userName;
        this.password = password;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
