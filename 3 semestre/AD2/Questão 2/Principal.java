import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando dois objetos de HistoricoAcademico
        HistoricoAcademico historico1 = new HistoricoAcademico();
        HistoricoAcademico historico2 = new HistoricoAcademico();

        // Lendo dados do arquivo file.in para historico1
        historico1.setMatricula(scanner.nextInt());
        historico1.setNome(scanner.next());
        historico1.setSituacao(scanner.next());

        // Lendo dados do arquivo file.in para historico2
        historico2.setMatricula(scanner.nextInt());
        historico2.setNome(scanner.next());
        historico2.setSituacao(scanner.next());

        // Gravando registros em arquivos
        historico1.writeRegistro();
        historico2.writeRegistro();

        // Lendo registros dos arquivos
        historico1.readRegistro();
        historico2.readRegistro();

        // Imprimindo registros na tela
        historico1.printRegistro();
        historico2.printRegistro();

        scanner.close();
    }
}