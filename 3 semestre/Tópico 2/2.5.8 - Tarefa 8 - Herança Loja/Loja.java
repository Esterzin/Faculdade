package tarefa258;

//Classe Loja como classe base
class Loja {
 protected String nome;
 protected String endereco;
 
 public Loja(String nome, String endereco) {
     this.nome = nome;
     this.endereco = endereco;
 }

 public void comprarNaLoja() {
     System.out.println("Você comprou algo na loja: " + nome) ;
 }

 public void receberProduto() {
     System.out.println("Produto recebido na loja: " + nome);
 }
}
