package com.backend.API.builder;

import com.backend.API.dto.PedidoDto;
import com.backend.API.dto.ProdutoDto;
import com.backend.domain.entity.Pedido;
import com.backend.domain.entity.Produto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoBuilder {

    private Pedido pedido;

    public Pedido buildPedido(PedidoDto pedidoDto) {

        return pedido = Pedido.builder().produtos(pedidoDto.getProdutos()).build();
    }
}
