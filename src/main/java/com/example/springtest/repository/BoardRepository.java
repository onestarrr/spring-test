package com.example.springtest.repository;

import com.example.springtest.domain.Board;
import com.example.springtest.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
    Board findByUser(User user);
}
