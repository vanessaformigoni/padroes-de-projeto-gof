package command;

public class MinhaAppCommand {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        Invoker invoker = new Invoker();//Armazena o historico dos calculos

        invoker.compute(new Soma(calculadora, 10));
        invoker.compute(new Soma(calculadora, 5));
        invoker.compute(new Soma(calculadora, 10));

        //desfazer as duas ultimas operaçoes
        invoker.undo(2);
    }
}
