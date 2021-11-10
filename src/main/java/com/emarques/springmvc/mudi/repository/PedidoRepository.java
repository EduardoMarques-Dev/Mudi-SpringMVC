package com.emarques.springmvc.mudi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emarques.springmvc.mudi.model.Pedido;
import com.emarques.springmvc.mudi.model.StatusPedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
	
	List<Pedido> findAllByStatus(StatusPedido status);
}
