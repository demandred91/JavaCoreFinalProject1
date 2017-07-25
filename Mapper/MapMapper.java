package JSONSerializer.Mapper;

import JSONSerializer.Serializer.JsonSerializer;
import JSONSerializer.Writer.IJsonWriter;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;

public class MapMapper extends AbstractJsonMapper<Map> {
    public MapMapper(JsonSerializer serializer) {
        this.serializer=serializer;
    }
    @Override
    public void write(Map obj, IJsonWriter writer) {
        if(nullCheck(obj)){
            writeNull(writer);
        } else {
            writer.writeArrayBegin();
            Collection keys = obj.keySet();
            Collection values = obj.values();
            Object[] keyArray = keys.toArray();
            Object[] valueArray = values.toArray();
            for (int i = 0; i < keyArray.length; i++) {
                writer.writeString(keyArray[i].toString());
                writer.writePropertySeparator();
                try {
                    serializer.getClass().getDeclaredMethod("serialize",Object.class, IJsonWriter.class).invoke(serializer,obj, writer);
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
