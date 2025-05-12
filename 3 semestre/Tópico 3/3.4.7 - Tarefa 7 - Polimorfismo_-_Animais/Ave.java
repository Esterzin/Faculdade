public abstract class Ave extends Animal{
    
    protected int alturaVoo;
    
    public Ave(){
        super();
        this.alturaVoo = 0;
    }

    public Ave(int tamanhoPasso, int alturaVoo){
        super(tamanhoPasso);
        this.alturaVoo = alturaVoo;
    }
    
    public int getAlturaVoo(){
        return this.alturaVoo;
    }
    
    public void setAlturaVoo (int alturaVoo){
        this.alturaVoo = alturaVoo;
    }
    
    public String voar(){
        return "ANIMAL: DESLOCOU " + getTamanhoPasso() + " VOANDO";
    }

    public String produzirSom(){
        return "AVE: SOM";
    }

}