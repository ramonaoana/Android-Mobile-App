package com.example.florence.activities_administrator;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.florence.R;
import com.example.florence.classes.User;
import com.example.florence.retrofit_client.RetrofitClient;
import com.example.florence.retrofit_client.WebAPI;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Admin_HomeActivity extends AppCompatActivity {
    List<User> users;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_home);
        setMessageToSalut();
        users=new ArrayList<>();
        getUsersFromWebAPI();

    }

    private void getUsersFromWebAPI(){
        WebAPI jsonWebApi= RetrofitClient.getRetrofitInstance().create(WebAPI.class);
        Call<List<User>> call =jsonWebApi.getUsers();
        call.enqueue(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                if(!response.isSuccessful()) {
                    Log.e("Eroare: ", "response code is: "+response.code());
                }  else {
                    users=response.body();
                }
            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {
                Log.e("Error", t.getMessage());
            }
        });

    }

    private void setMessageToSalut(){
        Calendar c = Calendar.getInstance();
        int timeOfDay = c.get(Calendar.HOUR_OF_DAY);
        ScrollView scrollView = findViewById(R.id.scrollViewAdminHomeActivity);

        if(timeOfDay >= 0 && timeOfDay < 10){

            TextView etMessageSalut=findViewById(R.id.tvMessageSalute);
            ImageView imageView=findViewById(R.id.imgMessageSalute);
            imageView.setImageResource(R.drawable.cloudy);
            etMessageSalut.setText("Good Morning!");
            scrollView.setBackgroundResource(R.color.blue_sky);

        }else if(timeOfDay >= 10 && timeOfDay < 18){
            TextView etMessageSalut=findViewById(R.id.tvMessageSalute);
            ImageView imageView=findViewById(R.id.imgMessageSalute);
            imageView.setImageResource(R.drawable.sunrise);
            etMessageSalut.setText("Good Afternoon!");
            scrollView.setBackgroundResource(R.color.golden_yellow);
        }else if(timeOfDay >= 18 && timeOfDay < 21){
            Toast.makeText(this, "Good Evening", Toast.LENGTH_SHORT).show();
            TextView etMessageSalut=findViewById(R.id.tvMessageSalute);
            ImageView imageView=findViewById(R.id.imgMessageSalute);
            imageView.setImageResource(R.drawable.moon);
            etMessageSalut.setText("Good Evening!");
            scrollView.setBackgroundResource(R.color.azure);
        }else if(timeOfDay >= 21 && timeOfDay < 24){
            Toast.makeText(this, "Good Night", Toast.LENGTH_SHORT).show();
            TextView etMessageSalut=findViewById(R.id.tvMessageSalute);
            ImageView imageView=findViewById(R.id.imgMessageSalute);
            imageView.setImageResource(R.drawable.moon);
            etMessageSalut.setText("Good Night!");
            scrollView.setBackgroundResource(R.color.denim);
        }

    }

    public void showReservations(View view) {

    }

    public void showClients(View view) {
        Intent it=new Intent(this, UsersListActivity.class);
        it.putExtra("users", (Serializable) users);
        startActivity(it);
    }
}