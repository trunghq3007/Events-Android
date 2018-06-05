package admin.trunghq.events;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * The type Main activity.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Btn on click.
     *
     * @param view the view
     */
    public void btnOnClick(View view) {
        switch (view.getId()) {
            case R.id.inXML:
                click(new InXML());
                break;
            case R.id.lopNacDanh:
                click(new LopNacDanh());
                break;
            case R.id.iplOnclickListener:
                click(new ImplementOnClickListenerInterface());
                break;
            case R.id.eventVariable:
                click(new EventVariale());
                break;
            case R.id.listenerClass:
                click(new ListenerClass());
                break;
            case R.id.performClick:
                click(new PerformClickActivity());
                break;
        }


    }

    private void click(AppCompatActivity appCompatActivity) {
        Intent intent = new Intent(this, appCompatActivity.getClass());
        startActivity(intent);
    }
}
