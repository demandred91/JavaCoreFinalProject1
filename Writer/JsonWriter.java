package JSONSerializer.Writer;

import java.io.IOException;
import java.io.Writer;


public class JsonWriter implements IJsonWriter{
    private char[] writeBuffer;
    private int WRITE_BUFFER_SIZE = 1024;

    Writer writer = new Writer() {


        @Override
        public void write(char[] cbuf, int off, int len) throws IOException {
            synchronized (lock){
                if (writeBuffer == null){
                    writeBuffer = new char[WRITE_BUFFER_SIZE];
                }
                System.arraycopy(cbuf, 0, writeBuffer, off, len);
            }
        }

        @Override
        public void flush() throws IOException {

        }

        @Override
        public void close() throws IOException {

        }
    };

    @Override
    public void writeArrayBegin() {

    }

    @Override
    public void writeArrayEnd() {

    }

    @Override
    public void writeBoolean(boolean bool) {

    }

    @Override
    public void writeNull() {
        System.out.print("null");
    }

    @Override
    public void writeNumber(int number) {
        System.out.println(number);
    }

    @Override
    public void writeObjectBegin() {

    }

    @Override
    public void writeObjectEnd() {

    }

    @Override
    public void writePropertySeparator() {
        System.out.print(":");
    }

    @Override
    public void writeSeparator() {
        System.out.print(",");
    }

    @Override
    public void writeString(String string) {
        System.out.print("\"" + string + "\"");
    }

    @Override
    public void flush() {

    }

}
