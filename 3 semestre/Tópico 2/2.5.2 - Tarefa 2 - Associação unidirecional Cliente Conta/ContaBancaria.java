package tarefa252;

public class ContaBancaria{
	   private int numero;
	   private int agencia;
	   private double saldo;
	   private double limite;
	   private Cliente titular;
	   
	   
	 
	   
	   public ContaBancaria(int numero, int agencia){
	       setNumero(numero);
	       setAgencia(agencia);
	   }
	   
	   
	    public void abrirConta(Cliente cliente, double saldo, double limite){
	       setTitular(cliente);
	       setSaldo(saldo);
	       setLimite(limite);
	   }
	   
	   //                                      Sets!
	   public void setNumero(int numero){
	       this.numero = numero;
	   }
	   
	   
	   public void setAgencia(int agencia){
	       this.agencia = agencia;
	   }
	   
	   
	   public void setSaldo(double saldo){
	       this.saldo = saldo;
	   }
	   
	   public void setLimite(double limite){
	       this.limite = limite;
	   }
	   
	   public void setTitular(Cliente cliente){
	       this.titular = cliente; 
	   }
	   
	   
	   //                                       Gets!
	   public int getNumero(){
	       return numero;
	   }
	   
	   
	   public int getAgencia(){
	       return agencia;
	   }
	   
	   
	   public double getSaldo(){
	       return saldo;
	   }
	   
	   
	   public double getLimite(){
	       return limite;
	   }
	   public Cliente getTitular(){
	       return titular;
	   }
	   
	   public void depositar(double valor){
	       this.saldo += valor;
	   }
	   
	   public void sacar(double valor){
	       this.saldo -= valor;
	   }
	   
	   
	   public String mostrarSaldo(){
	         return "Saldo da conta: " + numero + " e de R$ " + saldo; 
	    }
	    
	   
	   
	}

