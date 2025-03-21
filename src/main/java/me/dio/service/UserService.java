package me.dio.service;

import me.dio.domain.model.User;

public interface UserService {
    // metodo que implementa o usuario
    User findById(Long id);
    // outro metodo que vai importar User que vai retornar creat
    User create(User userToCreate);
}
