public class FluxoComTratamento {
    public static void main(String[] args) {
        System.out.println("inicio do main");
        try{ metodo1();
        }
        catch (Exception ex){
          String msg= ex.getMessage();
          System.out.println("exception "+msg);
          ex.printStackTrace();
            }
        System.out.println("final do main ");
     }
      private static void metodo1() throws MinhaExeçao{
        System.out.println("inicio do mmetodo 1");
        metodo2();
        System.out.println("final do metodo1 ");
      }
      private static void metodo2() throws MinhaExeçao{
        System.out.println("inicio do metodo 2 ");
        
      throw new ArithmeticException("deu muito errado");
      
        //System.out.println("final do metodo 2");
      }
}
