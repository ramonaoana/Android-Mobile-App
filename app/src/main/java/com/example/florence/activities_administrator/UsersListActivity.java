package com.example.florence.activities_administrator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.florence.R;
import com.example.florence.activities_administrator.adapters.UserAdapter;
import com.example.florence.classes.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class UsersListActivity extends AppCompatActivity {
    List<User> users;
    UserAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users_list);

        users=getIntent().getParcelableArrayListExtra("users");
        adapter = new UserAdapter(this, R.layout.item_user, users);

        ListView lv = findViewById(R.id.lsUsers);
        lv.setAdapter(adapter);
        EditText search= findViewById(R.id.etSearchClient);

        search.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                filter(s.toString());
            }
        });
    }

    private void filter(String text){
        List<User> filteredUsers=new ArrayList<>();
        for(User user: users){
            if(user.getFirstName().toLowerCase().contains(text.toLowerCase()) ||
                    user.getLastName().toLowerCase().contains(text.toLowerCase()) ||
                    user.getAddress().toLowerCase().contains(text.toLowerCase()) ||
                    user.getEmail().toLowerCase().contains(text.toLowerCase()) ||
                    user.getUserId().toString().contains(text)  ||
                    user.getCnp().contains(text))
            {
                filteredUsers.add(user);
            }
        }
        adapter.filterList(filteredUsers);
    }
}