package JSONSerializer.Mapper;

import JSONSerializer.Serializer.JsonSerializer;
import JSONSerializer.Writer.IJsonWriter;

public class BooleanMapper extends AbstractJsonMapper<Boolean>{
    public BooleanMapper(JsonSerializer serializer) {
        this.serializer=serializer;
    }
    @Override
    public void write(Boolean obj, IJsonWriter writer) {
        if(nullCheck(obj)){
            writeNull(writer);
        } else {
            writer.writeBoolean(obj);
        }
    }
}
