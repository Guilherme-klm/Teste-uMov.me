package repository;

import model.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class BancoDados {

    private static List<Pessoa> pessoasList;

    public static List<Pessoa> getPessoasList () {
        if (pessoasList == null) {
            pessoasList = new ArrayList<>();
        }
        return pessoasList;
    }
}
