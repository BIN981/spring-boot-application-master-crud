package io.github.tubean.myspringcrud.repository;

//import io.github.tubean.myspringcrud.dto.UserDto;
import io.github.tubean.myspringcrud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> , JpaRepository<User, Long> {
    @Query("SELECT new io.github.tubean.myspringcrud.dto.UserDto (i.image,i.create_date,u.name,u.email,u.phone) FROM user_image i join User u on i.user_id=u.id")
    List<io.github.tubean.myspringcrud.dto.UserDto> getAllUserDto();

}
