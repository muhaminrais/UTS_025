package com.example.a025_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HalamanIntent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_intent);

        Button btnLinkBrowser1 = findViewById(R.id.btn_linkbrowser1);

        btnLinkBrowser1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://developer.android.com/guide/components/intents-filters.html?hl=id"));
                startActivity(intent);
            }
        });
    }
}
