import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class FracaoTest {

    Fracao fracao;

    @BeforeEach
    public void inicializacao(){
        fracao = new Fracao(2, 3);
    }

    @Test
    public void deve_criar_uma_fracao(){
        assertEquals("2/3", fracao.toString());
    }

    @Test
    public void deve_retornar_o_valor_real_correto(){
        assertEquals(2/3, fracao.valorReal());
    }


    @Test()
    public void nao_deve_criar_fracao_com_denominador_zero(){
        assertThrows(IllegalArgumentException.class, () -> {
            new Fracao(10, 0);
        });
    }


}
