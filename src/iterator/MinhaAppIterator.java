package iterator;

public class MinhaAppIterator {

    public static void main(String[] args) {
        //Criar objeto zoo
        Zoo zoo = new ZooImpl();

        //Adiciona animais ao zoologico
        zoo.addAnimal(new Animal("tigre", "mamifero"));
        zoo.addAnimal(new Animal("pinguim", "ave"));
        zoo.addAnimal(new Animal("leao", "mamifero"));
        zoo.addAnimal(new Animal("elefante", "mamifero"));

        MamiferoIterator it = new MamiferoIterator(zoo);
        //AveIterator it = new AveIterator(zoo);

        while(it.hasNext()){
            System.out.println(it.next().getNome());
        }
    }
}
