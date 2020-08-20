package com.example.smilinglenguaje;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.firebase.ui.auth.AuthUI;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthWeakPasswordException;
import com.google.firebase.auth.FirebaseUser;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;



public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private CardView jugar,quiz,usuarios,informacion,traductor;

  //  Fragment fragmentinicio;

////   // private static int AUNT_REQUEST_CODE = 7192;
//private FirebaseAuth firebaseAuth;
//private FirebaseAuth.AuthStateListener listener;
////   // private List<AuthUI.IdpConfig> providers;
//public static final int RC_SIGN_IN=1;
//
//@Override
//protected void onStart(){
//        super.onStart();
//        firebaseAuth.addAuthStateListener(listener);
//        }
//
//@Override
//protected void onStop(){
//        if(listener!=null)firebaseAuth.removeAuthStateListener(listener);
//        super.onStop();
//        }
//        List<AuthUI.IdpConfig>providers=Arrays.asList(
//        new AuthUI.IdpConfig.GoogleBuilder().build(),
//        new AuthUI.IdpConfig.EmailBuilder().build(),
//        new AuthUI.IdpConfig.PhoneBuilder().build()
//
//
//        );


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       //definicion  Card
        jugar= (CardView) findViewById(R.id.jugar);
        quiz= (CardView) findViewById(R.id.quiz);
        usuarios= (CardView) findViewById(R.id.usuarios);
        informacion= (CardView) findViewById(R.id.informacion);
        traductor= (CardView) findViewById(R.id.traductor);

        jugar.setOnClickListener(this);
        quiz.setOnClickListener(this);
        usuarios.setOnClickListener(this);
        informacion.setOnClickListener(this);
        traductor.setOnClickListener(this);

       // fragmentinicio = new Fragment();

        //getSupportFragmentManager().beginTransaction().replace(R.id.contenedorFrameng, fragmentinicio).commit();

//        firebaseAuth=FirebaseAuth.getInstance();
//        listener= new FirebaseAuth.AuthStateListener() {
//            @Override
//
//            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
//                FirebaseUser user = firebaseAuth.getCurrentUser();
//                if (user!=null){
//                    Toast.makeText(MainActivity.this,"Sesion Iniciada",Toast.LENGTH_SHORT).show();
//
//                }else{
//
//                    startActivityForResult(
//                            AuthUI.getInstance()
//                            .createSignInIntentBuilder()
//                            .setAvailableProviders(providers)
//                            .setIsSmartLockEnabled(false)
//                            .build(),
//                    1);
//                }
//
//            }
//      };
//
//
//  }

//
//@Override
//protected void onResume(){
//        super.onResume();
//        firebaseAuth.addAuthStateListener(listener);
//        }
//
//@Override
//protected void onPause(){
//        super.onPause();
//        firebaseAuth.removeAuthStateListener(listener);
//        }
//
//public void cerrar(View view){
//        AuthUI.getInstance()
//        .signOut(this)
//        .addOnCompleteListener(new OnCompleteListener<Void>(){
//
//@Override
//public void onComplete(@NonNull Task<Void> task){
//        Toast.makeText(MainActivity.this,"Sesion Cerrada",Toast.LENGTH_SHORT).show();
//
//        finish();}
//        });

//        }

//    public void irIniciar(View view){
//
//        Intent i = new Intent(this,IniciarSesionActivity.class);
//        startActivity(i);
//
//    }
//
//    public void irRegistrar(View view){
//        Intent i = new Intent(this,RegistrarseActivity.class);
//        startActivity(i);
//
//    }
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){

            case R.id.jugar:i =new Intent(this,JugarActivity.class);startActivity(i);break;

            case R.id.quiz:i =new Intent(this,QuizActivity.class);startActivity(i);break;

            case R.id.usuarios:i=new Intent(this,UsuariosActivity.class);
            startActivity(i);dialogogestionarusuario();
            break;

            case R.id.informacion:i=new Intent(this,InformacionActivity.class);startActivity(i);break;

            case R.id.traductor:i=new Intent(this,TraductorActivity.class);startActivity(i);break;

            default:break;
        }

    }

    public AlertDialog dialogogestionarusuario(){

        AlertDialog.Builder builder= new AlertDialog.Builder(MainActivity.this);

        builder.setTitle("Gestion de Usuarios").setMessage("Indique que desea si REGISTRAR un nuevo usuario"+
                "\n o si SELECCIONAR uno ya existente"+"Tambien podra modificar un jugador desde la opcion SELECCIONAR")
                .setNegativeButton("REGISTRAR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this,"Registrar",Toast.LENGTH_SHORT).show();
                    }

                }).show();


        return builder.create();
    }
}
