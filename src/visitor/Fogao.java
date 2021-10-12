package visitor;

public class Fogao extends Equipamento {

    public Fogao(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void accept(EquipamentoVisitor visitor) {
        visitor.visitFogao(this);
    }
}
