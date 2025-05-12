final public class Circulo extends FiguraGeometrica {

    private double raio;

    //construtor sem parâmetro
    public Circulo(){
        this.raio = 0;
        
    }
    
    //construtor com parâmetro
    public Circulo(String cor, double raio){
        super(cor); 
        this.raio = raio;
    }
    
    public double getRaio(){
        return raio;
    }
    
    public void setRaio(double raio){
        this.raio = raio;
    }

    public double getArea(){
        return (Math.PI * getRaio() * getRaio());
    }

}