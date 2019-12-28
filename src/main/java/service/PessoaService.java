package service;

import model.Pessoa;
import repository.PessoaRepository;

public class PessoaService {

    private final PessoaRepository pessoaRepository = new PessoaRepository();

    public Pessoa incluir (Pessoa pessoa) {
        return pessoaRepository.incluir(pessoa);
    }
}
