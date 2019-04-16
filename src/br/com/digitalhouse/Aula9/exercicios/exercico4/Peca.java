package br.com.digitalhouse.Aula9.exercicios.exercico4;

 public abstract class Peca {
    private String marca;
    private String modelo;

     public Peca(String marca, String modelo) {
         this.marca = marca;
         this.modelo = modelo;
     }

     public Peca() {
     }

     public String getMarca() {
         return marca;
     }

     public void setMarca(String marca) {
         this.marca = marca;
     }

     public String getModelo() {
         return modelo;
     }

     public void setModelo(String modelo) {
         this.modelo = modelo;
     }

     abstract void retirada();
}
