package singleton;

public class MinhaAppSingleton {

    public static void main(String[] agrs) {
        Janela j = Janela.getInstance(); //sempre retorna o MESMO objeto.
        j.pack();
        j.setVisible(true);

        Janela j2 = Janela.getInstance();
        j2.pack();
        j2.setVisible(true); //eu não consigo criar 02 janelas nesse caso, são todas a mesma janela.
    }

}
