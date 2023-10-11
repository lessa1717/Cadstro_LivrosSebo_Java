import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Sebo sebo = new Sebo();
        Scanner leitor = new Scanner(System.in);

        String opcao;

        do {
            System.out.println("Bem vindo ao sistema de cadastro de Livros (Sebo)");
            System.out.println("Escolha uma opção:\n1 - Entrar\n2 - Sair");
            opcao = leitor.nextLine();

            switch (opcao) {
                case "1":
                    do {
                        System.out.println("Escolha uma opção:\n1 - Cadastrar Livro\n2 - Listar\n0 - Sair");
                        opcao = leitor.nextLine();

                        if (opcao.equals("1")) {
                            System.out.print("Quantos livros deseja cadastrar? ");
                            int quantidade = leitor.nextInt();
                            leitor.nextLine();

                            for (int i = 0; i < quantidade; i++) {
                                System.out.println("Cadastro do Livro " + (i + 1));
                                sebo.cadastrarLivro(new Livro());
                            }
                        }
                    } while (!opcao.equals("0"));
                    break;

                case "2":
                    System.out.println("Catálogo de livros do sebo:");
                    sebo.listarLivros(); // Chame o método de listagem
                    break;
            }
        } while (!opcao.equals("0"));
    }
}