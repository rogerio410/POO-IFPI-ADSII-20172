package app;

import model.Animal;
import model.Gato;

import javax.swing.*;

public class HelloAnimal {

    public static void main(String[] args) {

        Animal animal = new Animal("Chico", 10);
        Gato bechano = new Gato("Bechano", 4);

//        msg(animal.getNome() + " fala " + animal.falar());
//        msg(bechano.getNome() + " fala " + bechano.falar());

        Animal[] animais = {animal, bechano};
        int idadeAnimais = somaIdadesVirtual(animais);

        msg("Soma Idades Virtuais " + idadeAnimais);

    }

    public static void msg(String texto){
        JOptionPane.showMessageDialog(null, texto);
    }

    private static int somaIdadesVirtual(Animal[] lista){
        int soma = 0;
        for (Animal a:lista) {
            soma += a.getIdadeVirtual();
        }
        return soma;
    }

}
