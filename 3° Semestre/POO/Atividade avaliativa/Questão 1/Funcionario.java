public abstract class Funcionario
{
    private String nome;
    private int numeroDependentes;
    private String endereco;
    private int idade;
    private double salario;
    
    
    public Funcionario()
    {
        setNome("");
        setNumeroDependentes(0);
        setEndereco("");
        setIdade(0);
        setSalario(0);
    }
    
    public Funcionario(String nome, int numeroDependentes, String endereco, int idade, double salario)
    {
        setNome(nome);
        setNumeroDependentes(numeroDependentes);
        setEndereco(endereco);
        setIdade(idade);
        setSalario(salario);
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;   
    }
    
    public String getNome()
    {
        return this.nome;   
    }
    
    public void setNumeroDependentes(int numeroDependentes)
    {
        this.numeroDependentes = numeroDependentes;   
    }
    
    public int getNumeroDependentes()
    {
        return this.numeroDependentes;   
    }
    
    public void setEndereco(String endereco)
    {
        this.endereco = endereco;   
    }
    
    public String getEndereco()
    {
        return this.endereco;   
    }
    
    public void setIdade(int idade)
    {
        this.idade = idade;   
    }
    
    public int getIdade()
    {
        return this.idade;   
    }
    
    public void setSalario(double salario)
    {
        this.salario = salario;   
    }
    
    public double getSalario()
    {
        return this.salario;   
    }
    
    public abstract void aumentaSalario();
}