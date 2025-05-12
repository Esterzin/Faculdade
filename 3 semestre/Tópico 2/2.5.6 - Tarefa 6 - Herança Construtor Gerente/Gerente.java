package tarefa256;

public class Gerente extends Funcionario{
    
    private double abono;

    public Gerente(double salarioBase, double abono) {
        super(salarioBase);
        this.salarioBase = salarioBase;
        this.abono = abono;
    }

    public double getAbono() {
        return abono;
    }

    public void setAbono(double abono) {
        this.abono = abono;
    }   
}

