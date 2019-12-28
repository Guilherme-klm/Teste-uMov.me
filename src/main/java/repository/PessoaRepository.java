package repository;

import model.Pessoa;

public class PessoaRepository {

    public Pessoa incluir (Pessoa pessoa) {
        Pessoa pessoa1 = new Pessoa(pessoa.getCpf());
        pessoa1.setNome(pessoa.getNome());
        pessoa1.setIdade(pessoa.getIdade());
        pessoa1.setTelefonesFixos(pessoa.getTelefonesFixos());
        pessoa1.setTelefonesCelulares(pessoa.getTelefonesCelulares());

        return pessoa;
    }
}
