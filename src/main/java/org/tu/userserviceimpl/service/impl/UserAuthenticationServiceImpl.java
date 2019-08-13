package org.tu.userserviceimpl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tu.userserviceimpl.dto.AuthenticateUserDto;
import org.tu.userserviceimpl.dto.RegisterUserDto;
import org.tu.userserviceimpl.dto.UserDto;
import org.tu.userserviceimpl.repository.UserRepository;
import org.tu.userserviceimpl.service.UserAuthenticationService;

import javax.security.sasl.AuthenticationException;
import java.nio.file.attribute.UserPrincipalNotFoundException;

@Service
public class UserAuthenticationServiceImpl implements UserAuthenticationService {

    private final UserRepository userRepository;

    @Autowired
    public UserAuthenticationServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDto registerUser(RegisterUserDto userDto) throws AuthenticationException {
        return new UserDto();
    }

    @Override
    public UserDto logUser(AuthenticateUserDto authenticateUserDto)
            throws UserPrincipalNotFoundException, AuthenticationException {
        return new UserDto();
    }
}
