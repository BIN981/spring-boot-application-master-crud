//package io.github.tubean.myspringcrud.service.impl;
//
//import io.github.tubean.myspringcrud.dto.UserDto;
//import io.github.tubean.myspringcrud.entity.User;
//import io.github.tubean.myspringcrud.repository.UserDtoResponsitory;
//import io.github.tubean.myspringcrud.service.UserDtoService;
//import org.modelmapper.ModelMapper;
//import org.modelmapper.convention.MatchingStrategies;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import javax.transaction.Transactional;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Service
//public class UserDtoServiceImpl implements UserDtoService {
//    @Autowired
//    UserDtoResponsitory userDtoResponsitory;
//
//
//    @Override
//    public List<UserDto> viewList() {
//        return userDtoResponsitory.findAll();
//    }
//}
