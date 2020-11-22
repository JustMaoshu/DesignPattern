package DecoratorPattern;

import DecoratorPattern.LowerCaseInputStream.LowerCaseInputStream;
import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class LowerCaseInputStreamTest {
    @Test
    public void test1() throws IOException {
        LowerCaseInputStream lcis = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("E:\\GithubRepository\\DesignPattern\\src\\main\\java\\DecoratorPattern\\LowerCaseInputStream\\stream.txt")));
        int c;
        while((c = lcis.read())>=0){
            System.out.print((char)c);
        }
        lcis.close();
    }
}
