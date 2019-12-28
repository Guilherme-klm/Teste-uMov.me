import dto.PessoaInputDTO;
import dto.PessoaOutputDTO;
import mapper.PessoaMapper;
import model.Pessoa;
import org.junit.Assert;
import org.junit.Test;
import service.PessoaService;

import java.util.Arrays;
import java.util.List;

public class IncluirTest {

    private final PessoaMapper pessoaMapper = new PessoaMapper();
    private final PessoaService pessoaService = new PessoaService();

    @Test
    public void deveIncluirUmaPessoa () {
        PessoaInputDTO pessoaInputDTO = new PessoaInputDTO("04624193806");
        pessoaInputDTO.setNome("Guilherme");
        pessoaInputDTO.setSobrenome("Elias");
        pessoaInputDTO.setIdade(31);
        List<String> telFixo = Arrays.asList("(61) 2863-6082", "(92) 3670-2334");
        pessoaInputDTO.setTelefonesFixos(telFixo);
        List<String> telCel = Arrays.asList("(68) 998144472", "(91) 986076211");
        pessoaInputDTO.setTelefonesCelulares(telCel);

        Pessoa pessoa = pessoaMapper.mapear(pessoaInputDTO);
        pessoa = pessoaService.incluir(pessoa);
        PessoaOutputDTO pessoaOutputDTO = pessoaMapper.mapear(pessoa);

        Assert.assertEquals("04624193806", pessoaOutputDTO.getCpf());
        Assert.assertEquals("Guilherme", pessoaOutputDTO.getNome());
        Assert.assertEquals("Elias", pessoaOutputDTO.getSobrenome());
        int i = 0;
        for (String telefone : pessoaOutputDTO.getTelefonesCelulares()) {
            Assert.assertEquals(telefone, pessoaOutputDTO.getTelefonesCelulares().get(i));
            i++;
        }
    }

    @Test
    public void deveRetornarErroAoIncluirUmNumeroComMenosDe10Digitos () {
        PessoaInputDTO pessoaInputDTO = new PessoaInputDTO("04624193806");

        List<String> telCel = Arrays.asList("144472", "(91) 986076211");
        pessoaInputDTO.setTelefonesCelulares(telCel);

        Pessoa pessoa = pessoaMapper.mapear(pessoaInputDTO);
        pessoa = pessoaService.incluir(pessoa);
        PessoaOutputDTO pessoaOutputDTO = pessoaMapper.mapear(pessoa);

    }
}
