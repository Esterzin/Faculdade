public  class ContaCorrente implements ISaldo{
    
    private double saldo;
    private double taxaServico;
    
    public ContaCorrente(){
       
        this.saldo = 0;
        this.taxaServico = 0;
    }
    
    public ContaCorrente (double saldo, double taxaServico){
       
        this.saldo = saldo;
        this.taxaServico = taxaServico;
    }
    
    public double getSaldo(){
        return (this.saldo - this.taxaServico);
    }
    
    public void setSaldo (double saldo){
        this.saldo = saldo;
    }

    public double getTaxaServico(){
        return taxaServico;
    }

    public void setTaxaServico (double TaxaServico){
        this.taxaServico = taxaServico;
    }

    public void setDeposito(double deposito){
        this.saldo += deposito;
    }  

}