package io.github.thiagomachadoo.microserviceclientes.infra.repository;

import io.github.thiagomachadoo.microserviceclientes.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    Optional<Cliente> findByCpf(String cpf);
}
