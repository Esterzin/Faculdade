package tarefa253;




public class Cliente {
    
    private String nome;
    private String cpf;
    private int idade;
    private int qtdeContas;
    private ContaBancaria[] contas; 
        
    public Cliente(){
        this.nome = "";
        this.cpf = "";
        this.idade = 0;
        this.qtdeContas = 0;
        this.contas = new ContaBancaria[5];
        
    }
    
    public Cliente(String nome, String cpf, int idade){
        setNome(nome);
        setCpf(cpf);
        setIdade(idade);
    }
    
    
    //----------------------------------------Sets
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setQtdeContas(int qtdeContas){
        this.qtdeContas = qtdeContas;
    }

    public void setContas(ContaBancaria[] contas){
        this.contas = contas;
    }
    //----------------------------------------Gets
    public String getNome(){
        return nome;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public int getQtdeContas(){
        return qtdeContas;
    }
    
    public ContaBancaria[] getContas(){
        return contas;
    }
    
    
    //vincular conta
    public void vincularConta(ContaBancaria conta){
        contas[qtdeContas] = conta;
        int novo = qtdeContas + 1;
        setQtdeContas(novo);
    }
    
    //get total contas 
    public double getTotalContas(){
       double total = 0;
    for (ContaBancaria conta : contas) {
        if (conta != null) { //checar pra ver se o objeto conta existe
            total += conta.getSaldo();
        }
    }
    return total;
    }
        
}
