package JSONSerializer.Writer;

import java.io.ByteArrayOutputStream;
import java.io.Writer;


public class JsonWriter implements IJsonWriter{

    ByteArrayOutputStream stream = new ByteArrayOutputStream();
    Writer

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
