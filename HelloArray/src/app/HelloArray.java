package app;

import model.Funcionario;

public class HelloArray {

    public static void main(String[] args) {

        System.out.println("Hello.");

//        int numeros[] = new int[4];
//
//        System.out.println("Tamanho" + numeros.length);
//        for(int i = 0; i < numeros.length; i++){
//            numeros[i] = i * 100;
//        }
//        System.out.println("Tamanho" + numeros.length);
//
//        for(int i = 0; i < numeros.length; i++){
//            System.out.println("> " + numeros[i]);
//        }
//
//        for (int n : numeros) {
//            System.out.println("# " + n);
//        }

        Funcionario []funcs = new Funcionario[5];
        // Preenchimento
        for (int i = 0; i < funcs.length; i++){
            funcs[i] = new Funcionario();
            funcs[i].cpf = "123"+i;
            funcs[i].nome = "Maria_"+i;

        }

        //Leitura
        for (Funcionario f:funcs) {
            System.out.println("$ " + f.nome + " - " + f.cpf);
        }


    }

}
