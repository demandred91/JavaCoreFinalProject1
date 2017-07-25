package JSONSerializer.Mapper;

import JSONSerializer.Serializer.JsonSerializer;
import JSONSerializer.Writer.IJsonWriter;

import java.lang.reflect.InvocationTargetException;
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
                try {
                    serializer.getClass().getDeclaredMethod("serialize",Object.class, IJsonWriter.class).invoke(serializer,object, writer);
                } catch (NoSuchMethodException e) {
                    System.err.println("No such method");
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
                writer.writeSeparator();
            }
            writer.writeArrayEnd();
        }
    }
}
