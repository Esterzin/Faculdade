package tarefa258;

//Classe LojaVirtual herda de Loja
class LojaVirtual extends Loja {
 private String website;
 
 public LojaVirtual(String nome, String endereco, String website) {
     super(nome, endereco);
     this.website = website;
 }

 public void falarChatbot() {
     System.out.print( "Chatbot da loja virtual " + nome + 
     " diz: 'Olá! Em que posso ajudar hoje?'");
 }
}
