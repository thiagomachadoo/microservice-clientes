package io.github.thiagomachadoo.microserviceclientes.application.representation;

import io.github.thiagomachadoo.microserviceclientes.domain.Cliente;
import lombok.Data;

@Data
public class ClienteSaveRequestDTO {

    private String cpf;
    private String nome;
    private Integer idade;
    public Cliente toModel(){
        return new Cliente(nome, idade, cpf);
    }
}
