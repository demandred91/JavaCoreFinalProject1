package JSONSerializer.Writer;





public class JsonWriter implements IJsonWriter{

    JsonWriter(){
        StringBuilder stringBuilder = this.stringBuilder;
    }
    private StringBuilder stringBuilder = new StringBuilder();


    private void deleteLastSeparator(){
        if (stringBuilder.charAt(stringBuilder.length()-1) == ','){
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }
    }
    @Override
    public void writeObjectBegin() {
            stringBuilder.append('{');
    }

    @Override
    public void writeObjectEnd() {
        deleteLastSeparator();
        stringBuilder.append('}');
    }

    @Override
    public void writeArrayBegin(){
        stringBuilder.append('[');
    }

    @Override
    public void writeArrayEnd() {
        deleteLastSeparator();
        stringBuilder.append(']');
    }

    @Override
    public void writeBoolean(boolean obj) {
            stringBuilder.append(obj ? "true" : "false");
    }

    @Override
    public void writeNull() {
            stringBuilder.append("null");

    }

    @Override
    public void writeNumber(Number number) {
            stringBuilder.append((int) number);

    }



    @Override
    public void writePropertySeparator() {
            stringBuilder.append(':');

    }

    @Override
    public void writeSeparator() {
            stringBuilder.append(',');

    }

    @Override
    public void writeString(String string) {
            stringBuilder.append("\"" + string + "\"");

    }


}
