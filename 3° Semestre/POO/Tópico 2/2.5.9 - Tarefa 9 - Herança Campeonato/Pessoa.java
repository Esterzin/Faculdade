package tarefa259;

//Classe base Pessoa
class Pessoa {
 protected String nome;
 protected int idade;
 
 public Pessoa(String nome, int idade) {
     this.nome = nome;
     this.idade = idade;
 }

 public void exibirInformacoes() {
     System.out.println("Nome: " + nome);
     System.out.println("Idade: " + idade);
 }
}
