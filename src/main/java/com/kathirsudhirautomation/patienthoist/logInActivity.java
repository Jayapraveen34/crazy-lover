package com.kathirsudhirautomation.patienthoist;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class logInActivity  extends AppCompatActivity {
    String error_msg;
    EditText Email;
    EditText password;
    Button Login;
    TextView error,noAccount;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
       super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);
        Email=findViewById(R.id.EmailLog);
        password=findViewById(R.id.Logpwd);
        Login=findViewById(R.id.Login);
        error=findViewById(R.id.Loginerror);
        noAccount=findViewById(R.id.NoAccount);
        Login.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String EmailContent = Email.getText().toString();
                String passwordContent = password.getText().toString();
                if(validEmail(EmailContent)&&validPwd(passwordContent))
                {
                    error.setVisibility(View.VISIBLE);
                    error_msg="Login successfully";
                    error.setText(error_msg);
                    startActivity(new Intent(logInActivity.this,MainActivity.class));
                }
                else
                {
                    error.setVisibility((View.VISIBLE));
                    error_msg="Invalid details";
                    error.setText(error_msg);
                }
            }
        });
     noAccount.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent changer = new Intent(logInActivity.this,signUpActivity.class);
                startActivity(changer);
            }
        }
     );
    }
    private boolean validEmail(String s) {
        if(s.length()>0)
        {
            error_msg="Invalid user name";
            return(checkRegEX("^\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}$",s));
        }
        error_msg="Invalid user name";
        return false;
    }
    private boolean validPwd(String s)
    {
        error_msg="Password length must between 6 to 10";
        return checkRegEX("^[a-zA-Z]\\w{3,14}$",s);
    }

    private boolean checkRegEX(String s, String s1) {
        Pattern p = Pattern.compile(s);
        return p.matcher(s1).matches();
    }
    @Override

    public void onBackPressed () {

        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Are you sure want to exit?");
        builder.setCancelable(true);


        builder.setPositiveButton("YES",new DialogInterface.OnClickListener(){

            @Override
            public void onClick(DialogInterface dialogInterface, int i ){

                finish();

            }
        } );
        builder.setNegativeButton("NO!" ,new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        }  );
        AlertDialog alertDialog = builder.create();

        alertDialog.show();

    }
}
