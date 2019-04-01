package khangit.pttbdd.actionbarpractice;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends Activity {
    EditText txtMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtMsg = findViewById(R.id.txtMsg);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.action_search:
                txtMsg.setText("Search...");
                return  true;
            case R.id.action_share:
                txtMsg.setText("Share...");
                return  true;
            case R.id.action_download:
                txtMsg.setText("Download...");
                return  true;
            case R.id.action_settings:
                txtMsg.setText("Settings...");
                return  true;
            case R.id.action_about:
                txtMsg.setText("About...");
                return  true;
        }
        return false;
    }
}
