package org.tu.userserviceimpl.entity;

import javax.persistence.*;

@Entity
@Table(name = "USER")
public class UserEntity extends BaseEntity {

    @Column(name = "EMAIL", nullable = false, unique = true)
    private String email;

    @Column(name = "PASSWORD", nullable = false)
    private String password;

    @Column(name = "USERNAME", nullable = false, unique = true, updatable = false)
    private String username;

    public UserEntity() {

    }

    public UserEntity(String email, String username, String password, String key) {
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public UserEntity(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

}
