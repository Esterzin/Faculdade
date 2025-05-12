public class AdministradorBD extends Funcionario
{
    private String bancoDeDados ;
    private int formacao;
    
    public void setBancoDeDados (String bancoDeDados )
    {
        this.bancoDeDados  = bancoDeDados ;   
    }
    
    public String getBancoDeDados ()
    {
        return this.bancoDeDados ;   
    }
    
    public void setFormacao(int formacao)
    {
        this.formacao = formacao;   
    }
    
    public int getFormacao()
    {
        return this.formacao;   
    }
    
    public void aumentaSalario()
    {
        if (this.getFormacao() == 1){
            this.setSalario(this.getSalario() * 1.05);
        }
    }
    
    public AdministradorBD()
    {
        super();
        this.setBancoDeDados("");
        this.setFormacao(0);
    }
    
    public AdministradorBD(String nome, int numeroDependentes, String endereco, int idade, double salario, String bancoDeDados, int formacao)
    {
        super(nome, numeroDependentes, endereco, idade, salario);
        this.setBancoDeDados(bancoDeDados);
        this.setFormacao(formacao);
    }
}