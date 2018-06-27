package lk.sliit.mad.indoorpositioning;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void forgot(View view)
    {

        Intent intent=new Intent(this,forgotpassword.class);
        startActivity(intent);



    }

    public void signup(View view)
    {
        Intent intent=new Intent(LoginActivity.this,SignUp.class);
        startActivity(intent);
    }

    public void signin(View view)
    {
        Intent intent=new Intent(LoginActivity.this,MapActivity.class);
        startActivity(intent);

    }



}
