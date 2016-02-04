package net.javaci.listviewexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        Button button = (Button) view;
        Intent myIntent = null;
        if (button.getId() == R.id.ornek1) {
            myIntent = new Intent(this, ListViewActivity1.class);
        } else if (button.getId() == R.id.ornek2) {
            myIntent = new Intent(this, ListViewActivity2.class);
        } else if (button.getId() == R.id.ornek3) {
            myIntent = new Intent(this, ListViewActivity3.class);
        } else if (button.getId() == R.id.ornek3_1) {
            myIntent = new Intent(this, ListViewActivity3_1.class);
        } else if (button.getId() == R.id.ornek4) {
            myIntent = new Intent(this, ListFragmentActivity4.class);
        } else if (button.getId() == R.id.ornek5) {
            myIntent = new Intent(this, ListViewActivity5.class);
        } else if (button.getId() == R.id.ornek6) {
            myIntent = new Intent(this, ListViewActivity6.class);
        } else if (button.getId() == R.id.ornek7) {
            myIntent = new Intent(this, ListViewActivity7.class);
        }

        startActivity(myIntent);
    }
}
