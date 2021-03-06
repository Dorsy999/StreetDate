package com.cascaed.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.ImageView;

import com.cascaed.models.NavItem;
import com.cascaed.www.game_release.R;

import java.util.List;

/**
 * Created by Oniji on 27/07/2016.
 */
public class NavListAdapter extends ArrayAdapter<NavItem>{

    Context context;
    int resLayout;
    List<NavItem> listNavItems;

    public NavListAdapter(Context context, int resLayout, List<NavItem> listNavItems) {
        super(context, resLayout, listNavItems);
        this.context = context;
        this.resLayout = resLayout;
        this.listNavItems = listNavItems;

    }

    @SuppressLint("ViewHolder") @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = View.inflate(context, resLayout, null);

        TextView tvTitle = (TextView) v.findViewById(R.id.title);
        ImageView navIcon = (ImageView) v.findViewById(R.id.nav_icon);

        NavItem navItem = listNavItems.get(position);

        tvTitle.setText(navItem.getTitle());
        navIcon.setImageResource(navItem.getResIcon());


        return v;
    }
}
