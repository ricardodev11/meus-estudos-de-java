package fundamentos;

import java.util.Scanner;

public class EstruturaCondicional {

    static void main() {

        //Declarando as Variaveis
        String qualSeuNome;
        int idade;
        Boolean temIngresso = false;

        //Entrada de dados
        Scanner sc = new Scanner(System.in);

        //Estrutura que vai receber os dados do usuario
        System.out.print("Informe seu nome:");
        qualSeuNome = sc.nextLine();

        System.out.print("Qual sua idade: ");
        idade = sc.nextInt();

        //Estrutura condicional para verificar se é maior de idade e se tem ingresso.
        if (idade >= 18 && temIngresso) {
            System.out.print("Permitido a entrada! ");

        } else if (idade >= 18 && !temIngresso) {
            System.out.println("Você é maior de idade, mas cadê o ingresso?");
            
        } else if (idade < 18 && temIngresso) {
            System.out.println("Você tem ingresso, mas é menor de idade.");

        } else {
            System.out.println("Você não tem ingresso e não tem idade suficiente.");
        }


    }


}
