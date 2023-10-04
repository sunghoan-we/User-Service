package springboot.demo.userservice.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import springboot.demo.userservice.dto.UserDto;
import springboot.demo.userservice.entity.User;
import springboot.demo.userservice.repository.UserRepository;
import springboot.demo.userservice.service.UserService;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public UserDto addUser(UserDto userDto) {
        User user = new User(userDto.getId(),
                userDto.getPasswd(),
                userDto.getName(),
                userDto.getPhoneNum());

        User addedUser = userRepository.save(user);

        UserDto savedUserDto = new UserDto(addedUser.getId(),
                addedUser.getPasswd(),
                addedUser.getName(),
                addedUser.getPhoneNum());
        return savedUserDto;
    }

    @Override
    public UserDto getUser(Long id) {
        Optional<User> userOpt = userRepository.findById(id);
        User user = userOpt.get();
        UserDto userDto = new UserDto(user.getId(),
                user.getPasswd(),
                user.getName(),
                user.getPhoneNum());
        return userDto;
    }
}
