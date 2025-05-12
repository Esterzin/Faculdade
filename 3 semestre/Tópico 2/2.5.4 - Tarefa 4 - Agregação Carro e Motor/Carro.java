package tarefa254;

public class Carro{
	   private String modelo;
	   private Motor motorizacao;
	   
	   
	   
	   public Carro(String modelo, Motor motor){
	        this.modelo = modelo;
	        this.motorizacao = motor;
	   }
	   
	   public String getModelo(){
	       return modelo;
	   }
	   
	   public Motor getMotorizacao(){
	       return motorizacao;
	   }
	   
	   
	   public void setModelo(String modelo){
	       this.modelo = modelo;
	   }
	   
	   
	   public void setMotorizacao(Motor motor){
	       this.motorizacao = motor;
	   }
	   
	   
	}

