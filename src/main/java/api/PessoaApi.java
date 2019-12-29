package api;

import model.Pessoa;
import service.PessoaService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PessoaApi {

    private final PessoaService pessoaService = new PessoaService();

    public List<Pessoa> incluirDados () {
        List<Pessoa> pessoasList = new ArrayList<>();

            Pessoa pessoa1 = new Pessoa("04624193806");
            pessoa1.setNome("Guilherme");
            pessoa1.setSobrenome("Elias");
            pessoa1.setIdade(31);
            List<String> telFixo1 = Arrays.asList("(61) 2863-6082", "(92) 3670-2334");
            pessoa1.setTelefonesFixos(telFixo1);
            List<String> telCel1 = Arrays.asList("(68) 998144472", "(91) 986076211");
            pessoa1.setTelefonesCelulares(telCel1);

            Pessoa pessoa2 = new Pessoa("60566339340");
            pessoa2.setNome("Fátima");
            pessoa2.setSobrenome("Andrea Almeida");
            List<String> telFixo2 = Arrays.asList("(92) 2923-6448", "(66) 3637-7469");
            pessoa2.setTelefonesCelulares(telFixo2);
            List<String> telCel2 = Arrays.asList("(92) 99325-8207", "(66) 98270-3992");
            pessoa2.setTelefonesFixos(telCel2);

            pessoasList.add(pessoa1);
            pessoasList.add(pessoa2);

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
