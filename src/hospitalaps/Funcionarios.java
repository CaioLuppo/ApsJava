package hospitalaps;
import java.util.Scanner;

public class Funcionarios {
    int re;
    int cpf;
    String nome;
    String dataNascimento;
    String setor;
    double salario;
    int telefone;
    String dataAdmissao;
    
    Scanner tc = new Scanner(System.in);
    
    Funcionarios(){
        dataAdmissao = "__/__/_____";
    }
    
    void atualizarSalario(){
        System.out.println("Digite o novo salário do funcionário: ");
        salario = tc.nextDouble();
        System.out.println("Salário atualizado!");
        
    }
}
