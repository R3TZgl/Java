import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PotenciaTest {
    @Test //Anotação que indica que é um teste unitário
    public void NumeroElevadoAZero(){
        long esperado = 1;
        long resposta = Main.potencia(2, 0);
        Assertions.assertEquals(esperado,
                resposta,
                "Um número elevado a zero deve ser um.");
    }

    @Test //Anotação que indica que é um teste unitário
    public void NumeroElevadoAUm(){
        long esperado = 2;
        long resposta = Main.potencia(2, 1);
        Assertions.assertEquals(esperado,
                resposta,
                "Um número elevado a zero deve ser ele mesmo.");
    }
}
