package tarefa257;

public class Funcionario {
    //lembrar de trocar private pra protected pra isso funcionar
    protected double salarioBase;

    public Funcionario(double salarioBase) {
        this.salarioBase = salarioBase;
    }   

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}