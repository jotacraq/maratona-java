package dev.jotacraq.maratonajava.javacore.Kenum.test;

import dev.jotacraq.maratonajava.javacore.Kenum.dominio.Cliente;
import dev.jotacraq.maratonajava.javacore.Kenum.dominio.TipoCliente;
import dev.jotacraq.maratonajava.javacore.Kenum.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa Captain", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Tsubasa Captain", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(300));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(600));
        TipoCliente tipoCliente = TipoCliente.tipoCLientePorNomeRelatorio("Pessoa Fisica");
        TipoCliente tipoCliente2 = TipoCliente.tipoCLientePorNomeRelatorio("Pessoaa Fisica");
        System.out.println(tipoCliente);
        System.out.println(tipoCliente2);
    }
}
