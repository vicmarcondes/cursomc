package br.com.marcondes.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.marcondes.cursomc.domain.Pedido;

@Repository								 
public interface PedidoRepository extends JpaRepository<Pedido, Integer>{

}
