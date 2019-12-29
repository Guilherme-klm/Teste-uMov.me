package api;

import model.Pessoa;
import service.PessoaService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PessoaApi {

    private final PessoaService pessoaService = new PessoaService();

    public List<Pessoa> incluirDados () {

        Pessoa pessoa = new Pessoa("04624193806");
        pessoa.setNome("Guilherme");
        pessoa.setSobrenome("Elias");
        pessoa.setIdade(31);
        List<String> telFixo = Arrays.asList("(61) 2863-6082", "(92) 3670-2334");
        pessoa.setTelefonesFixos(telFixo);
        List<String> telCel = Arrays.asList("(68) 998144472", "(91) 986076211");
        pessoa.setTelefonesCelulares(telCel);

        List<Pessoa> pessoasList = new ArrayList<>();
        pessoasList.add(pessoa);
        pessoaService.post(pessoasList);

        return pessoasList;
    }

    public void impressaoPessoa (List<Pessoa> pessoas) {
        for (Pessoa pessoa1 : pessoas) {
            System.out.println("Nome: " + pessoa1.getNome() + " " + pessoa1.getSobrenome());
            System.out.println("Fone: " + pessoa1.getTelefonesCelulares());
            System.out.println("CPF: " + pessoa1.getCpf());
        }
    }

}
