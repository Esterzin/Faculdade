package tarefa254;

public class Motor {
    private String tipo;
    private double capacidade;
    
    public Motor(){
        this.tipo = "";
        this.capacidade = 0;
    }
    
    public Motor(String tipo, double capacidade){
        this.tipo = tipo;
        this.capacidade = capacidade;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    
    public double getCapacidade(){
        return capacidade;
    }
    
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public void setCapacidade(double capacidade){
        this.capacidade = capacidade;
    }
    
}