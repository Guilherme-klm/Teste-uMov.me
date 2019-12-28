package model;

import java.util.List;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private String cpf;
    private Integer idade;
    private List<String> telefonesFixos;
    private List<String> telefonesCelulares;

    public Pessoa(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
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

}
