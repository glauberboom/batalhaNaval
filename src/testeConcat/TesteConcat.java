package testeConcat;
public class TesteConcat{
public static void main(String []args){

	/*

  Note qdfgdfgdfue as variáveis 1, 2, 3 e 4 são criadas pelo compilador, que percebe que são iguais,

  criando apenas uma área da memória com o texto "abcdef" e associando ele para as 4 primeiras

  variáveis

*/

String var1 = "abcdef";

String var2 = "abc" + "def";

String var3 = "" + "abcdef";

String var4 = "abcdef" + "";

/*

  As variável 5 é criada durante a execução, pois no momento da compilação o seu conteúdo não é

  conhecido, então o texto "abcdef" será montado em outra área de memória

*/

String var5 = var1 + "";

String parte1 = "abc";

String parte2 = "def";

/*

  Aqui ocorre o mesmo que ocorreu com a variavel 5, ou seja, a variável 6 é composta por duas outras

  variáveis, que serão acessadas somente em tempo de execução, sendo criadas em outra área de memória

*/

String var6 = parte1 + parte2;
System.out.println("\n+++ Conteudo das variaveis");
System.out.println("var1-> " + var1);
System.out.println("var2-> " + var2);
System.out.println("var3-> " + var3);
System.out.println("var4-> " + var4);
System.out.println("var5-> " + var5);
System.out.println("var6-> " + var6);
System.out.println("\n+++ Comparacao com ==");
System.out.println("var1==var2 -> " + (var1==var2));
System.out.println("var1==var3 -> " + (var1==var3));
System.out.println("var1==var4 -> " + (var1==var4));
System.out.println("var2==var3 -> " + (var2==var3));
System.out.println("var3==var4 -> " + (var3==var4));
System.out.println("var4==var5 -> " + (var4==var5));
System.out.println("var1==var5 -> " + (var1==var5));
System.out.println("var1==var6 -> " + (var1==var6));
System.out.println("var5==var6 -> " + (var5==var6));
System.out.println("\n+++ Comparacao com equals");
System.out.println("var1.equals(var2) -> " + (var1.equals(var2)));
System.out.println("var1.equals(var3) -> " + (var1.equals(var3)));
System.out.println("var1.equals(var4) -> " + (var1.equals(var4)));
System.out.println("var2.equals(var3) -> " + (var2.equals(var3)));
System.out.println("var3.equals(var4) -> " + (var3.equals(var4)));
System.out.println("var4.equals(var5) -> " + (var4.equals(var5)));
System.out.println("var1.equals(var5) -> " + (var1.equals(var5)));
System.out.println("var1.equals(var6) -> " + (var1.equals(var6)));
System.out.println("var5.equals(var6) -> " + (var5.equals(var6)));
}
}