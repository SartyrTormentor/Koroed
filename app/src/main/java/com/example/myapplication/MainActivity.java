package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/*import com.example.myapplication.model.Items;
import com.example.myapplication.smth.ItemsAdapter;

import java.util.ArrayList;
import java.util.List;*/


public class MainActivity extends AppCompatActivity {

    private Button loginButton;
    /* RecyclerView itemRecycler;
    ItemsAdapter itemsAdapter; */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = (Button) findViewById(R.id.loginbutton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(MainActivity.this, Activitylogorreg.class);
                startActivity(loginIntent);
            }
        });

       /* List<Items> itemsList = new ArrayList<>();
        itemsList.add(new Items(1,"otsiideti", "Отцы и дети", "Книга", "225 рублей"));
        itemsList.add(new Items(1,"prestuplenienakazanie", "Преступление и наказание ","Книга", "225 рублей"));

        setItemRecycler(itemsList);
    }

    private void setItemRecycler(List<Items> itemsList) {

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);

        itemRecycler = findViewById(R.id.itemrecview);
        itemRecycler.setLayoutManager(layoutManager);

        itemsAdapter = new ItemsAdapter(this, itemsList);
        itemRecycler.setAdapter(itemsAdapter);

*/

    }
}