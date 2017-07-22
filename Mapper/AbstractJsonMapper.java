package JSONSerializer.Mapper;

public abstract class AbstractJsonMapper<T> {
    protected IJsonSerializer serializer;

    public abstract void write(T obj, IJsonWriter writer);

    protected boolean nullCheck (T obj){

        return false;
    }

    protected void writeNull(IJsonWriter writer){

    }
}
