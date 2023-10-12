package io.github.tubean.myspringcrud.service;

import io.github.tubean.myspringcrud.dto.UserDto;
import io.github.tubean.myspringcrud.entity.User;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

public interface UserService {
  List<User> getAllUser();

  void saveUser(User user);

  void deleteUser(Long id);

  Optional<User> findUserById(Long id);
  List<UserDto> getAllUserDto();

}
