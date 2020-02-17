package javaapplication1;

import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 *
 * @author narizinho
 */
public abstract class ProcessarBoletos {

    protected abstract List<Boleto> lerArquivo(String nomeArquivo);
    public static final DateTimeFormatter FORMATO_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static final DateTimeFormatter FORMATO_DATA_HORA
            = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");

    public void processar(String nomeArquivo) {
        List<Boleto> boletos = lerArquivo(nomeArquivo);
        boletos.forEach((boleto) -> {
            System.out.println("Id: " + boleto.getId()
                    + " Banco: " + boleto.getCodBanco());
        });
    }
}
