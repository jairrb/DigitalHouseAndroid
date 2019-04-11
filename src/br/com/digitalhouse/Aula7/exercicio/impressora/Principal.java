package br.com.digitalhouse.Aula7.exercicio.impressora;

public class Principal {
    public static void main(String[] args) {
        Contrato contrato = new Contrato("contrato","pdf");
        Foto foto = new Foto("foto","png");
        Documento documento = new Documento("curriculo","docx");
        Impressora impressora = new Impressora();

        impressora.adicionarImprimivel(contrato);
        impressora.adicionarImprimivel(foto);
        impressora.adicionarImprimivel(documento);
        impressora.imprimirTudo();

    }


}
