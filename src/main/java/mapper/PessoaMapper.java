package mapper;

import dto.PessoaInputDTO;
import dto.PessoaOutputDTO;
import model.Pessoa;

public class PessoaMapper {

    public Pessoa mapear (PessoaInputDTO pessoaInputDTO) {
        Pessoa pessoa = new Pessoa(pessoaInputDTO.getCpf());
        pessoa.setNome(pessoaInputDTO.getNome());
        pessoa.setSobrenome(pessoaInputDTO.getSobrenome());
        pessoa.setIdade(pessoaInputDTO.getIdade());
        pessoa.setTelefonesFixos(pessoaInputDTO.getTelefonesFixos());
        pessoa.setTelefonesCelulares(pessoaInputDTO.getTelefonesCelulares());

        return pessoa;
    }

    public PessoaOutputDTO mapear (Pessoa pessoa) {
        PessoaOutputDTO pessoaOutputDTO = new PessoaOutputDTO();
        pessoaOutputDTO.setNome(pessoa.getNome());
        pessoaOutputDTO.setSobrenome(pessoa.getSobrenome());
        pessoaOutputDTO.setCpf(pessoa.getCpf());
        pessoaOutputDTO.setTelefonesCelulares(pessoa.getTelefonesCelulares());

        return pessoaOutputDTO;
    }

}
