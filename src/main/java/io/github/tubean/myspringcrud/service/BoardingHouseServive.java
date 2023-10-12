package io.github.tubean.myspringcrud.service;

import io.github.tubean.myspringcrud.entity.BoardinghouseEntity;
import io.github.tubean.myspringcrud.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface BoardingHouseServive {
    Optional<BoardinghouseEntity> findUserById(int id);
}
