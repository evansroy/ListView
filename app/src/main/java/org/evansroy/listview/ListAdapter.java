package org.evansroy.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ListAdapter extends BaseAdapter {
    //Declare Variables
    Context context;
    String[] Version;
    LayoutInflater inflater;
    public ListAdapter(Context context, String[] mobile){
        this.context = context;
        this.Version = mobile;
    }
    @Override
    public int getCount() {
        return Version.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //Declare Variable
        TextView textVersion;
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.listitem,parent,false);
        //Locate the TextViews in listitem.xml
        textVersion = (TextView)itemView.findViewById(R.id.listItem);
        //Capture position and set to the TextViews
        textVersion.setText(Version[position]);
        return null;
    }
}
