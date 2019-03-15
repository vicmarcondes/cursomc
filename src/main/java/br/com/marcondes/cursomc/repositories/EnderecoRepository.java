package br.com.marcondes.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.marcondes.cursomc.domain.Endereco;

@Repository								 
public interface EnderecoRepository extends JpaRepository<Endereco, Integer>{

}
