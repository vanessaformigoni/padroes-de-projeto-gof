package singleton;

import javax.swing.*;
import java.awt.*;

public class Janela extends JFrame {

    private static Janela j = null;

    private Janela() {
        setPreferredSize(new Dimension(640, 480));
    } //O construtor padrão como private é o que faz ser Singleton pois
      //impede que o programador instancie a classe diretamente atravez
      //do operador new. Se quiser usar tem que chamar atraves de um metodo
      //estatico (getInstance nesse caso) para obter a intancia de Janela.

    public static Janela getInstance() {
        if(j==null){
            j = new Janela();
        }
        return j;
    }
}
