package com.example.dunguntourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EditProfileActivity extends AppCompatActivity {

    private EditText email, phone;
    Button update;
    UserDatabaseHelper UDH;
    SessionManager SM;
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        email = findViewById(R.id.etEmail);
        phone = findViewById(R.id.etPhoneNo);
        SM = new SessionManager(this);
        UDH = new UserDatabaseHelper(this);
        update = findViewById(R.id.buttonUpdate);
        user = UDH.getUserInformation(SM.getLoginUser());

        email.setText(user.getEmail());
        phone.setText(user.getPhone());

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newEmail = email.getText().toString();
                String newPhone = phone.getText().toString();

                user.setEmail(newEmail);
                user.setPhone(newPhone);

                Boolean updateUser = UDH.updateUser(user);
                if(updateUser)
                {
                    Toast.makeText(EditProfileActivity.this, "Update successfully", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(EditProfileActivity.this,MainActivity.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(EditProfileActivity.this, "Update failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}