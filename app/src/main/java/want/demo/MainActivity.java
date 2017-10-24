package want.demo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ListViewCompat;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.List;

import want.demo.adapter.ListAdapter;

public class MainActivity extends AppCompatActivity {

    ListViewCompat listView;
    List<String> mData = new ArrayList<>();
    ListAdapter adapter=new ListAdapter(mData);

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adapter=new ListAdapter(mData);
        listView = (ListViewCompat) findViewById(R.id.listView);
        listView.setAdapter(adapter);
        for (int i = 1; i < 20; i++) {
            mData.add("第"+i+"项");
        }
        adapter.notifyDataSetChanged();

    }


}
