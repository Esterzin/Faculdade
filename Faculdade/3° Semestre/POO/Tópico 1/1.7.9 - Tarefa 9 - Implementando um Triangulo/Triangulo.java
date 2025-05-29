public class Triangulo {
  private double base;
  private double altura;

  public Triangulo() {
    setBase(0);
    setAltura(0);
  }

  public Triangulo(double base, double altura) {
    setBase(base);
    setAltura(altura);
  }

  public double getBase() {
    return base;
  }

  public double getAltura() {
    return altura;
  }

  public double getArea() {
    return (base * altura)/2;
  }

  public void setBase(double base) {
    this.base = base;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

}