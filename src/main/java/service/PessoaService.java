package service;

import model.Pessoa;
import repository.PessoaRepository;

import java.util.List;

public class PessoaService {

    private final PessoaRepository pessoaRepository = new PessoaRepository();

    public Pessoa incluir (Pessoa pessoa) {
        validarTelefone(pessoa.getTelefonesCelulares());
        validarCPF(pessoa.getCpf());
        return pessoaRepository.incluir(pessoa);
    }

    static public void validarCPF (String cpf ) {
        int d1 = 0, d2 = 0;
        int digito1, digito2, resto;
        int digitoCPF;
        String resultadoDigitos;

        for (int i = 1; i < cpf.length() -1; i++)
        {
            digitoCPF = Integer.parseInt(cpf.substring(i - 1, i));

            d1 = d1 + ( 11 - i ) * digitoCPF;

            d2 = d2 + ( 12 - i ) * digitoCPF;
        }

        resto = (d1 % 11);

        if (resto < 2)
            digito1 = 0;
        else
            digito1 = 11 - resto;

        d2 += 2 * digito1;

        resto = (d2 % 11);

        if (resto < 2)
            digito2 = 0;
        else
            digito2 = 11 - resto;

        String digitosVerificadores = cpf.substring (cpf.length()-2);

        resultadoDigitos = String.valueOf(digito1) + digito2;

        if (!(digitosVerificadores.equals(resultadoDigitos))) {
            throw new RuntimeException ("CPF inválido");
        }
    }

    public void validarTelefone (List<String> telefones) {
        for (String telefone: telefones) {
            if (telefone.length() < 10) {
                throw new RuntimeException ("Telefone Invalido");
            }
        }
    }
}
