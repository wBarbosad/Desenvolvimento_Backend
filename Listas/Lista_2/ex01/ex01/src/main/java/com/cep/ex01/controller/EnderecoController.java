package com.cep.ex01.controller;

import com.cep.ex01.model.Endereco;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

    @GetMapping("/{cep}")
    public Endereco getEndereco(@PathVariable String cep) {
        String url = "https://viacep.com.br/ws/" + cep + "/json";
        RestTemplate restTemplate = new RestTemplate();
        Endereco endereco = restTemplate.getForObject(url, Endereco.class);
        /*
            Endereco.class é o tipo de retorno ao qual desejo.  (Deve ser igual ao que queremos receber);
            Se for uma lista, o retorno desejado deve ser ArrayList.class;
         */
        return endereco;
    }
}
