package com.example.kids_poem;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.action_exit:
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
                break;

        }
        return super.onOptionsItemSelected(item);
    }



    public void humpty(View view){
        Intent intent = new Intent(MainActivity.this,Humpty.class);
        startActivity(intent);
    }
    public void baa(View view){
        Intent intent = new Intent(MainActivity.this,baa.class);
        startActivity(intent);
    }
    public void twinkle(View view){
        Intent intent = new Intent(MainActivity.this,twinkle.class);
        startActivity(intent);
    }
    public void rain(View view){
        Intent intent = new Intent(MainActivity.this,rain.class);
        startActivity(intent);
    }
    public void five(View view){
        Intent intent = new Intent(MainActivity.this,five.class);
        startActivity(intent);
    }
    public void mary(View view){
        Intent intent = new Intent(MainActivity.this,mary.class);
        startActivity(intent);
    }
    public void ltsy(View view){
        Intent intent = new Intent(MainActivity.this,ltsy.class);
        startActivity(intent);
    }
    public void hickory(View view){
        Intent intent = new Intent(MainActivity.this,hickory.class);
        startActivity(intent);
    }
    public void love(View view){
        Intent intent = new Intent(MainActivity.this,love.class);
        startActivity(intent);
    }
    public void johny(View view){
        Intent intent = new Intent(MainActivity.this,johny.class);
        startActivity(intent);
    }
    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}
