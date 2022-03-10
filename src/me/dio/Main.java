package me.dio;

import me.dio.models.Endereco;
import me.dio.models.Gerente;
import me.dio.models.OperadorDeCaixa;
import me.dio.models.Vendedor;

public class Main {

    private static String rua;

    public static void main(String[] args) {
	/*Endereco endereco = new Endereco();
    endereco.setRua("Endereço para essa rua");
        System.out.println(endereco.getRua());*/

        Endereco endereco =
                new Endereco("Rua funcionário",
        "Complemento endereço funcionário", "bairro funcionário");
        System.out.println("-----");

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Rogério Matos");
        vendedor.setDocumento("123.456.789-00");
        vendedor.setValorSalario(1200d);
        vendedor.setEndereco(endereco);
        vendedor.calculaBonificacao(2d);
        System.out.println(vendedor);
        System.out.println("-----");

        OperadorDeCaixa operadorCaixa =
                new OperadorDeCaixa("Rogério Op Caixa", "987.654.321-00", 2000d, endereco);
        System.out.println(operadorCaixa);
        System.out.println("-----");

        Gerente gerente = new Gerente();
        gerente.setNome("Roger Gerente");
        gerente.setDocumento("789.545.231-00");
        gerente.setEndereco(endereco);
        gerente.setHorasTrabalhadas(20);
        gerente.setValorHora(100d);

        gerente.calculaRenumeracao();
        gerente.calculaBonificacao(3d);

        System.out.println(gerente);
    }
}
