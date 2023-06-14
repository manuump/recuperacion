import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class primosTest {
    @Test
    public void testGenerarPrimos() {
        // Caso de prueba con un número máximo válido
        int max = 20 ;
        int[] expectedPrimos = {2, 3, 5, 7, 11, 13, 17, 19};
        int[] actualPrimos = primos.generarPrimos(max);
        Assertions.assertEquals(expectedPrimos, actualPrimos);
    }
    @Test
    public void testNumeroNegativo(){
        //Caso de prueba con numero negativo
        int max = -2 ;
        int[] expectedPrimos = {2, 3, 5, 7, 11, 13, 17, 19};
        int[] actualPrimos = primos.generarPrimos(max);
        Assertions.assertEquals(expectedPrimos, actualPrimos);
    }
    @Test
    public void testNumeroTresDigitos(){
        //Caso de prueba con numero de tres digitos
        int max = 100 ;
        int[] expectedPrimos = {2, 3, 5, 7, 11, 13, 17, 19};
        int[] actualPrimos = primos.generarPrimos(max);
        Assertions.assertEquals(expectedPrimos, actualPrimos);
    }
}