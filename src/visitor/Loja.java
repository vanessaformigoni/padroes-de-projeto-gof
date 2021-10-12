package visitor;

import java.util.ArrayList;
import java.util.List;

public class Loja {

    private List<Equipamento> eqList = new ArrayList<Equipamento>();

    public void addEquipamento(Equipamento e) {
        eqList.add(e);
    }

    public List<Equipamento> getEquipamentoList() {
        return eqList;
    }
}
