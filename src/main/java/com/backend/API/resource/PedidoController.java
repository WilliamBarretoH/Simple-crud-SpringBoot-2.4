package com.backend.API.resource;


import com.backend.API.builder.PedidoBuilder;
import com.backend.API.dto.PedidoDto;
import com.backend.domain.entity.Pedido;
import com.backend.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @Autowired
    private PedidoBuilder pedidoBuilder;

    @RequestMapping(value = "/create-pedido", method = RequestMethod.POST)
    public ResponseEntity createPedido(@RequestBody PedidoDto pedidoDto){

        Pedido buildPedido = pedidoBuilder.buildPedido(pedidoDto);

        Pedido pedido = pedidoService.createPedido(buildPedido);

        return new ResponseEntity(pedido, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/pedidos", method = RequestMethod.GET)
    public ResponseEntity<List<Pedido>> listPedidos(){

        return new ResponseEntity<List<Pedido>>(pedidoService.listPedidos(), HttpStatus.OK);

    }
}
