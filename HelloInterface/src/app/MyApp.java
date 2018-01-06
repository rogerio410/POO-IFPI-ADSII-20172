package app;

import model.*;

public class MyApp {

    public static void main(String[] args) {
        GroupView tela = new GroupView();

        TextView textView = new TextView();
        textView.setText("Hello");

        tela.addView(textView);

        Button button = new Button();
        button.setText("Enviar");
        MyClickListener myClickListener = new MyClickListener();
        button.setClickListener(myClickListener);

        tela.addView(button);

        Button btnSair = new Button();
        btnSair.setText("Acabou");

        // classe anomima
        btnSair.setClickListener(new View.ClickListener() {
            @Override
            public void action() {
                System.out.println("Tchau!!");
            }
        });

        btnSair.setClickListener(() -> {
            System.out.println("Hello");
        });

        tela.addView(btnSair);

        button.click();
        btnSair.click();

        int [] numero [];
        


    }
}






