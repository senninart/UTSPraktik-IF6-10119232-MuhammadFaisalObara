package com.example.utspraktik_if6_10119232_muhammadfaisalobara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/*M Faisal Obara
10119232
IF 6
03 Juni 2022*/

public class MainActivity extends AppCompatActivity {

    Button btnSelanjutnya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSelanjutnya = findViewById(R.id.btn_selanjutnya);

        btnSelanjutnya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PreviewActivity.class);
                startActivity(intent);
            }
        });
    }
}