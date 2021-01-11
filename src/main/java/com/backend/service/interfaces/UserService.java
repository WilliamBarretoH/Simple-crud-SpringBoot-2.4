package com.backend.service.interfaces;

import com.backend.domain.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> listUsers();

    Optional<User> findById(Long id);

    User saveUser(User user);
}
