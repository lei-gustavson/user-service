package org.tu.userserviceimpl.dto;


public class RegisterUserDto {

    private String username;
    private String email;
    private String password;
    private String key;
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

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public static RegisterUserDtoBuilder builder() {
        return new RegisterUserDtoBuilder();
    }

    public static class RegisterUserDtoBuilder {

        private RegisterUserDto registerUserDto;

        public RegisterUserDtoBuilder() {
            this.registerUserDto = new RegisterUserDto();
        }

        public RegisterUserDtoBuilder withUsername(String username) {
            this.registerUserDto.setUsername(username);
            return this;
        }

        public RegisterUserDtoBuilder withPassword(String password) {
            this.registerUserDto.setPassword(password);
            return this;
        }

        public RegisterUserDtoBuilder withEmail(String email) {
            this.registerUserDto.setEmail(email);
            return this;
        }

        public RegisterUserDtoBuilder withKey(String key) {
            this.registerUserDto.setKey(key);
            return this;
        }

        public RegisterUserDtoBuilder withIpAddress(String ipAddress) {
            this.registerUserDto.setIpAddress(ipAddress);
            return this;
        }

        public RegisterUserDto build() {
            return registerUserDto;
        }
    }
}
