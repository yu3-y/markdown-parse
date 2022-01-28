import static org.junit.Assert.*;
import org.junit.*;
import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParseTest {
   
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    @Test
    public void testgelinks() throws IOException{
        Path filename = Path.of("test-file.md");
        String contents = Files.readString(filename);
        List<String> op = List.of("https://something.com","some-page.html");
        assertEquals(op, MarkdownParse.getLinks(contents));
    }
}
