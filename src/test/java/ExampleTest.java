import org.example.Main;
import org.junit.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import org.testng.annotations.AfterTest;

import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.Assert.assertEquals;


public class ExampleTest {
    //Inicjalizacja plikow testowych i spodziewanego outputu
    Path preppedFilePath;
    String expectedOutput;
    String input;

    //Nadanie wartosci przed wykanoniem pierwszego testu
    @Before
    public void setup() {
        preppedFilePath = Path.of("test.csv");
        Files mockFile = Mockito.mock(Files.class);
    }

    //Czyszczenie zmiennych input, expectedOutput po kazdym tescie, tak aby upewnic sie ze na pewno dane zostaly usuniete
    @AfterTest
    public void teardown() {
        expectedOutput = "";
        input="";
    }

    // ---- WLASNE ROZWIAZANIE ----

    /*
    @Test
    public void testWritingToFile() throws Exception {
        input="2,0";
        Main.saveToFile(preppedFilePath, input);
    }*/


    @Test
    public void testReadingFromFile() throws Exception {
        expectedOutput = "[2,0]";
        Main.readFromFile(preppedFilePath);

        //System.out.println("Dane znajdujące się w preparowanym pliku: "+ preppedOutput); //Ta linia nie ma sensu
        assertEquals(Main.output, expectedOutput);
    }

    @Test
    public void testWritingAndReading() throws Exception {
        input="2,0";
        Main.saveToFile(preppedFilePath, input);

        expectedOutput="[2,0]";
        Main.readFromFile(preppedFilePath);
        assertEquals(Main.output, expectedOutput);
    }

}
