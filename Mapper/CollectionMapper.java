package JSONSerializer.Mapper;

import JSONSerializer.Serializer.JsonSerializer;
import JSONSerializer.Writer.IJsonWriter;

import java.util.Collection;

public class CollectionMapper extends AbstractJsonMapper<Collection>{
    public CollectionMapper(JsonSerializer serializer) {
        this.serializer=serializer;
    }
    @Override
    public void write(Collection obj, IJsonWriter writer) {
        if(nullCheck(obj)){
            writeNull(writer);
        } else {
            writer.writeArrayBegin();
            for(Object object: obj){
                serializer.serialize(object, writer);
                writer.writeSeparator();
            }
            writer.writeArrayEnd();
        }
    }
}
