package com.emarques.springmvc.mudi.repository;

import com.emarques.springmvc.mudi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User,Long> {

    User findByUsername (String username);
}
