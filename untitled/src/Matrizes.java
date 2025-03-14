public class Matrizes {
    public static void main(String[] args) {
        int m[][] = new int[3][3];

        int m3d[][][] = new int [3][3][3];

        m[0][0] = 1;
        m[1][1] = 1;
        m[2][2] = 1;
        for(int i = 0; i < m.length; i++){
            for(int j=0; i < m[i].length; j++){
                System.out.println(m[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("-----------------");
        for(int vetor[] : m){
            for(int e : vetor){
                System.out.println(e+" ");
            }
            System.out.println();
        }
    }
}
