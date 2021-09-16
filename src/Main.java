import pacoteValidacao.ValidaIdade;
import pacoteValidacao.ValidaNome;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    List<Dev_linguagem> lgs = new ArrayList<>();
    List<Dev_pessoa> devs = new ArrayList<>();

    private void cadastrarDev() {

        String nome;
        String sobrenome;
        int idade;

        boolean isValida = true;

        Scanner sc = new Scanner(System.in);
        Dev_pessoa dev = new Dev_pessoa();

        do {
            System.out.print("Nome do dev: ");
            nome = sc.nextLine();
            if (ValidaNome.isNome(nome) == true){
                dev.setNomeDev(nome);
                break;
            } else{ System.out.printf("Erro, nome deve conter no mínimo 3 caracteres !!!\n");};
        }while (isValida);


        do {
            System.out.print("Informe sobrenome: ");
            sobrenome = sc.nextLine();
            if (ValidaNome.isNome(sobrenome) == true){
                dev.setNomeDev(sobrenome);
                break;
            } else{ System.out.printf("Erro, sobrenome deve conter no mínimo 3 caracteres !!!\n");};
        }while (isValida);


        System.out.println("Informe a senioridade: ");
        dev.setSenioridadeDev(sc.nextLine());


        do {
            System.out.println("Informe a idade: ");
            idade = sc.nextInt();
            if (ValidaIdade.isIdade(idade) == true){
                dev.setIdadeDev(idade);
                break;
            } else{ System.out.printf("Erro, idade tem que ser maior 0 !!!\n");};
        }while (isValida);

        devs.add(dev);
    }

    private void cadastrarLinguagem() {

        String nomeLg;

        boolean isValida = true;

        Scanner sc = new Scanner(System.in);
        Dev_linguagem lg = new Dev_linguagem();

        do {
            System.out.println("Informe o nome da linguagem: ");
            nomeLg = sc.nextLine();
            if (ValidaNome.isNome(nomeLg) == true){
                lg.setNomeLinguagem(nomeLg);
                break;
            } else{ System.out.printf("Erro, nome deve conter no mínimo 3 caracteres !!!\n");};
        }while (isValida);

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

    private void imprimirDev() {
        for(Dev_pessoa dev : devs) {
            System.out.println("Lista de devs cadastrados: ");
            System.out.println("Nome Linguagem : " + dev.getNomeDev());
            System.out.println("Descrição      : " + dev.getSobrenomeDev());
            System.out.println("Aplicação      : " + dev.getSenioridadeDev());
            System.out.println("Aplicação      : " + dev.getIdadeDev());
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
        System.out.println("| 3 - Imprimir Dev                          |");
        System.out.println("| 4 - Imprimir Linguagem                    |");
        System.out.println("| 5 - Exibir o menu de opções               |");
        System.out.println("| 0 - Sair                                  |");
        System.out.println("+-------------------------------------------+");
    }

    public static  void main(String[] args){
        short opcao = 5;
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
                    main.imprimirDev();
                    break;
                case 4:
                    main.imprimirLinguagem();
                    break;
                case 5:
                    main.exibirMenu();
                    break;
            }
        }while(opcao != 0);
    }
}
