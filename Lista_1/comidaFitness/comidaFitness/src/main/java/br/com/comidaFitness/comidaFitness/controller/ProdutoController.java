package br.com.comidaFitness.comidaFitness.controller;

import br.com.comidaFitness.comidaFitness.models.Produto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("produtos")
public class ProdutoController {
    private List<Produto> produto = new ArrayList<>();

    public ProdutoController(){
        produto.add(new Produto(3, "Lasanha de abobrinha e berinjela ao ragu de frango", 18.70));
        produto.add(new Produto(4, "Frango desfiado e tomate com cream-cheese e cubos de abóbora", 16.70));
        produto.add(new Produto(5, "Filé de frango grelhado com molho de espinafre e brócolis", 16.70));
    }
    @GetMapping()
    public List<Produto> getAllProdutos(){
        return produto;
    }

    @GetMapping("/{codigoDeBarras}")
    public Produto getCodigo (@PathVariable int codigoDeBarras){
        for(Produto produto : produto){ //Rever um pouco.
            if(produto.getCondigoDeBarras() == codigoDeBarras){
                return produto;
            }
        }
        return null;
    }
    @PostMapping()
    public String adicionarProduto (@RequestBody Produto produto){
        for (int i = 0; i < this.produto.size(); i++) {
            if(this.produto.get(i).getCondigoDeBarras() != produto.getCondigoDeBarras()){
                this.produto.add(produto);
                return "O produto " + produto.getNome() +  "foi adicionado ao estoque!";
            }
        }
        return "Produto já é existente e não deve realizar a inclusão";

    }
}
