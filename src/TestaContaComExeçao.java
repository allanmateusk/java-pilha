public class TestaContaComExeçao {
    public static void main(String[] args) {
        Conta c  = new Conta();
        try{
        c.deposita();
    } catch(MinhaExeçao ex){
        System.out.println(" tratamento...");
    }
    }
}
