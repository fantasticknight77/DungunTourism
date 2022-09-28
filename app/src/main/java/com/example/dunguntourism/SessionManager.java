package com.example.dunguntourism;

import android.content.Context;
import android.content.SharedPreferences;

public class SessionManager {

    SharedPreferences userSession;
    SharedPreferences.Editor editor;
    Context context;

    public SessionManager(Context _context)
    {
        context = _context;
        userSession = context.getSharedPreferences("userLoginSession",Context.MODE_PRIVATE);
        editor = userSession.edit();
    }

    public void createLoginSession(String username)
    {
        editor.putString("username",username);
        editor.commit();
    }

    public String getLoginUser()
    {
        String username = userSession.getString("username",null);
        return username;
    }

    public void logout()
    {
        editor.clear();
        editor.commit();
    }
}
