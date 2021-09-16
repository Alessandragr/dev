import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    private void cadastrarDev() {

        List<Dev_pessoa> devs = new ArrayList<>();
        String nome;
        int idade;
        boolean isValida = true;

        Scanner sc = new Scanner(System.in);
        Dev_pessoa dev = new Dev_pessoa();

        System.out.println("Informe o nome: ");
        dev.setNomeDev(sc.nextLine());

        devs.add(dev);

    }

    private void cadastrarLinguagem() {}

    public static  void main(String[] args){
        short opcao = 3;
        Scanner sc = new Scanner(System.in);
        Main main = new Main();

        do{
            main.exibirMenu();

            System.out.print("Opção escolhida: ");
            opcao = sc.nextShort();

            switch(opcao){
                case 1:
                    main.cadastrarDev();
                    System.out.println(" Dev Cadastrado com sucesso");
                    break;
                case 2:
                    main.cadastrarLinguagem();
                    break;
                case 3:
                    main.exibirMenu();
                    break;
            }
        }while(opcao != 0);
    }

    private void exibirMenu() {
        System.out.println("\n\n");
        System.out.println("+-------------------------------------------+");
        System.out.println("+----------Bem Vindo (On) Registre----------+");
        System.out.println("+-------------------------------------------+");
        System.out.println("|          Escolha uma opção:               |");
        System.out.println("+-------------------------------------------+");
        System.out.println("| 1 - Cadastrar Dev                         |");
        System.out.println("| 2 - Cadastrar Linguagem                   |");
        System.out.println("| 3 - Exibir o menu de opções               |");
        System.out.println("| 0 - Sair                                  |");
        System.out.println("+-------------------------------------------+");
    }
}
