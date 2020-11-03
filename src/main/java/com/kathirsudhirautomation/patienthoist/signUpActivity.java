package com.kathirsudhirautomation.patienthoist;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.regex.*;
public class signUpActivity extends AppCompatActivity {
   EditText email, pwd,Cpwd;
   String error_msg;
   Button confirm;
   TextView warning,HaveAccount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        email=findViewById(R.id.Email);
        pwd=findViewById(R.id.pwd);
        Cpwd=findViewById(R.id.Cpwd);
        confirm=findViewById(R.id.submit);
        warning=findViewById(R.id.error);
        HaveAccount=findViewById(R.id.HaveAccount);
        confirm.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                String emailContent=email.getText().toString();
                String pwdContent=pwd.getText().toString();
                String CpwdContent=Cpwd.getText().toString();
                if(validEmail(emailContent)&&validPwd(pwdContent)&&validCpwd(CpwdContent,pwdContent))
                {
                    resetError();
                    startActivity(new Intent(signUpActivity.this,logInActivity.class));
                }
                else
                {
                    setError();
                }
            }
        });
        Log.i("lifeCycle","onCreate()");
        HaveAccount.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Log.i("lifecycle","redirecting");
                Intent navigate=new Intent(signUpActivity.this,logInActivity.class);
                startActivity(navigate);
            }
        });
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
    private boolean validCpwd(String actualpwd,String confirmpwd) {
        error_msg="Passwords not matching";
        if(actualpwd.equals(confirmpwd))
            return true;
        return false;
    }
    private void setError()
    {
        warning.setVisibility(View.VISIBLE);
        warning.setText(error_msg);
    }
    private void resetError(){
        warning.setVisibility(View.VISIBLE);
        warning.setText("ok successfull");
    }
    private boolean checkRegEX(String pattern, String content)
    {
        Pattern p = Pattern.compile(pattern);
        return  p.matcher(content).matches();
    }
}