package JSONSerializer.Mapper;

import JSONSerializer.Serializer.JsonSerializer;
import JSONSerializer.Writer.IJsonWriter;

import java.lang.reflect.InvocationTargetException;

public abstract class AbstractJsonMapper<T>{
    protected JsonSerializer serializer;

    public abstract void write(T obj, IJsonWriter writer);

    protected boolean nullCheck (T obj){
        if(obj==null){
            return true;
        } else {return false;}
    }

    protected void writeNull(IJsonWriter writer){
        writer.writeNull();
    }
    protected void useReflectionSerializer (Object object, IJsonWriter writer){
        try {
            serializer.getClass().getDeclaredMethod("serialize",Object.class, IJsonWriter.class).invoke(serializer,object, writer);
        } catch (NoSuchMethodException e) {
            System.err.println("No such method");
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
