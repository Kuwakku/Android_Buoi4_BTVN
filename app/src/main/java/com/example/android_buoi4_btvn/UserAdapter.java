package com.example.android_buoi4_btvn;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class UserAdapter extends BaseAdapter {

    private ArrayList<User> mListUsers;
    private Activity mActivity;

    public UserAdapter(ArrayList<User> mListUsers, Activity mActivity) {
        this.mListUsers = mListUsers;
        this.mActivity = mActivity;
    }

    @Override
    public int getCount() {
        return mListUsers != null ? mListUsers.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return mListUsers.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null) {
            convertView = mActivity.getLayoutInflater().inflate(R.layout.layout_item, null, false);
        }
        ImageView imgAvatar = convertView.findViewById(R.id.imgAvatar);
        TextView tvUserName = convertView.findViewById(R.id.tvUserName);
        TextView tvContent = convertView.findViewById(R.id.tvContent);
        ImageView imgContent = convertView.findViewById(R.id.imgContent);

        User user = mListUsers.get(position);
        tvUserName.setText(user.getUserName());
        tvContent.setText(user.getContent());

        Glide.with(mActivity).load(user.getAvatar()).into(imgAvatar);
        Glide.with(mActivity).load(user.getImage()).into(imgContent);

        return convertView;
    }
}
