package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoLeituraGlobalSensoresTest {

    @Test
    void deveExecutarFormatura() {
        IServico servico = ServicoFactory.obterServico("LeituraGlobalSensores");
        assertEquals("Leitura global realizada", servico.executar());
    }

    @Test
    void deveCancelarFormatura() {
        IServico servico = ServicoFactory.obterServico("LeituraGlobalSensores");
        assertEquals("Leitura global cancelada", servico.cancelar());
    }

}