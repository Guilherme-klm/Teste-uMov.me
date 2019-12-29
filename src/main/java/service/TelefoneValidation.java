package service;

import model.Pessoa;

import java.util.List;

public class TelefoneValidation {

    public void validarTelefone(List<Pessoa> pessoas) {
        int tamanhoTelefone = 10;
        for (Pessoa pessoa : pessoas) {
            for (String telefone : pessoa.getTelefonesCelulares()) {
                if (telefone.length() < tamanhoTelefone) {
                    throw new RuntimeException("Telefone Invalido");
                }
            }

        }
    }
}
