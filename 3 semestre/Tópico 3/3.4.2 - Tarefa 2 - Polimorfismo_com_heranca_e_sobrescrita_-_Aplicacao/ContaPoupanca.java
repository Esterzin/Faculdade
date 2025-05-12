public class ContaPoupanca extends Conta{
    private double juros;
    
    
    //constr com parâmetros
    public ContaPoupanca(){
        super();
        this.juros = 0;
    }
    
    //constr sem parâmetros
    public ContaPoupanca (double saldo, double juros){
        super(saldo);
        this.juros = juros;
    }
    
    
    //gets e sets
    public double getJuros(){
        return juros;
    }
    
    public void setJuros(double juros){
        this.juros = juros;
    }

    public double getSaldo(){
        return super.getSaldo() +  this.juros;
    }
    
    public void setDeposito(double deposito) {
        super.setSaldo(super.getSaldo()+deposito);
    }    
        
}