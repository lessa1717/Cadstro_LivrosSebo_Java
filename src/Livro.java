public class Livro {
    public String titulo;
    public String autor;
    public int anoLancamento;
    public double preco;


    public String toString() {
        return "Livro - " +
                "Título: '" + titulo + '\'' +
                ", Autor: '" + autor + '\'' +
                ", Ano de Lançamento: " + anoLancamento +
                ", Preço: R$" + preco;
    }
}