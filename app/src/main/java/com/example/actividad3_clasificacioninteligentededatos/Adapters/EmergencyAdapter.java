package com.example.actividad3_clasificacioninteligentededatos.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.actividad3_clasificacioninteligentededatos.Models.Emergency;
import com.example.actividad3_clasificacioninteligentededatos.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class EmergencyAdapter extends BaseAdapter {
    private Context context;
    private List<Emergency> list;
    private int layout;


    public EmergencyAdapter(Context context, List<Emergency> list, int layout) {
        this.context = context;
        this.list = list;
        this.layout = layout;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder vh;

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(layout, null);
            vh = new ViewHolder();

            vh.tvType = convertView.findViewById(R.id.textView_typeOfEmergency);
            vh.tvStateName = convertView.findViewById(R.id.textView_stateName);
            vh.tvNumberOfEmergencies = convertView.findViewById(R.id.textView_NumberOfEmergencies);
            vh.tvTotalNumberOfEmergencies = convertView.findViewById(R.id.textView_totalNumberOfEmergencies);
            vh.ivChart = convertView.findViewById(R.id.imageView_chart);

            convertView.setTag(vh);
        } else {
            vh = (ViewHolder) convertView.getTag();
        }

        Emergency currentEmergency = list.get(position);

        vh.tvType.setText(currentEmergency.getTypeOfEmergency());
        vh.tvStateName.setText(currentEmergency.getStateName());
        vh.tvNumberOfEmergencies.setText(currentEmergency.getNumberOfEmergencies()+"");
        vh.tvTotalNumberOfEmergencies.setText("("+ currentEmergency.getTotalNumberOfEmergencies() +" en todo el pais)");

        Picasso.with(context).load(currentEmergency.getImage()).fit().into(vh.ivChart);

        return  convertView;
    }

    public class ViewHolder {
        TextView tvType;
        TextView tvStateName;
        TextView tvNumberOfEmergencies;
        TextView tvTotalNumberOfEmergencies;
        ImageView ivChart;
    }
}
