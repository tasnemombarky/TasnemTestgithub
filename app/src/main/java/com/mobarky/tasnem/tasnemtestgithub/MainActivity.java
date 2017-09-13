package com.mobarky.tasnem.tasnemtestgithub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.mnItmScreen1:
                Toast.makeText(getBaseContext(),"Hello in page1",Toast.LENGTH_LONG).show();
                break;
            case R.id.mnItmScreen2:
                Toast.makeText(getBaseContext(),"Hello in page2",Toast.LENGTH_LONG).show();
                break;
            case R.id.mnItmScreen3:
                Toast.makeText(getBaseContext(),"Hello in page3",Toast.LENGTH_LONG).show();
                break;
            case R.id.mnItmScreen4:
                Toast.makeText(getBaseContext(),"Hello in page4",Toast.LENGTH_LONG).show();
                break;

        }
        return true;

    }
}
