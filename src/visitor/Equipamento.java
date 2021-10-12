package visitor;

public abstract class Equipamento {
    private String nome;
    private Double preco;

    public Equipamento(String nome, Double preco) {
        super();
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public abstract void accept(EquipamentoVisitor visitor);
}
