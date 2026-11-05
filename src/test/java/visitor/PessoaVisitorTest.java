package visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaVisitorTest {

    @Test
    void deveExibirSegurado() {
        Segurado segurado = new Segurado(1, "Ana", new Apolice("2026-1"));

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Segurado{codigo=1, nome='Ana', apolice=2026-1}", visitor.exibir(segurado));
    }

    @Test
    void deveExibirCorretor() {
        Corretor corretor = new Corretor(2, "Maria", "10.2026.123");

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Corretor{codigo=2, nome='Maria', registroSusep='10.2026.123'}", visitor.exibir(corretor));
    }

    @Test
    void deveExibirFuncionario() {
        Funcionario funcionario = new Funcionario(3, "Pedro", 4500.0f);

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Funcionario{codigo=3, nome='Pedro', salario=4500.0}", visitor.exibir(funcionario));
    }

}
