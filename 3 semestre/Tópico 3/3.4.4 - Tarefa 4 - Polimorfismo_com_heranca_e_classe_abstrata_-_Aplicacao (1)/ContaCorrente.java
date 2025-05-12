public  class ContaCorrente extends Conta{
    
    private double saldo;
    private double taxaServico;
    
    public ContaCorrente(){
        super();
        this.saldo = 0;
        this.taxaServico = 0;
    }
    
    public ContaCorrente (String nome, double saldo, double taxaServico){
        super(nome);
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