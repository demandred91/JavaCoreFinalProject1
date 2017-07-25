package JSONSerializer.Mapper;

import JSONSerializer.Serializer.JsonSerializer;
import JSONSerializer.Writer.IJsonWriter;

public class NumberMapper extends AbstractJsonMapper<Number>{
    public NumberMapper(JsonSerializer serializer) {
        this.serializer=serializer;
    }
    @Override
    public void write(Number obj, IJsonWriter writer) {
        if(nullCheck(obj)){
            writeNull(writer);
        } else {
            writer.writeNumber(obj);
        }
    }
}
