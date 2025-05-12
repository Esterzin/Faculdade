public class Equacao {
    
    private double a;
    private double b;
    private double c;
    
    public Equacao(){
        this(0,0,0);
    }

    public Equacao(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    public double getDelta(){
        return ((getB() * getB()) - 4 * (getA() * getC()));
    }
    
    public double getX1(){
        return (((-1*getB()) + Math.sqrt(getDelta())) / (2 * getA()) );
    }
    
    public double getX2(){
        return (((-1*getB()) - Math.sqrt(getDelta())) / (2 * getA()) );
    }
}
