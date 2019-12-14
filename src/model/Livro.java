package model;

import java.util.ArrayList;
import java.util.List;

public class Livro {

    private int codigo;
    private String titulo;
    private String autor;
    private int anoDeLancamento;
    private Integer isbn;
    private int qntEstoque;
    private double preco;
    private List<Livro> lista = new ArrayList<>();

    public Livro(){

    }

    public Livro(int codigo, String titulo, String autor, int anoDeLancamento, Integer isbn, int qntEstoque, double preco) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.anoDeLancamento = anoDeLancamento;
        this.isbn = isbn;
        this.qntEstoque = qntEstoque;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public double getIsbn() {
        return isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    public int getQntEstoque() {
        return qntEstoque;
    }

    public void setQntEstoque(int qntEstoque) {
        this.qntEstoque = qntEstoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void cadastrarLivro(Livro livro){
        this.lista.add(livro);
    }

    public void consultarLivro (int codigo) {
        int i = 0;
        for (Livro livro : lista) {
            if (livro.getCodigo() == codigo) {
                if(qntEstoque > 0) {
                    System.out.println(toString());
                    i++;
                }
            }

        }
        if(i == 0){
            System.out.println("Livro não encontrado");
        }
    }

    public void efetuarVenda(int cod){
        for(Livro livro : lista){
            if(livro.codigo == cod){
                if(qntEstoque>0){
                  qntEstoque -= 1;
                } else System.out.println("Estoque esgotado");
            }
        }

    }

    @Override
    public String toString(){
        return "Livro{" +
                "codigo: " + codigo +
                ", titulo: '" + titulo + '\'' +
                ", autor: '" + autor + '\'' +
                ", anoDeLancamento: " + anoDeLancamento +
                ", isbn: " + isbn +
                ", qntEstoque: " + qntEstoque +
                ", preco: " + preco +
                '}';
    }
}
