import model.Pessoa;
import org.junit.Assert;
import org.junit.Test;
import repository.BancoDados;
import repository.PessoaRepository;
import service.PessoaService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TelefoneValidationTest {

    private final PessoaService pessoaService = new PessoaService();
    private final BancoDados bancoDados = new BancoDados();

    @Test(expected = RuntimeException.class)
    public void deveDarUmaExcessaoAoPorMenosDe10DigitosNoNumeroDeCelular() {

        Pessoa pessoa = new Pessoa("61739003780");
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
