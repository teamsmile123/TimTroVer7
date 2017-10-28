package example.com.timtro.adapters;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import example.com.timtro.models.BaoCao;
import example.com.timtro.R;

/**
 * Created by Administrator on 14/09/2017.
 */

public class CustomListItemAdapterActivityBaoCao extends ArrayAdapter<BaoCao> {
    private Activity activity;
    private  int idLayout;
    private ArrayList<BaoCao> list;
    public CustomListItemAdapterActivityBaoCao(Activity activity, int idLayout , ArrayList<BaoCao> list){
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
        TextView title =(TextView) convertView.findViewById(R.id.tvTitle);
        TextView detail =(TextView) convertView.findViewById(R.id.tvDetail);
        title.setText(list.get(position).getTitle());
        detail.setText(list.get(position).getDetail());
        return convertView;
    }
}
