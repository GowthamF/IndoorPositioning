package lk.sliit.mad.indoorpositioning;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class forgotpassword extends AppCompatActivity {

    EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgotpassword);
        email=(EditText) findViewById(R.id.txtEmail);

    }

    public void sendlink(View view)
    {
        String emailid=email.getText().toString();
        AlertDialog.Builder builder=new AlertDialog.Builder(this)
                .setTitle("Forgot Password")
                .setMessage("Password Reset Link has been sent to "+emailid)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

        AlertDialog dialog=builder.create();
        dialog.show();



    }
}
