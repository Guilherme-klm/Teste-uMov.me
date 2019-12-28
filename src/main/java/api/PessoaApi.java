package api;

import dto.PessoaInputDTO;
import dto.PessoaOutputDTO;
import mapper.PessoaMapper;
import model.Pessoa;
import service.PessoaService;

import java.util.Arrays;
import java.util.List;

public class PessoaApi {

    private final PessoaMapper pessoaMapper = new PessoaMapper();
    private final PessoaService pessoaService = new PessoaService();

    public void impressaoPessoa () {

        PessoaInputDTO pessoaInputDTO = new PessoaInputDTO("04624193806");
        pessoaInputDTO.setNome("Elias");
        pessoaInputDTO.setIdade(31);
        List<String> telFixo = Arrays.asList("(61) 2863-6082", "(92) 3670-2334");
        pessoaInputDTO.setTelefonesFixos(telFixo);
        List<String> telCel = Arrays.asList("(92) 99814-4472", "(82) 98607-6211");
        pessoaInputDTO.setTelefonesCelulares(telCel);

        Pessoa pessoa = pessoaMapper.mapear(pessoaInputDTO);
        pessoa = pessoaService.incluir(pessoa);
        PessoaOutputDTO pessoaOutputDTO = pessoaMapper.mapear(pessoa);

        System.out.println("Nome: " + pessoaOutputDTO.getNome());
        System.out.println("Fone: " + pessoaOutputDTO.getTelefonesCelulares());
        System.out.println("CPF: " + pessoaOutputDTO.getCpf());

    }

}
