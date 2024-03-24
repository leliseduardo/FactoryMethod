package factorymethod;

public class ServicoLeituraGlobalSensores implements IServico {
    public String executar() {
        return "Leitura global realizada";
    }

    public String cancelar() {
        return "Leitura global cancelada";
    }
}
