import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        try{
            int vetor[] = new int[10];
            vetor[20] = 0;
            int a = 10/0;

        }catch(Exception e){
            System.out.println("Erro :"+e.getMessage());
            e.printStackTrace();
        }
    }


    //só pode aceitar valores positivos
    //throws significa que o método pode lançar uma exceção
    public static void metodo(int a) throws Exception{
        if(a<0){
            throw new Exception("O valor do parametro é negativo");
        }
    }

    public static void metodo2(int a){
        if(a<0){
            throw new IllegalArgumentException("A ="+a);
        }
    }

    public static void metodo3(){
        try{
            System.out.println("vai fazer se conseguir");
        }catch (NumberFormatException e) {
            System.out.println("vai fazer se não conseguir");
        }catch (Exception e){
            System.out.println("vai fazer se não conseguir");
        }finally{
            System.out.println("sempre vai fazer");
        }
    }

    double n1 = 10000;
    int n2 = (int) n1;
}