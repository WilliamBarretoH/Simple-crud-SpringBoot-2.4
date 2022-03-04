package com.backend.API.builder;

import com.backend.API.dto.ProdutoDto;
import com.backend.domain.entity.Produto;
import org.springframework.stereotype.Service;

@Service
public class ProdutoBuilder {

    public Produto buildProduto(ProdutoDto produtoDto){

        return Produto.builder()
                .nome(produtoDto.getNome())
                .valor(produtoDto.getValor())
                .quantidade(produtoDto.getQuantidade())
                .build();
    }

}
