package com.MessageRoom.MessageRoom.Repo;

import com.MessageRoom.MessageRoom.Entity.RoomMate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface RoommateRepo extends JpaRepository<RoomMate,Integer> {
}
