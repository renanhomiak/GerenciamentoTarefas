package com.homiak.ex10.service;

import com.homiak.ex10.models.TarefaModel;
import com.homiak.ex10.repository.TarefaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {

    private final TarefaRepository repository;

    public TarefaService(TarefaRepository repository) {
        this.repository = repository;
    }

    public TarefaModel salvar(TarefaModel tarefa) {
        return repository.save(tarefa);
    }

    public List<TarefaModel> listar() {
        return repository.findAll();
    }

    public Optional<TarefaModel> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}