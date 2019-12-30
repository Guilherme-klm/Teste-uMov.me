import model.Pessoa;
import org.junit.Test;
import service.PessoaService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CpfValidationTest {

    private final PessoaService pessoaService = new PessoaService();

    @Test(expected = RuntimeException.class)
    public void deveDarUmaExcessaoAoDigitarUmCpfInvalido () {
        Pessoa pessoa = new Pessoa("61739003781");
        pessoa.setNome("João Nathan");
        pessoa.setSobrenome("Isaac da Mata");
        pessoa.setIdade(36);

        List<String> telFix = Arrays.asList("(92) 3819-7783");
        pessoa.setTelefonesFixos(telFix);

        List<String> telCel = Arrays.asList("123");
        pessoa.setTelefonesCelulares(telCel);

        List<Pessoa> pessoasList = new ArrayList<>();
        pessoasList.add(pessoa);

        pessoaService.post(pessoasList);
    }
}
