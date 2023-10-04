package springboot.demo.userservice.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springboot.demo.userservice.dto.UserDto;
import springboot.demo.userservice.service.UserService;

@RestController
@RequestMapping("api/user")
@AllArgsConstructor
public class UserController {

    UserService userService;

    @GetMapping
    public ResponseEntity<UserDto> getUser(@RequestParam Long id) {
        UserDto userDto = userService.getUser(id);
        return ResponseEntity.ok(userDto);
    }

    @PostMapping
    public ResponseEntity<UserDto> addUser(@RequestBody UserDto userDto) {
        UserDto addUserDto = userService.addUser(userDto);
        return new ResponseEntity<>(addUserDto, HttpStatus.CREATED);
    }
}
