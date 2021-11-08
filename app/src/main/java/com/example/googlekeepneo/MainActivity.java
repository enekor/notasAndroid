package com.example.googlekeepneo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Nota temporal;
    private TextView notaNueva,ver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        notaNueva = findViewById(R.id.nuevaNota);
        ver = findViewById(R.id.mostrar);

        notaNueva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NuevaNota nueva = new NuevaNota();

                nueva.show(getSupportFragmentManager(),"nueva nota");
            }
        });

        ver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                VerNotas nota = new VerNotas(temporal);
                nota.show(getSupportFragmentManager(),"ver nota");
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_nota,menu);
        return super.onCreateOptionsMenu(menu);
    }

   /* @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //if(item.getItemId()==)
    }*/

    public void crearNuevaNota(Nota nota) {temporal = nota;}
}