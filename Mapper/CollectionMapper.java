package JSONSerializer.Mapper;

import JSONSerializer.Writer.IJsonWriter;

import java.util.Collection;

public class CollectionMapper extends AbstractJsonMapper<Collection>{
    public CollectionMapper(IJsonSerializer serializer) {
        this.serializer=serializer;
    }
    @Override
    public void write(Collection obj, IJsonWriter writer) {
        if(nullCheck(obj)){
            writeNull(writer);
        } else {
            writer.writeArrayBegin();
            for(Object collection: obj){
                serializer.serialize(collection, writer);
                writer.writeSeparator();
            }
            writer.writeArrayEnd();
        }
    }
}
