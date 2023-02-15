package com.example.florence.activities_administrator.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.florence.R;
import com.example.florence.classes.Reservation;
import com.example.florence.classes.User;

import java.util.ArrayList;
import java.util.List;

public class UserAdapter extends BaseAdapter {
    private final Context ctx;
    private final int resursaLayout;
    private List<User> users;
    private Button btn;

    public UserAdapter(Context ctx, int resursaLayout, List<User> users) {
        this.ctx = ctx;
        this.resursaLayout = resursaLayout;
        this.users = users;
    }

    @Override
    public int getCount() {
        return users.size();
    }

    @Override
    public Object getItem(int position) {
        if(position>=0 && position<getCount())
        {
            return users.get(position);
        }
        return null;
    }
    public void filterList(List<User> filteredList){
          users=filteredList;
          notifyDataSetChanged();
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=LayoutInflater.from(ctx);
        View view=inflater.inflate(resursaLayout, parent, false);
        User user= (User) getItem(position);

        TextView tvId= view.findViewById(R.id.tvCardId);
        tvId.setText("#Id:"+user.getUserId());

        TextView tvName= view.findViewById(R.id.tvCardName);
        tvName.setText(user.getFirstName()+" "+user.getLastName());

        TextView tvAdress= view.findViewById(R.id.tvCardAddress);
        tvAdress.setText(user.getAddress());

        TextView tvCNP= view.findViewById(R.id.tvCardCNP);
        ImageView imgClient= view.findViewById(R.id.imgClientSex);
        tvCNP.setText(user.getCnp());
        if(user.getCnp().substring(0,1).equalsIgnoreCase("1") ||
                user.getCnp().substring(0,1).equalsIgnoreCase("3") ||
                user.getCnp().substring(0,1).equalsIgnoreCase("5") ||
                user.getCnp().substring(0,1).equalsIgnoreCase("7")
        ){
            imgClient.setImageResource(R.drawable.man);
        } else {
            imgClient.setImageResource(R.drawable.woman);
        }

        TextView tvPhone= view.findViewById(R.id.tvCardPhone);
        tvPhone.setText(user.getPhone());

        TextView tvMail= view.findViewById(R.id.tvCardEmail);
        tvMail.setText(user.getEmail());

        TextView tvRights= view.findViewById(R.id.tvCardRights);
        tvRights.setText("Rights: "+user.isRights());

        Button btn= view.findViewById(R.id.btnAddRights);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(view.getContext(), "Ai apasat pe buton", Toast.LENGTH_SHORT).show();

            }
        });


        return view;
    }
}
