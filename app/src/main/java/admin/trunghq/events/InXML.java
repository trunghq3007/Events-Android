package admin.trunghq.events;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class InXML extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in_xml);
    }

    public void clickMe(View view) {
        
        Toast.makeText(this, "OnClick In XML", Toast.LENGTH_SHORT).show();
    }
}
