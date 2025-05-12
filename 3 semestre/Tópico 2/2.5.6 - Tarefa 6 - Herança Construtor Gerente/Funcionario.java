package tarefa256;

public class Funcionario {
    //tem que trocar a visibilidade de private pra 
    //protected se o atributo vai ser herdado
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