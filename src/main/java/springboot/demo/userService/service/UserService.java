package springboot.demo.userService.service;

import springboot.demo.userService.dto.UserDto;

public interface UserService {
    UserDto addUser(UserDto userDto);
    UserDto getUser(Long id);
}
