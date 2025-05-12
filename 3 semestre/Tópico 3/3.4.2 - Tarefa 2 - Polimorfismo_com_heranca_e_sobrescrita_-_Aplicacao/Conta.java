public class Conta {
    
    private double saldo;
    
    //construtor com parâmetros 
    public Conta(){
        this.saldo = 0;
    }
    
    //construtor sem parâmetros
    public Conta(double saldo){
        this.saldo = saldo;
    }
    
    //gets e seus
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
}