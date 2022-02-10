package com.example.papago;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;


import java.util.ArrayList;

public class CustomListAdapter extends BaseAdapter {
    public ArrayList<ListItem> list;

    public CustomListAdapter() {
        list = new ArrayList<ListItem>();
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }
    public void addItem(Drawable img, String txt){
        list.add(new ListItem(img,txt));
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final int pos = i;
        final Context context = viewGroup.getContext();

        if(view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.custom_spinner,viewGroup,false);
        }
        ImageView iconImageView = view.findViewById(R.id.img_lang);

        ListItem item = list.get(i);

        iconImageView.setImageDrawable(item.getImgLang());


        return view;
    }
}
