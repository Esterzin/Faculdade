package tarefa259;

//Classe Jogador herda de Pessoa
class Jogador extends Pessoa {
 protected String posicao;
 
 public Jogador(String nome, int idade, String posicao) {
     super(nome, idade);
     this.posicao = posicao;
 }

 public void exibirPosicao() {
     System.out.println("Posição: " + posicao);
 }
}
