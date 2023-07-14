package br.com.salao.salao.service;

import br.com.salao.salao.model.Sala;
import br.com.salao.salao.repository.BancoDeDados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaoService {

    @Autowired
    private BancoDeDados banco;
    public List<Sala> getSalas(){
        return banco.salas();
    }
    public String alugar(Sala salas){
        return banco.atualizarSalas(salas);
    }
}
