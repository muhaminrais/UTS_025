package com.example.a025_uts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Dashboard extends AppCompatActivity implements View.OnClickListener{
    private CardView ActivityCard, IntentCard, ServicesCard, BroadcastCard, ContentCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        //definisi cards activity_card,intent_card,services_card,broadcast_card,content_card
        ActivityCard = (CardView) findViewById(R.id.activity_card);
        IntentCard = (CardView) findViewById(R.id.intent_card);
        ServicesCard = (CardView) findViewById(R.id.services_card);
        BroadcastCard = (CardView) findViewById(R.id.broadcast_card);
        ContentCard = (CardView) findViewById(R.id.content_card);
        //menambahkan Click Listener untuk Card
        ActivityCard.setOnClickListener((View.OnClickListener) this);
        IntentCard.setOnClickListener((View.OnClickListener) this);
        ServicesCard.setOnClickListener((View.OnClickListener) this);
        BroadcastCard.setOnClickListener((View.OnClickListener) this);
        ContentCard.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.activity_card:
                Toast.makeText(getApplicationContext(), "Anda Memilih Halaman Activity",
                        Toast.LENGTH_SHORT).show();
                i = new Intent(this, HalamanActivity.class);
                startActivity(i);
                break;

            case R.id.intent_card:
                Toast.makeText(getApplicationContext(), "Anda Memilih Halaman Intent",
                        Toast.LENGTH_SHORT).show();
                i = new Intent(this, HalamanIntent.class);
                startActivity(i);
                break;

            case R.id.services_card:
                Toast.makeText(getApplicationContext(), "Anda Memilih Halaman Services",
                        Toast.LENGTH_SHORT).show();
                i = new Intent(this, HalamanService.class);
                startActivity(i);
                break;

            case R.id.broadcast_card:
                Toast.makeText(getApplicationContext(), "Anda Memilih Halaman Broadcast Receiver",
                        Toast.LENGTH_SHORT).show();
                i = new Intent(this, HalamanBroadcast.class);
                startActivity(i);
                break;

            case R.id.content_card:
                Toast.makeText(getApplicationContext(), "Anda Memilih Halaman Content Provider",
                        Toast.LENGTH_SHORT).show();
                i = new Intent(this, HalamanContent.class);
                startActivity(i);
                break;
            default:
                break;
        }
    }
}
