package com.backend.API.builder;

import com.backend.API.dto.PedidoDto;
import com.backend.domain.entity.Pedido;
import org.springframework.stereotype.Service;

@Service
public class PedidoBuilder {

    public Pedido buildPedido(PedidoDto pedidoDto) {

        return Pedido.builder()
                .id_produtos(pedidoDto.getIds_produtos())
                .build();
    }
}
