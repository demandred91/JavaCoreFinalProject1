package JSONSerializer.Mapper;

import JSONSerializer.Writer.IJsonWriter;

public class NumberMapper extends AbstractJsonMapper<Number>{
    public NumberMapper(IJsonSerializer serializer) {
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
