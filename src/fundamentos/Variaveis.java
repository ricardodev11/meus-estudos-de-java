package fundamentos;

import java.util.Scanner;

public class Variaveis {

    static void main() {

        // Variaveis, caixas na memoria
        String meuNome;
        int minhaIdade;

        // Entrada de dados
        Scanner sc = new Scanner(System.in);

        //Pede ao usuario que digite o nome
        System.out.print("Digite seu nome:");
        meuNome = sc.nextLine();

        //Pede ao usuario a sua idade
        System.out.print("Informe sua idade:");
        minhaIdade = sc.nextInt();

        //Saida de dados
        System.out.println("Nome do usuario = " + meuNome);
        System.out.print("Idade do usuario = " + minhaIdade + " anos");








    }
}
