package want.demo.adapter;

import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import want.demo.R;

/**
 * Created by Eviler on 2017/10/23.
 */

public class ListAdapter extends BaseAdapter{

    protected List<String> mData=new ArrayList<>();
    public ListAdapter() {
    }

    public ListAdapter(List<String> mData) {
        this.mData = mData;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int i) {
        return mData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_string,null);
        TextView t=(TextView)v.findViewById(R.id.text);
        t.setText(""+getItem(i));
        return v;
    }
}
