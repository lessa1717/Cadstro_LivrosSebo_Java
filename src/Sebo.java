import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sebo {
    public List<Livro> catalogo = new ArrayList<>();

    public void cadastrarLivro(Livro livro) {
        catalogo.add(livro);
    }

    public void listarLivros() {
        for (Livro livro : catalogo) {
            System.out.println(livro);
        }
    }


    public void cadastrarLivro() {
        Scanner leitor = new Scanner(System.in);

        String titulo;
        System.out.print("Título do livro: ");
        titulo = leitor.nextLine();

        System.out.print("Autor do livro: ");
        String autor = leitor.nextLine();

        int anoLancamento;
        do {
            System.out.print("Ano de lançamento: ");
            anoLancamento = leitor.nextInt();
            leitor.nextLine(); // Consumir a quebra de linha

            if (anoLancamento + 5 > 2023) {
                System.out.println("O livro não pode ser cadastrado,\npois tem menos de 5 anos de lançamento.\nPor favor, revise o ano!");
            } else {
                System.out.print("Preço do livro: ");
                double preco = leitor.nextDouble();
                leitor.nextLine(); // Consumir a quebra de linha

                Livro novoLivro = new Livro();
                novoLivro.titulo = titulo;
                novoLivro.autor = autor;
                novoLivro.anoLancamento = anoLancamento;
                novoLivro.preco = preco;

                catalogo.add(novoLivro);
                break; // Mova o break para fora do bloco else
            }
        } while (true); // Loop infinito enquanto o ano não for válido
    }
}