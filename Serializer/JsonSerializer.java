public class JsonSerializer
{
    public static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");
    public boolean isIndent(){

    }
    public void setIndent(boolean indent){

    }
    public String serialize(Object obj)
            throws new IllegalStateException() {

}
    public void serialize(Object obj, OutputStream stream){
        serialize(obj,stream, DEFAULT_CHARSET);
    }
    public void serialize(Object obj, OutputStream stream, Charset charset){
        serialize(obj,new OutputStreamWriter(stream,charset));
    }
    public void serialize(Object obj,Writer writer){
        
    }
}
