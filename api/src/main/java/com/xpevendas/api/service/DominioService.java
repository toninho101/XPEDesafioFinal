package com.xpevendas.api.service;

import com.xpevendas.api.model.Cliente;
import com.xpevendas.api.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DominioService {

    private final ClienteRepository clienteRepository;

    @Autowired
    public DominioService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> listarTodos() {
        return clienteRepository.findAll();
    }

    public Optional<Cliente> buscarPorId(Long id) {
        return clienteRepository.findById(id);
    }

    public List<Cliente> buscarPorNome(String nome) {
        return clienteRepository.findByNomeContainingIgnoreCase(nome);
    }

    public Cliente salvar(Cliente cliente) {
        // Validações adicionais podem ser feitas aqui
        return clienteRepository.save(cliente);
    }

    public void excluir(Long id) {
        clienteRepository.deleteById(id);
    }

    public long contarClientes() {
        return clienteRepository.count();
    }

    public boolean emailExistente(String email) {
        return clienteRepository.existsByEmail(email);
    }
}