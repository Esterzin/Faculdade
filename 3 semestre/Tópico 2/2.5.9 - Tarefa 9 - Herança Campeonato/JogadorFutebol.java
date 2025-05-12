package tarefa259;

//Classe JogadorFutebol herda de Jogador
class JogadorFutebol extends Jogador {
 private int numeroCamisa;

 public JogadorFutebol(String nome, int idade, String posicao, int numeroCamisa) {
     super(nome, idade, posicao);
     this.numeroCamisa = numeroCamisa;
 }

 public void exibirNumeroCamisa() {
     System.out.println("Número da camisa: " + numeroCamisa);
 }
}