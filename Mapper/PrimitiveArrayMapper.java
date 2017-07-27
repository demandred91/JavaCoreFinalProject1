package JSONSerializer.Mapper;

import JSONSerializer.Serializer.JsonSerializer;
import JSONSerializer.Writer.IJsonWriter;

public class PrimitiveArrayMapper extends AbstractJsonMapper<Object>{
    public PrimitiveArrayMapper(JsonSerializer serializer) {
        this.serializer=serializer;
    }
    @Override
    public void write(Object obj, IJsonWriter writer) {
        if(nullCheck(obj)){
            writeNull(writer);
        } else {
            writer.writeArrayBegin();

            if(byte[].class.getCanonicalName().equals(obj.getClass().getCanonicalName())) {
                for(int i = 0; i < ((byte[])obj).length; i++){
                    useReflectionSerializer (((byte[])obj)[i], writer);
                }
            } else if(short[].class.getCanonicalName().equals(obj.getClass().getCanonicalName())) {
                for(int i = 0; i < ((short[])obj).length; i++){
                    useReflectionSerializer (((short[])obj)[i], writer);
                }
            } else if(char[].class.getCanonicalName().equals(obj.getClass().getCanonicalName())) {
                if(((char[])obj).length > 0){
                    for(Character object : (char[])obj){
                        useReflectionSerializer (object, writer);
                        writer.writeSeparator();
                    }
                }
            } else if(int[].class.getCanonicalName().equals(obj.getClass().getCanonicalName())) {
                for(int i = 0; i < ((int[])obj).length; i++){
                    useReflectionSerializer (((int[])obj)[i], writer);
                }
            } else if(long[].class.getCanonicalName().equals(obj.getClass().getCanonicalName())) {
                for(int i = 0; i < ((long[])obj).length; i++){
                    useReflectionSerializer (((long[])obj)[i], writer);
                }
            } else if(float[].class.getCanonicalName().equals(obj.getClass().getCanonicalName())) {
                for(int i = 0; i < ((float[])obj).length; i++){
                    useReflectionSerializer (((float[])obj)[i], writer);
                }
            } else if(double[].class.getCanonicalName().equals(obj.getClass().getCanonicalName())) {
                for(int i = 0; i < ((double[])obj).length; i++){
                    useReflectionSerializer (((double[])obj)[i], writer);
                }
            } else if(boolean[].class.getCanonicalName().equals(obj.getClass().getCanonicalName())) {
                if(((boolean[])obj).length > 0){
                    for(Object object : (boolean[])obj){
                        useReflectionSerializer (object, writer);
                        writer.writeSeparator();
                    }
                }
            }
            writer.writeArrayEnd();

        }
    }

}
