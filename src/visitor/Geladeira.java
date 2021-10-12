package visitor;

public class Geladeira extends Equipamento {

    public Geladeira(String nome, Double preco) {
        super(nome, preco);
    }
    @Override
    public void accept(EquipamentoVisitor visitor) {
        visitor.visitGeladeira(this);
    }
}
