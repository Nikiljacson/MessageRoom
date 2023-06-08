package com.MessageRoom.MessageRoom.Repo;

import com.MessageRoom.MessageRoom.Entity.ChatRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface ChatRoomRepo extends JpaRepository<ChatRoom,Integer> {
}
