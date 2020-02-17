package javaapplication1;

/**
 *
 * @author narizinho
 */
public class JavaApplication1 {

    public static void main(String[] args) {
        ProcessarBoletos processarBoleto = new ProcessarBoletoBancoBrasil();
        String nomeArquivo = "banco-brasil-1.csv";
        processarBoleto.processar(nomeArquivo);

//        nomeArquivo = "bradesco-1.csv";
//        ProcessarBoletos leituraBradesco = new ProcessarBoletosBancoBradesco();
//        leituraBradesco.setLeituraRetorno(leituraBradesco);
//        leituraBradesco.processar(nomeArquivo);
    }

}
