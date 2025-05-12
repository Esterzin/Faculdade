public class ContaPoupanca implements ISaldo{
    
    private double saldo;
    private double juros;
    
    
    //constr com parâmetros
    public ContaPoupanca(){
        
        this.saldo = 0;
        this.juros = 0;
    }
    
    //constr sem parâmetros
    public ContaPoupanca (double saldo, double juros){
        
        this.saldo = saldo;
        this.juros = juros;
    }
    
   
    //gets e sets
    public double getSaldo(){
        return (this.saldo + this.juros);
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getJuros(){
        return juros;
    }
    
    public void setJuros(double juros){
        this.juros = juros;
    }

    
    public void setDeposito(double deposito){
        this.saldo += deposito;
    }    
        
}