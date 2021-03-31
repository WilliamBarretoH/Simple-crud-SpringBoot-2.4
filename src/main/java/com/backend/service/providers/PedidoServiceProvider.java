package com.backend.service.providers;

import com.backend.domain.entity.Pedido;
import com.backend.domain.entity.Produto;
import com.backend.domain.repository.PedidoRepository;
import com.backend.domain.repository.ProdutoRepository;
import com.backend.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoServiceProvider implements PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    @Override
    public Pedido createPedido(Pedido pedido) {

        List<Produto> produtos = produtoRepository.findAll();



        return pedidoRepository.save(pedido);
    }

    @Override
    public List<Pedido> listPedidos() {
        return pedidoRepository.findAll();
    }

    @Override
    public Optional<Pedido> findById(Long id) {
        return pedidoRepository.findById(id);
    }
}
