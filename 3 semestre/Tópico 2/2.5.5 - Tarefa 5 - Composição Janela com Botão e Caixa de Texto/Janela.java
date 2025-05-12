package tarefa255;

public class Janela {
    private String titulo;
    private String texto;
    private Botao botaoOk;
    private Botao botaoCancelar;
    private CaixaDeTexto caixaDeTextoLogin;
    private CaixaDeTexto caixaDeTextoSenha;
    
    public Janela(String titulo, String texto){
        this.titulo = titulo;
        this.texto = texto;
        this.botaoCancelar = new Botao("Cancelar");
        this. botaoOk = new Botao("Ok");
        this.caixaDeTextoLogin = new CaixaDeTexto("Login");
        this.caixaDeTextoSenha = new CaixaDeTexto("Senha");
    }
    

    
    public String getTitulo(){
        return titulo;
    }
    
    
    public String getTexto(){
        return texto;
    }
    
    
    public Botao getBotaoCancelar(){
        return botaoCancelar;
    }
    
    
    public Botao getBotaoOk(){
        return botaoOk;
    }
    
    
    public CaixaDeTexto getCaixaDeTextoLogin(){
        return caixaDeTextoLogin;
    }
    
    
    public CaixaDeTexto getCaixaDeTextoSenha(){
        return caixaDeTextoSenha;
    }
    
    

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    
    public void setTexto(String texto){
        this.texto = texto;
    }
    
    
    public void setBotaoCancelar(Botao botaoCancelar){
        this.botaoCancelar = botaoCancelar;
    }
    
    
    public void setBotaoOk(Botao botaoOk){
        this.botaoOk = botaoOk;
    }
    
    
    public void setCaixaDeTextoLogin(CaixaDeTexto caixaDeTextoLogin){
        this.caixaDeTextoLogin = caixaDeTextoLogin;
    }
    
    
    public void setCaixaDeTextoSenha(CaixaDeTexto caixaDeTextoSenha){
        this.caixaDeTextoSenha = caixaDeTextoSenha;
    }
    
    
    
    
    
    
    
    
}