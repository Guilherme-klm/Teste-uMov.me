import api.PessoaApi;

public class PessoaAplication {

    public static void main(String[] args) {

        PessoaApi pessoaApi = new PessoaApi();
        pessoaApi.impressaoPessoa(pessoaApi.incluirDados());

    }
}
