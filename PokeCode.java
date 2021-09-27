public class PokeCode {
    
    private String nome;
    private String tipo;
    private int level;
    private int vida = 200;
    private int ataque;
    private int defesa;
    
    public PokeCode(String nome, String tipo, int level){
        this.nome = nome;
        this.tipo = tipo;
        this.level = level;
                
        calculaAtributos();
        calculaBonus();
    }
    
    // método Get
    public int getVida(){
        return this.vida;
    }
    
    public int getAtaque(){
        return this.ataque;
    }
    
    public int getDefesa(){
        return this.defesa;
    }
    
    // método Set
    public void setNome(String nome){
        this.nome = nome;
    }
    
        
    private void calculaAtributos(){
        switch(tipo){
            case "Eletrico":
                vida = vida - 20;
                ataque = 50;
                defesa = 20;
            break;
            
            case "Terra":
                vida = vida - 5;
                ataque = 20;
                defesa = 35;
            break;
            
            case "Agua":
                vida = vida + 20;
                ataque = 15;
                defesa = 40;
            break;
            
            case "Ar":
                vida = vida + 25;
                ataque = 40;
                defesa = 20;
            break;
        }
    }
    
    private void calculaBonus(){
        
        vida = vida + (level / 2);
        ataque = ataque + (level / 3);
        defesa = defesa + (level / 4);
        
    }   
       
    public void imprimiPokemon(){
        
        System.out.println(
                "Nome: " + nome + " | " + 
                "Tipo: " + tipo + " | " + 
                "Level: " + level + " | " + 
                "Vida: " + vida + " | " +
                "Ataque: " + ataque + " | " +
                "Defesa: " + defesa + "\n");
        
    }   
    
}