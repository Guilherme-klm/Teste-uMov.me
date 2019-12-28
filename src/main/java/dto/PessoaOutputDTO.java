package dto;

import java.util.List;

public class PessoaOutputDTO {

    private String nome;
    private String cpf;
    private List<String> telefonesCelulares;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<String> getTelefonesCelulares() {
        return telefonesCelulares;
    }

    public void setTelefonesCelulares(List<String> telefonesCelulares) {
        this.telefonesCelulares = telefonesCelulares;
    }
}
