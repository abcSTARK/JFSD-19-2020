package com.example.photoappapiuser.service;
import com.example.photoappapiuser.dto.UserDto;
import com.example.photoappapiuser.shared.UserRequestModelEntity;
import com.example.photoappapiuser.shared.UserResponseModelEntity;
public interface UserService {

    public UserResponseModelEntity createUser(UserDto userDto);
}
