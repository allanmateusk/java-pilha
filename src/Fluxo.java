public class Fluxo{
 public static void main(String[] args) {
    System.out.println("inicio do main");
    try{metodo1();}catch (Exception ex){
      String msg= ex.getMessage();
         System.out.println("exception "+msg);
ex.printStackTrace();
        }
    System.out.println("final do main ");
 }
  private static void metodo1(){
    System.out.println("inicio do mmetodo 1");
    metodo2();
    System.out.println("final do metodo1 ");
  }
  private static void metodo2(){
    System.out.println("inicio do metodo 2 ");
    for(int i =1;i<=5;i++){
        System.out.println(i);
        
        int a= i/0;
        Conta c = null;
        try{
          c.deposita();
      } catch(MinhaExeçao ex){
          System.out.println(" tratamento...");
      }
  
    System.out.println("final do metodo 2");
  }
}}