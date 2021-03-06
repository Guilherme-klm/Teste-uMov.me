import model.Pessoa;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import service.PessoaService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IncluirTest {

    private final PessoaService pessoaService = new PessoaService();

    @Test
    public void deveIncluirUmaPessoa() {

        Pessoa pessoa = new Pessoa("61739003780");
        pessoa.setNome("João Nathan");
        pessoa.setSobrenome("Isaac da Mata");
        pessoa.setIdade(36);

        List<String> telFix = Arrays.asList("(92) 3819-7783");
        pessoa.setTelefonesFixos(telFix);

        List<String> telCel = Arrays.asList("(92) 99684-3650");
        pessoa.setTelefonesCelulares(telCel);

        List<Pessoa> pessoasList = new ArrayList<>();
        pessoasList.add(pessoa);

        pessoaService.post(pessoasList);

        Assert.assertEquals("61739003780", pessoa.getCpf());
        Assert.assertEquals("João Nathan", pessoa.getNome());
        Assert.assertEquals("Isaac da Mata", pessoa.getSobrenome());
        Assert.assertEquals(36, pessoa.getIdade(), 0);
        Assert.assertThat(pessoa.getTelefonesFixos(), CoreMatchers.hasItems("(92) 3819-7783"));
        Assert.assertThat(pessoa.getTelefonesCelulares(), CoreMatchers.hasItem("(92) 99684-3650"));
        }
}