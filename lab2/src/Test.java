import java.io.ByteArrayInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;

public class Test {
    public String description;
    public String test;

    public Test(String description, String test) {
        this.description = description;
        this.test = test;
    }

    public void toDot(String filename) {
        try(FileWriter writer = new FileWriter(filename, false))
        {
            try {
                Tree t = Parser.parse(new ByteArrayInputStream(test.getBytes(StandardCharsets.UTF_8)));
                writer.append(t.toDot(test));
            } catch (AssertionError e) {
                writer.append("test failed: ").append(e.getMessage());
            } catch (ParseException e) {
                writer.append("parse error: ").append(e.getMessage());
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public void check() {
        System.out.println(test + " - " + description);
        try {
            Tree t = Parser.parse(new ByteArrayInputStream(test.getBytes(StandardCharsets.UTF_8)));
            System.out.println("test passed");
        } catch (AssertionError e) {
            System.out.println("test failed: " + e.getMessage());
        } catch (ParseException e) {
            System.out.println("parse error: " + e.getMessage());
        }
    }

    public String getResult() {
        try {
            Tree t = Parser.parse(new ByteArrayInputStream(test.getBytes(StandardCharsets.UTF_8)));
            return "test passed";
        } catch (AssertionError e) {
            return "test failed: " + e.getMessage();
        } catch (ParseException e) {
            return "parse error: " + e.getMessage();
        }
    }
}
