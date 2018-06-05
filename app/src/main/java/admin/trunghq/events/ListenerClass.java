package admin.trunghq.events;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ListenerClass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listener_class);
        findViewById(R.id.button).setOnClickListener(new MyListenerClassEvent());
    }

    /**
     * The type My listener class event.
     */
    class MyListenerClassEvent implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Toast.makeText(ListenerClass.this, "Listener inner Class", Toast.LENGTH_SHORT).show();

        }
    }
}

