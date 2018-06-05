package admin.trunghq.events;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class EventVariale extends AppCompatActivity {
    View.OnClickListener onClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(EventVariale.this, "Event Listener using Variable", Toast.LENGTH_SHORT).show();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_variale);
        findViewById(R.id.button).setOnClickListener(onClick);
    }
}
