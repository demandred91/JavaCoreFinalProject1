package JSONSerializer.Mapper;

import JSONSerializer.Serializer.JsonSerializer;
import JSONSerializer.Writer.IJsonWriter;

import java.lang.reflect.InvocationTargetException;

public class ObjectArrayMapper extends AbstractJsonMapper<Object[]>{
    public ObjectArrayMapper(JsonSerializer serializer) {
        this.serializer=serializer;
    }
    @Override
    public void write(Object[] obj, IJsonWriter writer) {
        if(nullCheck(obj)){
            writeNull(writer);
        } else {
            writer.writeArrayBegin();
            for(int i = 0; i < obj.length; i++){
                Object object = obj[i];
                useReflectionSerializer (object, writer);
                writer.writeSeparator();
            }
            writer.writeArrayEnd();
        }
    }
}
