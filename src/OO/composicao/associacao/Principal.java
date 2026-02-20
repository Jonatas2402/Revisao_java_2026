package OO.composicao.associacao;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Carro fusca = new Carro(30);
        fusca.mostrasrCilindradas();

        Funcionario joao = new Funcionario("João");
        Funcionario antonio = new Funcionario("Antonio");
        Funcionario jose = new Funcionario("Jose");

        List<Funcionario> listaDeFuncionario = new ArrayList<>();

        listaDeFuncionario.add(joao);
        listaDeFuncionario.add(antonio);
        listaDeFuncionario.add(jose);

        Departamento depTi = new Departamento("TI", listaDeFuncionario);
        depTi.mostrarFuncionarios();

        /*Criando um departamento sem funcionários*/
        Departamento marketing = new Departamento("Marketing", Collections.emptyList());
        marketing.mostrarFuncionarios();

    }
}
