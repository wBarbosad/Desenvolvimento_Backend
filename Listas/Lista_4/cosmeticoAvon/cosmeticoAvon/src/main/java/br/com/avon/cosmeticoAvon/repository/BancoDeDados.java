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
    public String adicionarCosmetico(Cosmetico cosmetico){
        for (Cosmetico cosmeticoAtual : this.cosmetico){
            if (cosmeticoAtual.getId()==cosmetico.getId()){
                return "Impossível cadastrar! cosmético já consta no banco de dados";
            }
        }
        this.cosmetico.add(cosmetico);
        return "Cosmético: "+ cosmetico.getNome() + " cadastrado com sucesso!";
    }
    public String removerCosmetico(int id){
        for (Cosmetico cosmeticoAtual : cosmetico){
            if(cosmeticoAtual.getId()==id){
                String mensagem = "O cosmético " + cosmeticoAtual.getNome() + " foi deletado com sucesso!";
                cosmetico.remove(cosmeticoAtual);
                return mensagem;
            }
        }
        return "Cosmético inexistente";
    }
}
