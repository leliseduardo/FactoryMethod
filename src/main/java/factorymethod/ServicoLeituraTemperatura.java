package factorymethod;

public class ServicoLeituraTemperatura implements IServico{
    public String executar() {
        return "Leitura de temperatura executada";
    }

    public String cancelar() {
        return "Leitura de temperatura cancelada";
    }
}
