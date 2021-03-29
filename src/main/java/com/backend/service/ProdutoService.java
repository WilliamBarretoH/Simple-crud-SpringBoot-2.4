package com.backend.service;

import com.backend.domain.entity.Produto;

import java.util.List;
import java.util.Optional;

public interface ProdutoService {

    Produto createProduto(Produto produto);

    List<Produto> listProdutos();

    Optional<Produto> findById(Long id);
}
