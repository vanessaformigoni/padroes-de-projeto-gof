package iterator;

import java.util.Iterator;

public class MamiferoIterator implements Iterator<Animal> {

    private Zoo zoo;
    private int pos =0;

    public MamiferoIterator(Zoo zoo) {
        this.zoo = zoo;
    }

    //Metodo verifica se existe um proximo elemento especifico dessa classe na lista
    @Override
    public boolean hasNext() {
        for(int i = pos; i < zoo.getAnimais().size(); i++) {
            Animal a = zoo.getAnimais().get(i);
            if(a.getClasse().equalsIgnoreCase("mamifero")) {
                return true;
            }
        }
        return false;
    }

    //Iteracoes filtradas
    @Override
    public Animal next() {
        while (pos < zoo.getAnimais().size()) {
            Animal a = zoo.getAnimais().get(pos);
            pos++;

            if(a.getClasse().equalsIgnoreCase("mamifero")){
                return a;
            }
        }
        //Retorna NULL se nao ha mais elemento dessa classe na lista
        return null;
    }
}
