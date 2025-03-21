package me.dio.service.impl;

import me.dio.domain.model.User;
import me.dio.domain.model.repository.UserRepository;
import me.dio.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

//um pilar da orientação a objeto, que é o encapsulamento, que serve para vc não expor a sua interface de uso.
// aqui também por uma questão do espring, queremos usar ele como um service, por isso colocamos a anotação @Service.
@Service
public class UserServiceImpl implements UserService {
    // alem disso os atributos que vc precisa injetar via spring vc pode definir como como a seguir
    private final UserRepository userRepository;
    // aqui vc pode criar um costrutor de UserServiceImpl para poder injetar esse UserRepository via construtor.

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;// isso vai fazer que o spring entenda que para criar esse componente de
        // seviço ele precisa injetar o UserRepository.
    }

    // agora vamos as facilidades de usar o spring para buscar um usuário pelo ID.
    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userToCreate.getId() != null && userRepository.existsById(userToCreate.getId())){
            throw new IllegalArgumentException("This User ID already exists.");
        }
        return userRepository.save(userToCreate);


    }

}