package JSONSerializer.Mapper;

import JSONSerializer.Serializer.JsonSerializer;
import JSONSerializer.Writer.IJsonWriter;

public class StringMapper extends AbstractJsonMapper<Object>{
    public StringMapper(JsonSerializer serializer) {
        this.serializer=serializer;
    }

    @Override
    public void write(Object obj, IJsonWriter writer) {
        if(nullCheck(obj)){
            writeNull(writer);
        } else {
            writer.writeString("" + obj);
        }
    }
}
