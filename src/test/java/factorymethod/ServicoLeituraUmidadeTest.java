package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoLeituraUmidadeTest {

    @Test
    void deveExecutarFormatura() {
        IServico servico = ServicoFactory.obterServico("LeituraUmidade");
        assertEquals("Leitura de umidade executada", servico.executar());
    }

    @Test
    void deveCancelarFormatura() {
        IServico servico = ServicoFactory.obterServico("LeituraUmidade");
        assertEquals("Leitura de umidade cancelada", servico.cancelar());
    }
}