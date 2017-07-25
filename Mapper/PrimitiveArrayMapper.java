package JSONSerializer.Mapper;

import JSONSerializer.Serializer.JsonSerializer;
import JSONSerializer.Writer.IJsonWriter;

public class PrimitiveArrayMapper extends AbstractJsonMapper<Object>{
    public PrimitiveArrayMapper(JsonSerializer serializer) {
        this.serializer=serializer;
    }
    @Override
    public void write(Object obj, IJsonWriter writer) {
        if(nullCheck(obj)){
            writeNull(writer);
        } else {


        }
    }
}
