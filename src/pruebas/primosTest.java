package pruebas;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class primosTest {
        @Test
        public void testGenerarPrimos() {

            // Caso de prueba con un número máximo válido
            int max = 20;
            int[] expectedPrimos = {2, 3, 5, 7, 11, 13, 17, 19};
            primosTest primos;
            int[] actualPrimos = primos.generarPrimos(max);
            Assertions.assertArrayEquals(expectedPrimos, actualPrimos);

            // Caso de prueba con un número máximo inválido (menor a 2)
            max = 1;
            int[] expectedPrimosEmpty = {};
            actualPrimos = primos.generarPrimos(max);
            Assertions.assertArrayEquals(expectedPrimosEmpty, actualPrimos);
        }
}
