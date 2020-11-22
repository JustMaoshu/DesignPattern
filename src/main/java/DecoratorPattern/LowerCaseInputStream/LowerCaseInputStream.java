package DecoratorPattern.LowerCaseInputStream;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {
    /**
     * Creates a {@code FilterInputStream}
     * by assigning the  argument {@code in}
     * to the field {@code this.in} so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or {@code null} if
     *           this instance is to be created without an underlying stream.
     */
    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    public int read() throws IOException {
//        int in = super.read();
//        if (in == -1) {
//            return in;
//        }
//        char c = (char) in;
//        if (c >= 'A' && c <= 'Z') {
//            c = Character.toLowerCase(c);
//        }
//        return c;
        int c = super.read();
        return c == -1 ? c : Character.toLowerCase(c);
    }

//    public int read(byte[] b, int off, int len) throws IOException {
//        int result = super.read(b, off, len);
//        for (int i = off; i < off + result; i++) {
//            b[i] = (byte) Character.toLowerCase((char) b[i]);
//        }
//        return result;
//    }
}
