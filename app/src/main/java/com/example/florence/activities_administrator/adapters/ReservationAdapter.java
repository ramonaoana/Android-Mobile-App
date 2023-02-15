package com.example.florence.activities_administrator.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.florence.classes.Reservation;

import java.util.List;

public class ReservationAdapter extends BaseAdapter {
    private final Context ctx;
    private final int resursaLayout;
    private final List<Reservation> reservations;

    public ReservationAdapter(Context ctx, int resursaLayout, List<Reservation> reservations) {
        this.ctx = ctx;
        this.resursaLayout = resursaLayout;
        this.reservations = reservations;
    }

    @Override
    public int getCount() {
        return reservations.size();
    }

    @Override
    public Object getItem(int position) {
        if(position>=0 && position<getCount())
        {
            return reservations.get(position);
        }
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=LayoutInflater.from(ctx);
        View view=inflater.inflate(resursaLayout, parent, false);
        Reservation c= (Reservation) getItem(position);

        return view;
    }
}
