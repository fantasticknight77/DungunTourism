package com.example.dunguntourism;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class ProfileFragment extends Fragment {

    public ProfileFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_profile, container, false);
        TextView name, email, phone;
        Button editProfile, btnLogout;
        UserDatabaseHelper UDH;
        SessionManager SM = new SessionManager(v.getContext());
        name = v.findViewById(R.id.tvName);
        email = v.findViewById(R.id.tvEmail);
        phone = v.findViewById(R.id.tvPhoneNo);
        editProfile = v.findViewById(R.id.btnEditProfile);
        btnLogout = v.findViewById(R.id.buttonLogout);
        UDH = new UserDatabaseHelper(v.getContext());

        User user = UDH.getUserInformation(SM.getLoginUser());
        name.setText(user.getUsername());
        email.setText(user.getEmail());
        phone.setText(user.getPhone());

        editProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), EditProfileActivity.class);
                startActivity(intent);
            }
        });

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SM.logout();
                startActivity(new Intent(getActivity(), SignInActivity.class));
            }
        });

        return v;
    }
}