public class Triangulo implements ITriangulo{
    //Atributos
    private double base;
    private double altura;

    //Construtores
    public Triangulo() {
        setBase(0);
        setAltura(0);
    }
    
    public Triangulo(double base, double altura) {
        setBase(base);
        setAltura(altura);
    }

    //gets e sets
    public double getAltura() {
        return altura;        
    }

    public double getBase() {
        return base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    //Calcula a área
    public double getArea() {
        return(base*altura)/2;
    }

}
