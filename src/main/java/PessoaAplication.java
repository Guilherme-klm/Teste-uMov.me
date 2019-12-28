import api.PessoaApi;
import mapper.PessoaMapper;

public class PessoaAplication {

    private static PessoaMapper pessoaMapper;

    public static void main(String[] args) {

        PessoaApi pessoaApi = new PessoaApi();
        pessoaApi.impressaoPessoa();

    }
}
