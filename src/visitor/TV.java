package visitor;

public class TV extends Equipamento{

    public TV(String nome, Double preco) {
        super(nome, preco);
    }

    @Override
    public void accept(EquipamentoVisitor visitor) {
        visitor.visitTV(this);
    }
}
