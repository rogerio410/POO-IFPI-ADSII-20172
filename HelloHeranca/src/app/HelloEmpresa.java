package app;

import model.empresa.Funcionario;
import model.empresa.Gerente;

public class HelloEmpresa {

    public static void main(String[] args) {

        Funcionario bd = new Funcionario("BD", "123", 1200);
        Gerente ma = new Gerente("MA", "124", 1200, "120270");

        HelloAnimal.msg("Funcionário: "+bd);
        HelloAnimal.msg("Gerente: "+ma);

    }
}
