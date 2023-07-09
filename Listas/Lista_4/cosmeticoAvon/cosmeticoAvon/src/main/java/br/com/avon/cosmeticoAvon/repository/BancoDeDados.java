package br.com.avon.cosmeticoAvon.repository;

import br.com.avon.cosmeticoAvon.models.Cosmetico;
import org.springframework.stereotype.Controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Controller
public class BancoDeDados {

    private List<Cosmetico> cosmetico = new ArrayList<>();

    public BancoDeDados() {
        cosmetico.add(new Cosmetico(1, "Shampoo Clear Men Limpeza Profunda", new BigDecimal(19.99).setScale(2, BigDecimal.ROUND_HALF_EVEN)));
        cosmetico.add(new Cosmetico(2, "Dove Sabonete Erva Doce", new BigDecimal(4.49).setScale(2, BigDecimal.ROUND_HALF_EVEN)));
    }
    public List<Cosmetico> getCosmeticos(){
        return cosmetico;
    }
    public Cosmetico getCosmeticoId(int id){
        for (Cosmetico cosmeticoAtual : cosmetico){
            if (cosmeticoAtual.getId()==id){
                return cosmeticoAtual;
            }
        }
        return null;
    }
    public List<Cosmetico> adicionarCosmetico(){

    }
}
