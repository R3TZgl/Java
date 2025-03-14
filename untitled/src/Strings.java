public class Strings {
    public void main(Strings[] args){
        char vetor[] = {'o', 'l', 'a'};
        String texto = "ola";
        for(int i=0; i<texto.length(); i++){
            System.out.println(texto.carAt(i));
        }
        texto.replace("o", "x");
        texto.toLowerCase();
        texto.toUpperCase();
        texto.contains("l");
        texto.indexOf("l");
        System.out.println(texto);
    }
}
