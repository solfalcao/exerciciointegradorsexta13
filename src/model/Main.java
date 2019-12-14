package model;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Livro livro = new Livro(4, "Hobbit", "JKK", 2001, 00004443353123, 1, 125.90);



        Livro livro2 = new Livro(2, "Senhor dos Aneis", "JKK", 2001, 00004443333123, 2, 120.90);
        Livro livro3 = new Livro(3, "Senhor dos Aneis2", "JKK", 2002, 00004443333143, 2, 120.90);
        Livro livro4 = new Livro(4, "Hobbit", "JKK", 2001, 00004443353123, 1, 125.90);
        Livro livro5 = new Livro(5, "Senhor dos Aneis3", "JKK", 2003, 1, 2, 130.90);
        Livro livro6 = new Livro(6, "SuperMan", "JKK", 2004, 00004443323123, 5, 122.90);



        livro.cadastrarLivro(livro2);
        livro.cadastrarLivro(livro3);
        livro.cadastrarLivro(livro4);
        livro.cadastrarLivro(livro5);
        livro.cadastrarLivro(livro6);

        livro.consultarLivro(4);

        livro.efetuarVenda(4);

        livro.consultarLivro(4);

        livro.efetuarVenda(4);

    }




}
