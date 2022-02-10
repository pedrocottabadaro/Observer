import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
    @Test
    void deveNotificarUmCliente() {
        LojaApple loja = new LojaApple(2022, 1, "Iphone", "15");
        Cliente cliente = new Cliente("Cliente 1");
        cliente.matriculaNewsLetter(loja);
        loja.lancarEmail();
        assertEquals("Cliente 1, email enviado na LojaApple{ano=2022, mes=1, produto='Iphone', versao='15'}", cliente.getUltimaNotificacao());
    }

    @Test
    void deveNotificarClientes() {
        LojaApple loja = new LojaApple(2023, 1, "Macbook", "20");
        Cliente cliente1 = new Cliente("Cliente 1");
        Cliente cliente2 = new Cliente("Cliente 2");
        cliente1.matriculaNewsLetter(loja);
        cliente2.matriculaNewsLetter(loja);
        loja.lancarEmail();
        assertEquals("Cliente 1, email enviado na LojaApple{ano=2023, mes=1, produto='Macbook', versao='20'}", cliente1.getUltimaNotificacao());
        assertEquals("Cliente 2, email enviado na LojaApple{ano=2023, mes=1, produto='Macbook', versao='20'}", cliente2.getUltimaNotificacao());
    }

    @Test
    void naoDeveNotificarCliente() {
        LojaApple loja = new LojaApple(2020, 13 ,"Ipod", "6");
        Cliente cliente = new Cliente("Cliente 1");
        loja.lancarEmail();
        assertEquals(null, cliente.getUltimaNotificacao());
    }

    @Test
    void deveNotificarClienteLojaAppleA() {
        LojaApple lojaA = new LojaApple(2021, 1, "Macbook Air", "7");
        LojaApple lojaB = new LojaApple(2021, 1, "Iphone", "XS");
        Cliente cliente1 = new Cliente("Cliente 1");
        Cliente cliente2 = new Cliente("Cliente 2");
        cliente1.matriculaNewsLetter(lojaA);
        cliente2.matriculaNewsLetter(lojaB);
        lojaA.lancarEmail();
        assertEquals("Cliente 1, email enviado na LojaApple{ano=2021, mes=1, produto='Macbook Air', versao='7'}", cliente1.getUltimaNotificacao());
        assertEquals(null, cliente2.getUltimaNotificacao());
    }
}