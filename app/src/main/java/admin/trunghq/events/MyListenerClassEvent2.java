package admin.trunghq.events;

import android.util.Log;
import android.view.View;

/**
 * @author Hà Quang Trung
 * @version 1.0.0
 * @description
 * @desc Technical Director, FPT-Software.
 * @created 6/6/2018
 * @updated 6/6/2018
 * @modified by
 * @updated on 6/6/2018
 * @since 1.0
 */
public class MyListenerClassEvent2  implements View.OnClickListener {

    private static final String TAG = "LISTENERCLASS";
    @Override
    public void onClick(View v) {
        //Toast.makeText(ListenerClass.this, "Listener inner Class", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onClick2: ");
    }
}