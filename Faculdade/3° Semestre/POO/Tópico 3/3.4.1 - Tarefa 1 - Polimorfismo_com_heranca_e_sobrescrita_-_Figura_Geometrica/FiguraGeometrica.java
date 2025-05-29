public class FiguraGeometrica{
    
    //private String nome;
    private String cor;
    
    public FiguraGeometrica(){
        this.cor = "";
    }
    
    public FiguraGeometrica(String cor){
        this.cor = cor;
   }

    public String getCor(){
        return cor;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public double getArea(){
        return 0;
    }
    
}