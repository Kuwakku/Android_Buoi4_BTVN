package com.example.android_buoi4_btvn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ArrayList<User> mListUsers;
    private UserAdapter mUserAdapter;
    private ListView lvUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initView();
    }

    private void initView() {
        lvUser = findViewById(R.id.lvUser);
        mUserAdapter = new UserAdapter(mListUsers, this);

        lvUser.setAdapter(mUserAdapter);

    }

    private void initData() {
        mListUsers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            User user = new User();
            user.setUserName("User name " + i);
            user.setContent("Content " + i);
            user.setAvatar("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTac6CpjlIClig9Jt1TBvSobdJ5mySsRjdMTg&usqp=CAU");
            user.setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTac6CpjlIClig9Jt1TBvSobdJ5mySsRjdMTg&usqp=CAU");
            mListUsers.add(user);
        }
    }
}