package composite;
//Leaf
public class Programador extends Empregado {

    public Programador(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void print() {
        System.out.println(super.nome + ", $" + super.salario);
    }

    @Override
    public void add(Empregado e) {
        System.out.println("Não é possivel adicionar empregado subordinado ao programador");
    }

    @Override
    public void remove(Empregado e) {
        System.out.println("Não é possivel remover empregado subordinado ao programador");
    }
}
