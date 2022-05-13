package com.example.algamoney.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.algamoney.api.model.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

	Pessoa save(Optional<Pessoa> pessoaSalva);

	Pessoa findOne(Long codigo);

	Pessoa delete(Long codigo);

}
