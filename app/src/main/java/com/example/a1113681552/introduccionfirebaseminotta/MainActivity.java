package com.example.a1113681552.introduccionfirebaseminotta;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    FirebaseAuth auth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        auth= FirebaseAuth.getInstance();


        auth.createUserWithEmailAndPassword("jlminottar@gmail.com","12345678")
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(!task.isSuccessful()){
                            Toast.makeText(MainActivity.this, "Error: "+ task.getException(), Toast.LENGTH_LONG).show();
                        }else{
                            Toast.makeText(MainActivity.this, "Registro exito", Toast.LENGTH_LONG).show();
                        }
                    }
                });

    }
}
