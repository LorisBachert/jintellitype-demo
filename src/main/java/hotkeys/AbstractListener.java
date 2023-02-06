package hotkeys;

import com.melloware.jintellitype.IntellitypeListener;
import com.melloware.jintellitype.JIntellitype;

public abstract class AbstractListener implements com.melloware.jintellitype.HotkeyListener, IntellitypeListener {

    private Integer registerId;
    private Integer intelliTypeId;

    protected AbstractListener(int registerId, int modifier, int key) {
        this.registerId = registerId;
        JIntellitype.getInstance().registerHotKey(registerId, modifier, key);
    }

    protected AbstractListener(int intelliTypeId) {
        this.intelliTypeId = intelliTypeId;
    }

    @Override
    public void onHotKey(int id) {
        if (id == registerId) {
            process();
        }
    }

    @Override
    public void onIntellitype(int id) {
        if (id == intelliTypeId) {
            process();
        }
    }

    abstract void process();
}
