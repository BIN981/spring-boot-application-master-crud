package io.github.tubean.myspringcrud.service.impl;

import io.github.tubean.myspringcrud.dto.UserDto;
import io.github.tubean.myspringcrud.entity.User;
import io.github.tubean.myspringcrud.repository.UserRepository;
import io.github.tubean.myspringcrud.service.UserService;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
  @Autowired private UserRepository userRepository;

  @Override
  public List<User> getAllUser() {
    return (List<User>) userRepository.findAll();
  }

  @Override
  public void saveUser(User user) {
    userRepository.save(user);
  }

  @Override
  public void deleteUser(Long id) {
    userRepository.deleteById(id);
  }

  @Override
  public Optional<User> findUserById(Long id) {
    return userRepository.findById(id);
  }

  @Override
  public List<UserDto> getAllUserDto() {
    return userRepository.getAllUserDto();
  }

  @Autowired
  ModelMapper modelMapper;

  private UserDto convertEntityToDto(User user){
    modelMapper.getConfiguration()
            .setMatchingStrategy(MatchingStrategies.LOOSE);
    UserDto userLocationDTO = new UserDto();
    userLocationDTO = modelMapper.map(user, UserDto.class);
    return userLocationDTO;
  }

  private User convertDtoToEntity(UserDto userLocationDTO){
    modelMapper.getConfiguration()
            .setMatchingStrategy(MatchingStrategies.LOOSE);
    User user = new User();
    user = modelMapper.map(userLocationDTO, User.class);
    return user;
  }
}
