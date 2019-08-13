package org.tu.userserviceimpl.dto;

import java.util.List;

public class UserDto {

    private String email;

    private String password;

    private String username;

    private List<String> friendsList;

    public String getEmail() {
        return this.email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    public List<String> getFriendsList() {
        return this.friendsList;
    }

    public void setFriendsList(final List<String> friendsList) {
        this.friendsList = friendsList;
    }
}
