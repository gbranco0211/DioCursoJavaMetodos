package dio.metodos;

public class Main{

    public static void main (String[] args) {
      System.out.println("Exercício Calculadora:");
        Calculadora.soma(2,5);
        Calculadora.subtracao(6,2);
        Calculadora.multipicacao(10,10);
        Calculadora.divisao(9,3);

      System.out.println("Exercício Mensagem");
        Mensagem.obterMensagem(1);
        Mensagem.obterMensagem(13);
        Mensagem.obterMensagem(10);
        Mensagem.obterMensagem(25);

       System.out.println("Exercpicio Emprestimo");
        Emprestimo.calcular(1500, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(2500, Emprestimo.getTresParcelas());
        Emprestimo.calcular(300,2);
        Emprestimo.calcular(220,5);


    }
}
