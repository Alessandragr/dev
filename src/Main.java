import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    List<Dev_linguagem> lgs = new ArrayList<>();
    List<Dev_pessoa> devs = new ArrayList<>();

    private void cadastrarDev() {

        String nome;
        int idade;

        boolean isValida = true;

        Scanner sc = new Scanner(System.in);
        Dev_pessoa dev = new Dev_pessoa();

        System.out.println("Informe o nome: ");
        dev.setNomeDev(sc.nextLine());

        System.out.println("Informe o sobrenome: ");
        dev.setSobrenomeDev(sc.nextLine());

        System.out.println("Informe a senioridade: ");
        dev.setSenioridadeDev(sc.nextLine());

        System.out.println("Informe a idade: ");
        dev.setIdadeDev(sc.nextInt());

        devs.add(dev);
    }

    private void cadastrarLinguagem() {

        String nomeLg;
        String aplicacao;

        boolean isValida = true;

        Scanner sc = new Scanner(System.in);
        Dev_linguagem lg = new Dev_linguagem();

        System.out.println("Informe o nome da linguagem: ");
        lg.setNomeLinguagem(sc.nextLine());

        System.out.println("Informe a descrição da linguagem: ");
        lg.setDescricao(sc.nextLine());

        boolean opalVal = true;

        do{
            Scanner menu = new Scanner (System.in);

            System.out.print("##--Teste Estrutura de Menu--##\n\n");
            System.out.print("|-------------------------------|\n");
            System.out.print("| Opção 1 - FRONTEND            |\n");
            System.out.print("| Opção 2 - BACKEND             |\n");
            System.out.print("| Opção 3 - MOBILE              |\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("Digite uma opção: ");
            System.out.print("Opção escolhida: ");
            int opcao = menu.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("Opção selecionada: Frontend");
                    lg.setAplicacao("Frontend");
                    break;
                case 2:
                    System.out.println("Opção selecionada: Backend");
                    lg.setAplicacao("Backend");
                    break;
                case 3:
                    System.out.println("Opção selecionada: Mobile");
                    lg.setAplicacao("Mobile");
                    break;
            }
        }while(opalVal = false);


        lgs.add(lg);
    }

    private void imprimirLinguagem() {
        for(Dev_linguagem lg : lgs) {
            System.out.println("Lista de linguagens cadastrados: ");
            System.out.println("Nome Linguagem : " + lg.getNomeLinguagem());
            System.out.println("Descrição      : " + lg.getDescricao());
            System.out.println("Aplicação      : " + lg.getAplicacao());
            System.out.println("\n\n");
        }
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
        System.out.println("| 3 - Imprimir Linguagem                    |");
        System.out.println("| 4 - Exibir o menu de opções               |");
        System.out.println("| 0 - Sair                                  |");
        System.out.println("+-------------------------------------------+");
    }

    public static  void main(String[] args){
        short opcao = 4;
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
                    main.imprimirLinguagem();
                    break;
                case 4:
                    main.exibirMenu();
                    break;
            }
        }while(opcao != 0);
    }
}
