public class Treinador{
    public int id: 1;
    public String nome: "Ash";
    public Pokemons pokemons;
}

public class Pokemons{

    public List<Pokemons> pokemons = new ArrayList<>();
    public int id;
    public String nome;

    public Pokemons(int id, String nome){
        this.id = id;
        this.nome = nome;
    }
    public List<Pokemons> getAll(){
        pokemons.add(new Pokemons(1, "Pikachu"));
        pokemons.add(new Pokemons(2, "Charizard"));
        pokemons.add(new Pokemons(3, "Squirtle"))

    }
}