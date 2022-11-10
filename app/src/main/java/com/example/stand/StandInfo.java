package com.example.stand;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class StandInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stand_info);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menucarros,menu);
        menu.removeItem(R.id.btvoltar);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.btsair){
            finish();
        }
        if(id == R.id.btbarato){
            Intent it = new Intent( StandInfo.this, CarrosBaratos.class);
            startActivity(it);
            finish();
        }
        if(id == R.id.btemconta){
            Intent it = new Intent( StandInfo.this, CarrosMedios.class);
            startActivity(it);
            finish();
        }
        if(id == R.id.btcaro){
            Intent it = new Intent( StandInfo.this, CarrosCaros.class);
            startActivity(it);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}