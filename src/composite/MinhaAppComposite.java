package composite;

public class MinhaAppComposite {

    public static void main(String[] args) {
        //Cria tres programadores - folhas
        Programador pEstagiario = new Programador("Jose",800);
        Programador pJunior = new Programador("Pedro",2500);
        Programador pSenior = new Programador("Ricardo",3400);

        //Gerentes
        Gerente g3 = new Gerente("Joao", 15000);
        Gerente g2 = new Gerente("Maria", 10000);
        Gerente g1 = new Gerente("Carlos", 5000);

        //Montar a estrutura em arvore amarrando os subordinados aos chefes.

        //Carlos supervisiona Pedro e Jose
        g1.add(pEstagiario);
        g1.add(pJunior);

        //Maria superviosiona Ricardo
        g2.add(pSenior);

        //Joao supervisiona todos , Maria e Carlos. Ou seja, ele é arvore.
        g3.add(g1);
        g3.add(g2);

        g3.print();


    }
}
