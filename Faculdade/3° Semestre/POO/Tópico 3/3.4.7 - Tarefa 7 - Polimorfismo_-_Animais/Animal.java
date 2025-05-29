public abstract class Animal {
    
    private int tamanhoPasso;
    
    public Animal(){
        this.tamanhoPasso = 0;
    }
    
    public Animal(int tamanhoPasso) {
        this.tamanhoPasso = tamanhoPasso;
    }


    public int getTamanhoPasso(){
        return this.tamanhoPasso;
    }
    
    public void setTamanhoPasso(int tamanhoPasso){
        this.tamanhoPasso = tamanhoPasso;
    }

    public String mover(){
        return "ANIMAL: DESLOCOU " + tamanhoPasso;
    }
    
    public abstract String produzirSom();

}