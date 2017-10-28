package example.com.timtro.adapters;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import example.com.timtro.R;
import example.com.timtro.models.Ungdung;

/**
 * Created by Administrator on 14/09/2017.
 */

public class CustomListItemAdapterActivity6 extends ArrayAdapter<Ungdung> {
    private Activity activity;
    private  int idLayout;
    private ArrayList<Ungdung> list;
    public CustomListItemAdapterActivity6(Activity activity, int idLayout , ArrayList<Ungdung> list){
        super(activity,idLayout,list);
        this.activity=activity;
        this.idLayout=idLayout;
        this.list=list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = activity.getLayoutInflater();
        convertView = inflater.inflate(idLayout,null);
        ImageView img = (ImageView)convertView.findViewById(R.id.imgHoi6);
        TextView app =(TextView) convertView.findViewById(R.id.tvLoi6);
        app.setText(list.get(position).getItem());
        return convertView;
    }
}
