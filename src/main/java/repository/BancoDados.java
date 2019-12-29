package repository;

import model.Pessoa;

import java.util.List;

public class BancoDados {

    private static List<Pessoa> pessoasList;

    public static void incluir (List<Pessoa> pessoas) {
        pessoasList.addAll(pessoas);
    }
}
