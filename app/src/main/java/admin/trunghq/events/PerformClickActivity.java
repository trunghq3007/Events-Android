package admin.trunghq.events;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class PerformClickActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perform_click);
        LinearLayout ll = (LinearLayout) findViewById(R.id.ll);

        Button btnLogin = new android.support.v7.widget.AppCompatButton(this) {
            @Override
            public boolean performClick() {
                Toast.makeText(PerformClickActivity.this, "performClick method", Toast.LENGTH_SHORT).show();
                return super.performClick();
            }
        };
        btnLogin.setText("Login");
        ll.addView(btnLogin);
    }
}
