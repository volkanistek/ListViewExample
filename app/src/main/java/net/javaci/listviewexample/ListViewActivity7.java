package net.javaci.listviewexample;

import android.app.Activity;
import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewActivity7 extends ListActivity {

    static final String[] MOBILE_OS =
            new String[] { "Android", "iOS", "WindowsMobile", "Blackberry"};
    static final String[] MOBILE_VERSION =
            new String[] { "5.0.0", "8.0", "1.0", "10"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new CustomAdapterForActivity7(this, MOBILE_OS, MOBILE_VERSION));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        //get selected items
        CustomAdapterForActivity7 adapter = (CustomAdapterForActivity7) getListAdapter();
        String selectedValue = adapter.getFirstLines()[position] + " - " + adapter.getSecondLines()[position];
        Toast.makeText(this, selectedValue, Toast.LENGTH_SHORT).show();
    }
}
