package com.homiak.ex10.repository;

import com.homiak.ex10.models.TarefaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<TarefaModel, Long> {
}