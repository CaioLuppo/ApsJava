package hospitalaps;
import java.util.Scanner;

public class Recepcionista extends Funcionarios{
    String turno;
    Scanner tc = new Scanner(System.in);
    
    void cadastroRecepcionista(){
        System.out.print("Digite o número do RE: ");
        re = tc.nextInt();
        System.out.print("Digite o número do CPF: ");
        cpf = tc.nextInt();
        System.out.print("Digite o nome do funcionário: ");
        nome = tc.next();
        System.out.print("Digite sua data de nascimento: ");
        dataNascimento = tc.next();
        setor = "Recepção";
        System.out.print("Digite o salário: ");
        salario = tc.nextDouble();
        System.out.print("Digite o telefone para contato: ");
        telefone = tc.nextInt();
        System.out.print("Digite a data de admissão: ");
        dataAdmissao = tc.next();
        System.out.print("Digite o turno de trabalho: ");
        turno = tc.next();        
        System.out.println(" ");
        System.out.println("-- RECEPCIONISTA CADASTRADO --");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("RE: " + re);
        System.out.println("Data de Admissão: " + dataAdmissao);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Setor: " + setor);
        System.out.println("Turno: " + turno);
        System.out.println("Salário: " + salario);
        System.out.println("Telefone: " + telefone);
    }
    
    void alterarTurno(){
        System.out.print("Digite o novo turno: ");
        turno = tc.next();
    }
}
