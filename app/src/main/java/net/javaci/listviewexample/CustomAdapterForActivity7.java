package net.javaci.listviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by volkan on 2/2/2016.
 */
public class CustomAdapterForActivity7 extends ArrayAdapter<String> {
    private final Context context;
    private final String[] firstLines;
    private final String[] secondLines;

    public CustomAdapterForActivity7(Context context, String[] firstLines, String[] secondLines) {
        super(context, R.layout.list_layout_for_activity7, firstLines);
        this.context = context;
        this.firstLines = firstLines;
        this.secondLines = secondLines;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.list_layout_for_activity7, parent, false);
        TextView firstLine = (TextView) rowView.findViewById(R.id.firstLine);
        TextView secondLine = (TextView) rowView.findViewById(R.id.secondLine);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        firstLine.setText(firstLines[position]);
        secondLine.setText(secondLines[position]);

        String s = firstLines[position];
        if (s.equals("WindowsMobile")) {
            imageView.setImageResource(R.drawable.windowsmobile_logo);
        } else if (s.equals("iOS")) {
            imageView.setImageResource(R.drawable.ios_logo);
        } else if (s.equals("Blackberry")) {
            imageView.setImageResource(R.drawable.blackberry_logo);
        } else {
            imageView.setImageResource(R.drawable.android_logo);
        }

        return rowView;
    }

    public String[] getFirstLines() {
        return firstLines;
    }

    public String[] getSecondLines() {
        return secondLines;
    }
}