package visitor;

public interface Visitor {

    String exibirSegurado(Segurado segurado);
    String exibirCorretor(Corretor corretor);
    String exibirFuncionario(Funcionario funcionario);

}
