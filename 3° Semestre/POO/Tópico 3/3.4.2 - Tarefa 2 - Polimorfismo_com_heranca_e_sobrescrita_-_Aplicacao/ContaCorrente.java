public class ContaCorrente extends Conta{
    private double taxaServico;
    
    
    //constr com parâmetros
    public ContaCorrente(){
        super();
        this.taxaServico = 0;

    }
    
    //constr sem parâmetros
    public ContaCorrente (double saldo, double taxaServico){
        super(saldo);
        this.taxaServico = taxaServico;
    }
    
    
    //gets e sets
    public double getTaxaServico(){
        return taxaServico;
    }
    
    public void setTaxaServico(double taxaServico){
        this.taxaServico = taxaServico;
    }

    public double getSaldo(){
        return super.getSaldo() - this.taxaServico;
    }
    
    public void setDeposito(double deposito) {
        super.setSaldo(super.getSaldo()+deposito);
    }   
}