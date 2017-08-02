package JSONSerializer.Writer;

import java.io.Writer;

/**
 * Created by Вова on 22.07.2017.
 */
public class IndentedJsonWriter extends JsonWriter{


    private StringBuilder stringBuilder = new StringBuilder();
    private void indentSize(){
        stringBuilder.append("\n");
        for (int i = 0; i < ++currentLevel; i++){
            for (int j = 0; j < 4; j++){
                stringBuilder.append(' ');
            }
        }
    }

    private void unindentSize(){
        stringBuilder.append("\n");
        for (int i = 0; i < --currentLevel; i++){
            for (int j = 0; j < 4; j++){
                stringBuilder.append(' ');
            }
        }
    }

    private int currentLevel = 0;

    @Override
    public void writeObjectBegin() {
        indentSize();
        super.writeObjectBegin();
    }

    @Override
    public void writeObjectEnd() {
        unindentSize();
        super.writeObjectEnd();
    }

    @Override
    public void writePropertySeparator() {
        stringBuilder.append(' ');
        super.writePropertySeparator();
        stringBuilder.append(' ');
    }
}
