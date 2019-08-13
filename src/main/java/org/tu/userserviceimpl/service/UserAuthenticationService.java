package org.tu.userserviceimpl.service;

import org.tu.userserviceimpl.dto.AuthenticateUserDto;
import org.tu.userserviceimpl.dto.RegisterUserDto;
import org.tu.userserviceimpl.dto.UserDto;

import javax.security.sasl.AuthenticationException;
import java.nio.file.attribute.UserPrincipalNotFoundException;

public interface UserAuthenticationService {

    UserDto registerUser(RegisterUserDto userDto) throws AuthenticationException;

    UserDto logUser(AuthenticateUserDto authenticateUserDto)
            throws UserPrincipalNotFoundException, AuthenticationException;
}
