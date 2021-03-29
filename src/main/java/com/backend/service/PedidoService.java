package com.backend.service;

import com.backend.domain.entity.Pedido;

import java.util.List;
import java.util.Optional;

public interface PedidoService {

    Pedido createPedido(Pedido pedido);

    List<Pedido> listPedidos();

    Optional<Pedido> findById(Long id);
}
