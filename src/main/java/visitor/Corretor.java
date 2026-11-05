package visitor;

public class Corretor implements Pessoa {

    private int codigo;
    private String nome;
    private String registroSusep;

    public Corretor(int codigo, String nome, String registroSusep) {
        this.codigo = codigo;
        this.nome = nome;
        this.registroSusep = registroSusep;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getRegistroSusep() {
        return registroSusep;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirCorretor(this);
    }

}
