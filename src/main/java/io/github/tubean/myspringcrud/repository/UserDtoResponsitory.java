//package io.github.tubean.myspringcrud.repository;
//
//import io.github.tubean.myspringcrud.dto.UserDto;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public interface UserDtoResponsitory extends CrudRepository<UserDto, String>, JpaRepository<UserDto, String> {
////    @Query("SELECT UserDto(i.image,i.create_date,u.name,u.email,u.phone) FROM UserImage as i join User as u")
////    List<io.github.tubean.myspringcrud.dto.UserDto> getAllUserDto();
//}
