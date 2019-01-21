package romanos;

import java.util.HashMap;
import java.util.Map;

public class ConversorRomanos {


    public Integer convert(String romano){

        if (romano.isEmpty()) throw new IllegalArgumentException("Favor passe um romano");

        String romanoRecebido = romano.toUpperCase();

        Integer resultado = 0;
        for (int i = 0; i < romanoRecebido.length(); i++) {
            Integer valorCaracter = converterCaracter(String.valueOf(romanoRecebido.charAt(i)));
            resultado += valorCaracter;
        }

        return resultado;

    }


    private Integer converterCaracter(String caracter){

        Map<String, Integer> letras = new HashMap();
        letras.put("I", 1);
        letras.put("V", 5);
        letras.put("X", 10);
        letras.put("L", 50);
        letras.put("C", 100);
        letras.put("D", 500);
        letras.put("M", 1000);

        if (!letras.containsKey(caracter)){
            throw new IllegalArgumentException("Romano inválido: " + caracter);
        }

        return letras.get(caracter);

    }

}
