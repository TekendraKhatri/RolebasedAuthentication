package com.springboot.mvcrolebasedspringsecurity.Repository;

import com.springboot.mvcrolebasedspringsecurity.entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository  extends JpaRepository<Message , Integer> {
}
