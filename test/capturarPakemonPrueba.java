/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import entornos3t2.Pakemon;
import java.util.Arrays;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author admin
 */
@RunWith(Parameterized.class)
public class capturarPakemonPrueba {
    

    
    private String nombre;
    private boolean resultado;
    private String poke;
    
    public capturarPakemonPrueba(String t) {
        this.poke = t;
    }

    @Parameterized.Parameters
    public static Iterable parametros(){
            return Arrays.asList(new Object[][]{
                {"Diego",false,"Mew"}
            });
}
    
    

    
    @Test
    public void capturarPakemonT() {
        Pakemon instance = new Pakemon(this.nombre);
        boolean expResult = this.resultado;
        boolean result = instance.capturarPakemon(this.poke);
        assertEquals(expResult, result);
        
    }
    
}
