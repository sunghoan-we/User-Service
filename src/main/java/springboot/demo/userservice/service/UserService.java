package springboot.demo.userservice.service;

import springboot.demo.userservice.dto.UserDto;

public interface UserService {
    UserDto addUser(UserDto userDto);
    UserDto getUser(Long id);
}
