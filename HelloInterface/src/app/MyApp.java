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
        button.setClickListener(new MyClickListener());

        tela.addView(button);

        Button btnSair = new Button();
        btnSair.setText("Acabou");
        btnSair.setClickListener(new ClickListener() {
            @Override
            public void action() {
                System.out.println("Tchau!!");
            }
        });

        tela.addView(btnSair);

        button.click();
        btnSair.click();
    }
}
