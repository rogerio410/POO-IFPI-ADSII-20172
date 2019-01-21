import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import romanos.ConversorRomanos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class RomanosTest {

    Map<String, Integer> letras;
    ConversorRomanos conversor;

    @BeforeEach
    public void setup(){

        conversor = new ConversorRomanos();

        letras = new HashMap();
        letras.put("I", 1);
        letras.put("i", 1);
        letras.put("V", 5);
        letras.put("v", 5);
        letras.put("X", 10);
        letras.put("L", 50);
        letras.put("C", 100);
        letras.put("D", 500);
        letras.put("M", 1000);
    }

    @Test
    public void deve_converter_letras_validas_simples_em_arabicos_simples(){

        ConversorRomanos conversor = new ConversorRomanos();

        for (String letra: letras.keySet()) {
            assertEquals(letras.get(letra), conversor.convert(letra));
        }

    }


    @Test
    public void deve_rejeitar_romanos_com_caracteres_simples_invalidas(){
        Map<String, Integer> letrasInvalidas = new HashMap();
        letrasInvalidas.put("", -1);
        letrasInvalidas.put("R", -1);
        letrasInvalidas.put("r", -1);
        letrasInvalidas.put("1", -1);
        letrasInvalidas.put("*", -1);

        for (String letra: letrasInvalidas.keySet()) {
            assertThrows(IllegalArgumentException.class, () -> {
                conversor.convert(letra);
            });
        }


    }


    @Test
    public void deve_converter_romanos_tamanho_dois_com_caracteres_iguais_e_validos(){
        Map<String, Integer> letrasProibidoRepetir = new HashMap();
        letrasProibidoRepetir.put("V", -1);
        letrasProibidoRepetir.put("L", -1);
        letrasProibidoRepetir.put("D", -1);

        for (String letra: letras.keySet()) {
            if (!letrasProibidoRepetir.containsKey(letra.toUpperCase())){
               // possso repetir
               String romanoDuplo = letra + letra;

               int valorLetra = letras.get(letra).intValue();
                assertEquals(Integer.valueOf(valorLetra * 2), conversor.convert(romanoDuplo));
            }
        }
    }

}












