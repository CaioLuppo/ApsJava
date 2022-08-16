
package hospitalaps;

import java.util.Scanner;

public class Supervisor extends Funcionarios{
    String setorResponsavel;
    
    void cadastroSupervisor(){
        // Cria o scanner e pede as informações
        Scanner tc = new Scanner(System.in);
        System.out.print("Digite o RE: ");
        re = tc.nextInt();
        System.out.print("Digite o CPF: ");
        cpf = tc.nextInt();
        System.out.print("Digite o nome: ");
        nome = tc.next();
        System.out.print("Digite a data de nascimento: ");
        dataNascimento = tc.next();
        setor = "Supervisão";
        System.out.print("Digite o salário: ");
        salario = tc.nextDouble();
        System.out.print("Digite o telefone: ");
        telefone = tc.nextInt();
        System.out.print("Digite a data de admissão: ");
        dataAdmissao = tc.next();
        System.out.print("Digite o setor responsável: ");
        setorResponsavel = tc.next();
        
        // Mostra o que foi cadastrado
        System.out.println(" ");
        System.out.println("-- SUPERVISOR CADASTRADO --");
        System.out.println("Nome: "+ nome);
        System.out.println("CPF: "+ cpf);
        System.out.println("RE: "+ re);
        System.out.println("Data de Admissão: "+ dataAdmissao);
        System.out.println("Data de Nascimento: "+ dataNascimento);
        System.out.println("Setor: "+ setor);
        System.out.println("Salário: "+ salario);
        System.out.println("Telefone: "+ telefone);
        System.out.println("Setor Responsável: "+ setorResponsavel);
    }
}
