package hotkeys;

import com.melloware.jintellitype.JIntellitype;

public class MyIntelliTypeListener extends AbstractListener {

    public MyIntelliTypeListener() {
        super(JIntellitype.APPCOMMAND_MEDIA_PLAY_PAUSE);
    }

    @Override
    void process() {
        System.out.println("Someone paused the media player");
    }
}
