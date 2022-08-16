package hospitalaps;

import java.util.Scanner;

public class executavel {

    static void opcaoInvalida(int opc) {
        System.out.print("A opção " + opc + " não existe. Por favor, digite uma opção válida: ");
    }

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        Recepcionista re = new Recepcionista();
        Supervisor sup = new Supervisor();
        Medico med = new Medico();
        Enfermeiro enf = new Enfermeiro();
        
        // Escolhe se deseja cadastrar novo funcionário ou alterar turno
        System.out.print("Deseja cadastrar um novo funcionário [digite (0)] ou apenas alterar o turno do já existente? [digite (1)] ");
        int opcao;
        while (true) {
            opcao = tc.nextInt();

            if (opcao == 0) {
                System.out.println("Qual funcionário gostaria de cadastrar?");
                System.out.println("Digite: \n[0] -> recepcionista;\n"
                        + "[1] -> médico; \n[2] -> enfermeiro; \n[3] -> supervisor;");
            } else if (opcao == 1) {
                System.out.println("Gostaria de alterar o turno de qual funcionário?");
                System.out.println("Digite: \n[0] -> recepcionista; \n[1] -> Enfermeira;");
            } else {
                opcaoInvalida(opcao);
                continue;
            }
            break;
        }
        
        // Cadastra novos funcionários ou altera turno
        while (true) {
            int escolha = tc.nextInt();

            if (opcao == 0) {
                if (escolha >= 0 && escolha <= 3) {
                    switch (escolha) {
                        case 0 -> re.cadastroRecepcionista();
                        case 1 -> med.cadastroMedico();
                        case 2 -> enf.cadastroEnfermeiro();
                        case 3 -> sup.cadastroSupervisor();
                    }
                } else {
                    opcaoInvalida(escolha);
                    continue;
                }
            } else if (opcao == 1) {
                if (escolha == 0 || escolha == 1) {
                    switch (escolha) {
                        case 0 -> re.alterarTurno();
                        case 1 -> enf.alterarTurno();
                    }
                } else {
                    opcaoInvalida(escolha);
                    continue;
                }
                System.out.println("Turno alterado com sucesso!");
            }
            break;
        }

    }

}
