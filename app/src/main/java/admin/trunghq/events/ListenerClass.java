package admin.trunghq.events;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ListenerClass extends AppCompatActivity {

    private static final String TAG = "LISTENERCLASS";

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listener_class);
        findViewById(R.id.button).setOnClickListener(new MyListenerClassEvent());


        button = findViewById(R.id.button2);
        button.setOnClickListener(new MyListenerClassEvent2());
        findViewById(R.id.button3).setOnClickListener(new MyListenerClassEvent3());
    }

    /**
     * The type My listener class event.
     */
    class MyListenerClassEvent implements View.OnClickListener {

        @Override
        public void onClick(View v) {

            Log.d(TAG, "onClick1: ");
            //Toast.makeText(ListenerClass.this, "Listener inner Class", Toast.LENGTH_SHORT).show();

        }
    }
}


class MyListenerClassEvent3 implements View.OnClickListener {

    private static final String TAG = "LISTENERCLASS";

    @Override
    public void onClick(View v) {
        //Toast.makeText(ListenerClass.this, "Listener inner Class", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onClick3: ");
    }
}
