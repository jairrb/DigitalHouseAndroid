package br.com.digitalhouse.Aula6.tarefa1;

public class TestaCadastro {
    public static void main(String[] args) {
        Data data1 = new Data();
        Data data2 = new Data();
        Data data3 = new Data();
        CadastroPessoas cadastro = new CadastroPessoas();

        data1.setDia(1);
        data1.setMes(2);
        data1.setAno(1988);
        System.out.println("Cadastrando Gerente...");
        Gerente gerente = new Gerente("TI","Big Boss",data1);
        gerente.setSalario(16000.00);
        cadastro.cadastraPessoa(gerente);

        data2.setDia(3);
        data2.setMes(4);
        data2.setAno(1989);
        System.out.println("Cadastrando Funcionario...");
        Funcionario funcionario = new Funcionario("Peon",data2);
        funcionario.setSalario(3500.00);
        cadastro.cadastraPessoa(funcionario);

        data3.setDia(5);
        data3.setMes(6);
        data3.setAno(1990);
        System.out.println("Cadastrando Cliente...");
        Cliente cliente = new Cliente(123456,"Joaozinho",data3);
        cadastro.cadastraPessoa(cliente);

        cadastro.imprimeCadastro();
    }
}
