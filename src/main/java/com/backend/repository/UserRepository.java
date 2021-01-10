package com.backend.repository;

import com.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

//interface responsavel pelas operacoes com o banco
public interface UserRepository extends JpaRepository<User, Long> {


}
