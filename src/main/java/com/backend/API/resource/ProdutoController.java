package com.backend.API.resource;

import com.backend.API.builder.ProdutoBuilder;
import com.backend.API.dto.ProdutoDto;
import com.backend.domain.entity.Produto;
import com.backend.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @Autowired
    private ProdutoBuilder produtoBuilder;

    @RequestMapping(value = "/produtos", method = RequestMethod.GET)
    public ResponseEntity<List<Produto>> listProdutos(){
        return new ResponseEntity<List<Produto>>(produtoService.listProdutos(), HttpStatus.OK);
    }

    @RequestMapping(value = "/create-produto", method = RequestMethod.POST)
    public ResponseEntity createProduto(@RequestBody ProdutoDto produtoDto){
        Produto buildProduto = produtoBuilder.buildProduto(produtoDto);

        Produto produto = produtoService.createProduto(buildProduto);
        return new ResponseEntity(produto, HttpStatus.CREATED);
    }

}
