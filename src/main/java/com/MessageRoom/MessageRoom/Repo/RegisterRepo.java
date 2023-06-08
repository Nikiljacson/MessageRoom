package com.MessageRoom.MessageRoom.Repo;

import com.MessageRoom.MessageRoom.Entity.UserRegister;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface RegisterRepo extends JpaRepository<UserRegister,Integer> {
}
