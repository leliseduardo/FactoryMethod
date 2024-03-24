package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoLeituraTemperaturaTest {

    @Test
    void deveExecutarFormatura() {
        IServico servico = ServicoFactory.obterServico("LeituraTemperatura");
        assertEquals("Leitura de temperatura executada", servico.executar());
    }

    @Test
    void deveCancelarFormatura() {
        IServico servico = ServicoFactory.obterServico("LeituraTemperatura");
        assertEquals("Leitura de temperatura cancelada", servico.cancelar());
    }

}