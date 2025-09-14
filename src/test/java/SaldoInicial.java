import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.DigitalWallet;

import static org.junit.jupiter.api.Assertions.assertThrows;


class SaldoInicial {
        @Test
        public void deveLancarExcecaoParaSaldoInicialNegativo() {
            assertThrows(IllegalArgumentException.class, () -> new DigitalWallet("Arthur", -20));
        }
    }