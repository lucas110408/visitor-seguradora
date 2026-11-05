package visitor;

public class PessoaVisitor implements Visitor {

    public String exibir(Pessoa pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirSegurado(Segurado segurado) {
        return "Segurado{" +
                "codigo=" + segurado.getCodigo() +
                ", nome='" + segurado.getNome() + '\'' +
                ", apolice=" + segurado.getNumeroApolice() +
                '}';
    }

    @Override
    public String exibirCorretor(Corretor corretor) {
        return "Corretor{" +
                "codigo=" + corretor.getCodigo() +
                ", nome='" + corretor.getNome() + '\'' +
                ", registroSusep='" + corretor.getRegistroSusep() + '\'' +
                '}';
    }

    @Override
    public String exibirFuncionario(Funcionario funcionario) {
        return "Funcionario{" +
                "codigo=" + funcionario.getCodigo() +
                ", nome='" + funcionario.getNome() + '\'' +
                ", salario=" + funcionario.getSalario() +
                '}';
    }
}
