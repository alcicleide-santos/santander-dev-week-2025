package me.dio.domain.model.repository;

import me.dio.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// aqui já temos um repositorio com spring JPA com todas as operações basicas
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    //aqui verifica se o AccontNumber já existe, cria-se um metodo boolean, e como isso acontece, ele verifica dentro
    // do User se acessando o Account e olhando para o number que é dentro de outra tabela se existe
    // um usuario com os mesmos valores, tentando ser inserido ele lançaria uma excessão. ou seja ele faz um
    // join entre as tabelas para verificar e dar a excessão.
    boolean existsByAccountNumber(String accountNumber);
}
