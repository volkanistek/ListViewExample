package net.javaci.listviewexample;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewActivity6 extends ListActivity {

    static final String[] MOBILE_OS =
            new String[] { "Android", "iOS", "WindowsMobile", "Blackberry"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new CustomAdapterForActivity6(this, MOBILE_OS));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        //get selected items
        String selectedValue = (String) getListAdapter().getItem(position);
        Toast.makeText(this, selectedValue, Toast.LENGTH_SHORT).show();
    }
}
