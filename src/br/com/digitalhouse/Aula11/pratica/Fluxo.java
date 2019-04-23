package br.com.digitalhouse.Aula11.pratica;

public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Inicio do método principal");
        try {
            metodo1();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("FUDEU!!!!");
        }
        System.out.println("Fim do método principal");
    }

    public static void  metodo1() throws Exception {
        System.out.println("Inicio do método 1");
        metodo2();
        System.out.println("Fim do método 1");

        throw new Exception("ERRO ARITH");
    }

    private static void metodo2() throws FluxoException {
        System.out.println("Inicio do método 2");
        metodo3();

        if(0==2) {
            throw new ArithmeticException("ARITHMETICEXCEPTION");
        }else{
            throw new FluxoException("FLUXOEXCEPTION");
        }



        //System.out.println("Fim do método 2");
    }

    private static void metodo3() {
        System.out.println("Inicio do método 3");
        Conta conta = null;

        for (int i = 0; i <= 5 ; i++) {
            System.out.println(i);
            int valor = 3;


            try {
                //int numero = valor / 0;
                conta.sacar(3);
            } catch (Exception  e){
                System.out.println(e);
                //System.out.println(e.getMessage());
                //System.out.println(e.getStackTrace());
                //e.printStackTrace();
                break;
            }

        }
        System.out.println("Fim do método 3");
    }

}