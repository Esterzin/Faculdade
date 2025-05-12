import java.io.*;
import java.util.Scanner;

public class HistoricoAcademico {
    private int matricula;
    private String nome;
    private String situacao;

    // Construtor sem parâmetros
    public HistoricoAcademico() {
        this.matricula = 0;
        this.nome = "";
        this.situacao = "";
    }

    // Construtor com parâmetros
    public HistoricoAcademico(int matricula, String nome, String situacao) {
        this.matricula = matricula;
        this.nome = nome;
        this.situacao = situacao;
    }

    // Getters e Setters
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    // Método para escrever o registro em arquivo
    public void writeRegistro() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(matricula + "." + nome))) {
            writer.println(matricula);
            writer.println(nome);
            writer.println(situacao);
        } catch (IOException e) {
            // Pode implementar um tratamento de exceção adequado aqui se necessário
        }
    }

    // Método para ler o registro de arquivo
    public void readRegistro() {
        try (Scanner scanner = new Scanner(new File(matricula + "." + nome))) {
            matricula = scanner.nextInt();
            nome = scanner.next();
            situacao = scanner.next();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + e.getMessage());
        }
    }

    // Método para imprimir o registro na tela
    public void printRegistro() {
        System.out.println(matricula);
        System.out.println(nome);
        System.out.println(situacao);
    }
}