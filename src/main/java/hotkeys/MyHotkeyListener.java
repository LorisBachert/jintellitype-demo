package hotkeys;

import com.melloware.jintellitype.JIntellitype;

public class MyHotkeyListener extends AbstractListener {

    public MyHotkeyListener() {
        super(1, JIntellitype.MOD_WIN, (int)'A');
    }

    @Override
    void process() {
        System.out.println("Someone pressed WIN + A");
    }
}
