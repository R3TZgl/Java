
public class Main {
    public static void main(String[] args) {
        int vetor[] = new int[10];
        vetor[1] = 10;
        System.out.println(vetor);
        for(int i = 0; i < vetor.length; i++){
            System.out.println("vetor["+i+"] = "+vetor[i]);
        }
        for(int i: vetor){
            System.out.println(i+",");
        }
        System.out.println();
        int v[] = {1,3,9,0,10};
        for(int i: v){
            System.out.println(i+",");
        }
    }
}