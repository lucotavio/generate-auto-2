package com.luciano.curso.main;

import com.luciano.curso.entidade.Cliente;
import com.luciano.curso.repository.ClienteRepository;
import java.time.LocalDate;
import java.time.Month;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class SalvarClienteMain {

    public static void main(String[] args) {

        Cliente cliente = Cliente.builder()
                .nome("Luciano")
                .cpf("047.276.406-35")
                .build();

        LocalDate dataNascimento = LocalDate.of(1972, Month.OCTOBER, 2);
        
        ClienteRepository clienteRepository = new ClienteRepository();
        clienteRepository.salvar(cliente);
        
        Cliente clientePesquisado = clienteRepository.pesquisarPorId(1);
        System.out.println("\n\n\n");
        System.out.println(clientePesquisado);

        
    }

    

}
