package factorymethod;

public class ServicoLeituraUmidade implements IServico{
    public String executar() {
        return "Leitura de umidade executada";
    }

    public String cancelar() {
        return "Leitura de umidade cancelada";
    }
}
