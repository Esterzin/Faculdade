public class Triangulo extends FiguraGeometrica{
    
    private double base;
    private double altura;
    
    //construtor sem parâmetro
    public Triangulo(){
        this.base = 0;
        this.altura = 0;
        
    }
    
    //construtor com parâmetro
    public Triangulo(String cor, double base, double altura){
        super(cor); 
;       this.base = base;
        this.altura = altura;
    }
    
    public double getBase(){
        return base;
    }
    
    public void setBase(double base){
        this.base = base;
    }

    public double getAltura(){
        return altura;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getArea(){
        return ((getBase() * getAltura())/2);
    }

}