package tarefa259;

//Classe Tecnico herda de Pessoa
class Tecnico extends Pessoa {
 protected String cargo;
 
 
 public Tecnico(String nome, int idade, String cargo) {
     super(nome, idade);
     this.cargo = cargo;
 }

 public void exibirCargo() {
     System.out.println("Cargo: " + cargo);
 }
}

