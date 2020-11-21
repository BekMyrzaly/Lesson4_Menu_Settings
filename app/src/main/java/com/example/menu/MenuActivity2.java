package com.example.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuActivity2 extends AppCompatActivity implements View.OnClickListener {

    Button btnBack2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);

        btnBack2 = findViewById(R.id.btnBack2);
        btnBack2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent menu2 = new Intent(this, MainActivity.class);
        startActivity(menu2);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater= getMenuInflater();
        menuInflater.inflate(R.menu.main, menu);

        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_settings:
                Toast.makeText(this, "Settings menu clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.menu_refresh:
                Toast.makeText(this, "Refresh menu clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.menu_delete:
                Toast.makeText(this, "Delete menu clicked", Toast.LENGTH_SHORT).show();
                break;

            default:
                return super.onOptionsItemSelected(item);
        }

        return true;
    }
}


