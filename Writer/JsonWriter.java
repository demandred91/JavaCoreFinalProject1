package JSONSerializer.Writer;

/**
 * Created by Вова on 22.07.2017.
 */
public class JsonWriter implements IJsonWriter{
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
        System.out.println("null");
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
        System.out.println(":");
    }

    @Override
    public void writeSeparator() {
        System.out.println(",");
    }

    @Override
    public void writeString(String string) {
        System.out.println("\"" + string + "\"");
    }

    @Override
    public void flush() {

    }

}
