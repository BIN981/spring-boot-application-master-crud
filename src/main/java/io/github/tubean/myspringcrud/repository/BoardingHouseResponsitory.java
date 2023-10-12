package io.github.tubean.myspringcrud.repository;

import io.github.tubean.myspringcrud.entity.BoardinghouseEntity;
import io.github.tubean.myspringcrud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardingHouseResponsitory extends CrudRepository<BoardinghouseEntity, Integer>{
}
