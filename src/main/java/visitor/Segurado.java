package visitor;

public class Segurado implements Pessoa {

    private int codigo;
    private String nome;
    private Apolice apolice;

    public Segurado(int codigo, String nome, Apolice apolice) {
        this.codigo = codigo;
        this.nome = nome;
        this.apolice = apolice;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getNumeroApolice() {
        return this.apolice.getNumero();
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirSegurado(this);
    }

}
