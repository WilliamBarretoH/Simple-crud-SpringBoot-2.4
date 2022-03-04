package com.backend.service.implementation;

import com.backend.domain.entity.Pedido;
import com.backend.domain.entity.Produto;
import com.backend.domain.repository.PedidoRepository;
import com.backend.domain.repository.ProdutoRepository;
import com.backend.service.PedidoService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

@Service
public class PedidoServiceImplementation implements PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    private static final Logger LOGGER = LogManager.getLogger(PedidoServiceImplementation.class);

    @Autowired
    private ProdutoRepository produtoRepository;

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Pedido createPedido(Pedido pedido) {
        try{
            pedido = pedidoRepository.save(pedido);
        }catch (Exception e){
            LOGGER.error(e.getMessage());
        }
        return pedido;
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
