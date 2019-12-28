package dto;

import java.util.List;

public class PessoaInputDTO {

    private String nome;
    private String cpf;
    private Integer idade;
    private List<String> telefonesFixos;
    private List<String> telefonesCelulares;

    public PessoaInputDTO(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public List<String> getTelefonesFixos() {
        return telefonesFixos;
    }

    public void setTelefonesFixos(List<String> telefonesFixos) {
        this.telefonesFixos = telefonesFixos;
    }

    public List<String> getTelefonesCelulares() {
        return telefonesCelulares;
    }

    public void setTelefonesCelulares(List<String> telefonesCelulares) {
        this.telefonesCelulares = telefonesCelulares;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
