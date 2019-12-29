package service;

import model.Pessoa;
import repository.PessoaRepository;

import java.util.List;

public class PessoaService {

    private final PessoaRepository pessoaRepository = new PessoaRepository();
    private final CpfValidation cpfValidation = new CpfValidation();
    private final TelefoneValidation telefoneValidation =  new TelefoneValidation();

    public void post (List<Pessoa> pessoas) {
        telefoneValidation.validarTelefone(pessoas);
        for (Pessoa pessoa: pessoas) {
            cpfValidation.validarCPF(pessoa.getCpf());
        }
        pessoaRepository.incluir(pessoas);
    }
}
