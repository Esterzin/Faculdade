public class Desenvolvedor extends Funcionario
{
    private String area;
    private int experiencia;
    
    public void setArea(String area)
    {
        this.area = area;   
    }
    
    public String getArea()
    {
        return this.area;   
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
        if (this.getNumeroDependentes() < 2 && this.getExperiencia() > 5){
            this.setSalario(this.getSalario() * 1.15);
        }
    }
    
    public Desenvolvedor()
    {
        super();
        this.setArea("");
        this.setExperiencia(0);
    }
    
    public Desenvolvedor(String nome, int numeroDependentes, String endereco, int idade, double salario, String area, int experiencia)
    {
        super(nome, numeroDependentes, endereco, idade, salario);
        this.setArea(area);
        this.setExperiencia(experiencia);
    }
}