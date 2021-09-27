class Main {
  public static void main(String[] args) {

    int vidaMeuPokemon;
        int vidaOutroPokemon;
        
        PokeCode meuPokemon = new PokeCode("Pikachu", "Eletrico", 30);
        PokeCode outroPokemon = new PokeCode("Voltorb", "Eletrico", 90);
                           
        meuPokemon.imprimiPokemon();
        outroPokemon.imprimiPokemon();

        
        vidaMeuPokemon = meuPokemon.getVida();
        vidaOutroPokemon = outroPokemon.getVida();
        
        if(vidaMeuPokemon > vidaOutroPokemon){
            System.out.println("Eu ganhei");
        } else{
            System.out.println("Eu perdi");
        }
  }
  }
}