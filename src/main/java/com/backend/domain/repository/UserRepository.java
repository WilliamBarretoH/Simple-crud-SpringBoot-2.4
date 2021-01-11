package com.backend.domain.repository;


import com.backend.domain.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;

//interface responsavel pelas operacoes com o banco
public interface UserRepository extends JpaRepository<User, Long> {


}
