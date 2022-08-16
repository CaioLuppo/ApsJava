package hospitalaps;
import java.util.Scanner;
public class Medico extends Funcionarios {
    String plantao;
    String crm;
    String especialidade;
    String atendimento;
    Scanner tc = new Scanner(System.in);
    
    void cadastroMedico(){
        System.out.print("Numero do crm: ");
        crm = tc.next();
        System.out.print("Nome especialidade: ");
        especialidade = tc.next();
        System.out.print("Horario Plantão: ");
        plantao = tc.next();
        System.out.print("Atendimento: ");
        atendimento = tc.next();
        System.out.print("Digite o número do RE: ");
        re = tc.nextInt();
        System.out.print("Digite o número do CPF: ");
        cpf = tc.nextInt();
        System.out.print("Digite o nome do funcionário: ");
        nome = tc.next();
        System.out.print("Digite sua data de nascimento: ");
        dataNascimento = tc.next();
        setor = "Médicos";
        System.out.print("Digite o salário: ");
        salario = tc.nextDouble();
        System.out.print("Digite o telefone para contato: ");
        telefone = tc.nextInt();
        System.out.print("Digite a data de admissão: ");
        dataAdmissao = tc.next();
        System.out.println("Novo recepcionista cadastrado!");
    }
}

