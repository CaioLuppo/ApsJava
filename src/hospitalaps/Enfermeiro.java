package hospitalaps;
import java.util.Scanner;

public class Enfermeiro extends Funcionarios{
    int coren;
    int atendimentos;
    String turno;
    String plantao;
    Scanner tc = new Scanner(System.in);

    void cadastroEnfermeiro(){
        System.out.print("Digite o número do RE: ");
        re = tc.nextInt();
        System.out.print("Digite o número do CPF: ");
        cpf = tc.nextInt();
        System.out.print("Digite o nome do funcionário: ");
        nome = tc.next();
        System.out.print("Digite sua data de nascimento: ");
        dataNascimento = tc.next();
        setor = "Enfermagem";
        System.out.print("Digite o salário: ");
        salario = tc.nextDouble();
        System.out.print("Digite o telefone para contato: ");
        telefone = tc.nextInt();
        System.out.print("Digite a data de admissão: ");
        dataAdmissao = tc.next();
        System.out.print("Digite o plantão de trabalho: ");
        plantao= tc.next();
        System.out.print("Digite o Coren: ");
        coren=tc.nextInt();
        atendimentos=0;
        System.out.println(" ");
        System.out.println("-- ENFERMEIRO CADASTRADO --");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("RE: " + re);
        System.out.println("Data de Admissão: " + dataAdmissao);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Setor: " + setor);
        System.out.println("COREN: " + coren);
        System.out.println("Plantão: " + plantao);
        System.out.println("Salário: " + salario);
        System.out.println("Telefone: " + telefone);
        System.out.println("Atendimentos: " + atendimentos);
    }
    
    void alterarTurno(){
        System.out.print("Digite o novo turno: ");
        turno = tc.next();
    }
}