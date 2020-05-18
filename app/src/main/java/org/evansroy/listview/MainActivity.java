package org.evansroy.listview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    //Declare Variables
    ListView list;
    ListAdapter adapter;
    String[] Version;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from listview_main.xml
        setContentView(R.layout.activity_main);

        // Locate the ListView in listview_main.xml
        list = findViewById(R.id.listView);

        //Generate the sample data into string arrays
        Version = new String[]{"CUPCAKE","DONUT","ECLAIR",
                "GINGERBREAD","HONEYCOMB","ICECREAMSANDWICH","JELLYBEAN","KITKAT","LOLLIPOP","MARSHMALLOW","NOUGAT","PIE"};
        //Pass results toListViewAdapter class
        adapter = new org.evansroy.listview.ListAdapter(this,Version);
        //Bind the Adapter to the ListView
        list.setAdapter(adapter);
        //Capture ListView item click
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                Toast.makeText(MainActivity.this, "You have selected :" + Version[position], Toast.LENGTH_SHORT).show();

            }
        });

    }
}
