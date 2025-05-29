public class Analista extends Funcionario
{
    private String tecnica;
    private int experiencia;
    
    public void setTecnica(String tecnica)
    {
        this.tecnica = tecnica;   
    }
    
    public String getTecnica()
    {
        return this.tecnica;   
    }
    
    public void setExperiencia(int experiencia)
    {
        this.experiencia = experiencia;   
    }
    
    public int getExperiencia()
    {
        return this.experiencia;   
    }
    
    public void aumentaSalario()
    {
        if (this.getNumeroDependentes() > 2 && this.getExperiencia() > 3){
            this.setSalario(this.getSalario() * 1.1);
        }
    }
    
    public Analista()
    {
        super();
        this.setTecnica("");
        this.setExperiencia(0);
    }
    
    public Analista(String nome, int numeroDependentes, String endereco, int idade, double salario, String tecnica, int experiencia)
    {
        super(nome, numeroDependentes, endereco, idade, salario);
        this.setTecnica(tecnica);
        this.setExperiencia(experiencia);
    }
}