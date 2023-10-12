package io.github.tubean.myspringcrud.service.impl;

import io.github.tubean.myspringcrud.entity.BoardinghouseEntity;
import io.github.tubean.myspringcrud.repository.BoardingHouseResponsitory;
import io.github.tubean.myspringcrud.service.BoardingHouseServive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class BoardingHouseServiceImpl implements BoardingHouseServive {
    @Autowired
   private BoardingHouseResponsitory  houseResponsitory;

    @Override
    public Optional<BoardinghouseEntity> findUserById(int id) {
        return houseResponsitory.findById(id);
    }
}
