public abstract class Mamifero extends Animal{
    
    protected int volumeSom;
    
    public Mamifero(){
        super();
        this.volumeSom = 0;
    }
    
    public Mamifero(int produzirSom, int volumeSom){
        super(produzirSom);
        this.volumeSom = volumeSom;
    }
    
    public int getVolumeSom(){
        return this.volumeSom;
    }
    
    public void setVolumeSom (int alturaVoo){
        this.volumeSom = volumeSom;
    }
    
    public String mover(){
        return "ANIMAL: DESLOCOU " + getTamanhoPasso() + " ANDANDO";
    }

    public String produzirSom(){
        return "MAMIFERO: VOLUME SOM: " + volumeSom + " SOM";
    }

}