package com.backend.API.builder;

import com.backend.API.dto.ProdutoDto;
import com.backend.domain.entity.Pedido;
import com.backend.domain.entity.Produto;
import org.springframework.stereotype.Service;

@Service
public class ProdutoBuilder {

    private Produto produto;

    public Produto buildProduto(ProdutoDto produtoDto){

        return produto = Produto.builder()
                .nome(produtoDto.getNome())
                .valor(produtoDto.getValor())
                .build();
    }

}
