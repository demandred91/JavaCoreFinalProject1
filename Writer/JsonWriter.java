package JSONSerializer.Writer;


import java.io.IOException;
import java.io.Writer;


public class JsonWriter implements IJsonWriter{

    Writer writer = new Writer() {


        @Override
        public void write(char[] cbuf, int off, int len) throws IOException {
            this.append()
        }

        @Override
        public void flush() throws IOException {

        }

        @Override
        public void close() throws IOException {

        }
    };

    @Override
    public void writeObjectBegin() {

    }

    @Override
    public void writeObjectEnd() {

    }

    @Override
    public void writeArrayBegin(){
        try {
            writer.append('[');
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void writeArrayEnd() {

    }

    @Override
    public void writeBoolean(boolean obj) {
        try {
            writer.append(obj ? "true" : "false");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void writeNull() {
        try {
            writer.append("null");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void writeNumber(Number number) {
        try {
            writer.write((int) number);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    @Override
    public void writePropertySeparator() {
        try {
            writer.append(':');
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void writeSeparator() {
        try {
            writer.append(',');
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void writeString(String string) {
        try {
            writer.write("\"" + string + "\"");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
