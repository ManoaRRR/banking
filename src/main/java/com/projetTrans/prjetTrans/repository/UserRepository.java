package com.projetTrans.prjetTrans.repository;

import com.projetTrans.prjetTrans.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository <User, Integer>{
    List<User>findAllByFirstNameContainingIgnoreCase(String firstName);


    @Query(" select * from user where firstName =:firstName")
    List<User> findFirstName(String firstName);
}
