package com.example.florence.activities_client;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.wifi.hotspot2.pps.HomeSp;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.florence.R;
import com.example.florence.activities_administrator.Admin_HomeActivity;
import com.example.florence.classes.User;
import com.example.florence.fragments.HomeFragment;
import com.example.florence.retrofit_client.RetrofitClient;
import com.example.florence.retrofit_client.WebAPI;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {
    EditText etEmail,etPassword;
    Button loginbtn;
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etEmail = findViewById(R.id.etEmail);
        etPassword= findViewById(R.id.etPassword);

    }

    public void login(View view) {
        String email=etEmail.getText().toString();
        String password=etPassword.getText().toString();

        if(email.isEmpty()){
            etEmail.setError("Please enter email address");
        } else if(password.isEmpty()){
            etPassword.setError("Please enter your password");
        } else if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            etEmail.setError("Please enter a valid mail!");
        } else {
            checkIfEmailExists();
        }
    }

    public void openSignUpForm(View view) {
//        Intent intent=new Intent(this, RegisterFormActivity.class);
//        startActivity(intent);

    }
    public void checkIfEmailExists(){
        WebAPI jsonWebApi= RetrofitClient.getRetrofitInstance().create(WebAPI.class);
        String email=etEmail.getText().toString();
        Call<User> call =jsonWebApi.getUserByEmail(email);
        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                if(!response.isSuccessful()) {
                    etEmail.setError("Your email address doesn't exist");
                }  else {
                    checkEmailAndPassword();
                }
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                Log.e("Error", t.getMessage());

            }
        });


    }
    public  void checkEmailAndPassword() {
        WebAPI jsonWebApi= RetrofitClient.getRetrofitInstance().create(WebAPI.class);
        String email=etEmail.getText().toString();
        String password=etPassword.getText().toString();
        Call<User> call =jsonWebApi.getUserByPasswordAndEmail(email,password);
        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                if(!response.isSuccessful()) {
                    etPassword.setError("Password incorrect");
                }  else {
                    Toast.makeText(getApplicationContext(), "Login successful!", Toast.LENGTH_LONG).show();
                    User user=response.body();

                    if(user.isRights()==false)
                    {
                        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                        startActivity(intent);
                    } else {
                        Intent intent = new Intent(LoginActivity.this, Admin_HomeActivity.class);
                        startActivity(intent);
                    }


                    finish();
                }
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                Log.e("Error", t.getMessage());
            }
        });
    }

    public void sendEmailToResetPassword(View view) {

    }

}

