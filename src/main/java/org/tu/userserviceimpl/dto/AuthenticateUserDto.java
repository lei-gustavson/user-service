package org.tu.userserviceimpl.dto;


public class AuthenticateUserDto {

    private String username;
    private String email;
    private String password;
    private String ipAddress;

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
    
    
    public static UserBuilder builder() {
        return new UserBuilder();
    }

    public static class UserBuilder {

        private AuthenticateUserDto user;

        public UserBuilder() {
            this.user = new AuthenticateUserDto();
        }

        public UserBuilder withUsername(String username) {
            this.user.setUsername(username);
            return this;
        }

        public UserBuilder withPassword(String password) {
            this.user.setPassword(password);
            return this;
        }

        public UserBuilder withEmail(String email) {
            this.user.setEmail(email);
            return this;
        }

        public UserBuilder withIpAddress(String ipAddress) {
            this.user.setIpAddress(ipAddress);
            return this;
        }

        public AuthenticateUserDto build() {
            return user;
        }
    }
}
