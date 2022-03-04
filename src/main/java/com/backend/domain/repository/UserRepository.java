package com.backend.domain.repository;


import com.backend.domain.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//interface responsavel pelas operacoes com o banco
@Repository
public interface UserRepository extends JpaRepository<User, Long> {


}
