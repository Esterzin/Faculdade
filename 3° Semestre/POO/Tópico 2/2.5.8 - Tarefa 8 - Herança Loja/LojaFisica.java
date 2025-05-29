package tarefa258;


//Classe LojaFisica herda de Loja
class LojaFisica extends Loja {
 private int numeroFuncionarios;
 
 public LojaFisica(String nome, String endereco, int numeroFuncionarios) {
     super(nome, endereco);
     this.numeroFuncionarios = numeroFuncionarios; 
     
 }

 public void falarAtendente() {
     System.out.print("Atendente da loja física " 
     + nome + " diz: 'Posso ajudar em algo?'");
 }
}
