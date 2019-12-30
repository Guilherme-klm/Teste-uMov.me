package repository;

import model.Pessoa;

import java.util.List;

public class PessoaRepository {

    public void incluir (List<Pessoa> pessoas) {
        BancoDados.getPessoasList().addAll(pessoas);
    }
}
