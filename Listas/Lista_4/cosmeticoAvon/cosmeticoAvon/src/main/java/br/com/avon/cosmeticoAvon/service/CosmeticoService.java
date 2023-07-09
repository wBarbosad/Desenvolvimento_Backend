package br.com.avon.cosmeticoAvon.service;

import br.com.avon.cosmeticoAvon.models.Cosmetico;
import br.com.avon.cosmeticoAvon.repository.BancoDeDados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CosmeticoService {

    @Autowired
    BancoDeDados bancoDeDados;
    public List<Cosmetico> getDados(){
        return bancoDeDados.getCosmeticos();
    }
    public Cosmetico getProduto(int id){
        return bancoDeDados.getCosmeticoId(id);
    }
}
