package JSONSerializer.Mapper;

import JSONSerializer.Writer.IJsonWriter;

public abstract class AbstractJsonMapper<T> {
    protected IJsonSerializer serializer;

    public abstract void write(T obj, IJsonWriter writer);

    protected boolean nullCheck (T obj){
        if(obj==null){
            return true;
        } else {return false;}
    }

    protected void writeNull(IJsonWriter writer){
        writer.writeNull();
    }
}
