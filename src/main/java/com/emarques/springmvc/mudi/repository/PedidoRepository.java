package com.emarques.springmvc.mudi.repository;

import com.emarques.springmvc.mudi.model.Pedido;
import com.emarques.springmvc.mudi.model.StatusPedido;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
	
	List<Pedido> findAllByStatus(StatusPedido status);
}
