package com.example.utspraktik_if6_10119232_muhammadfaisalobara;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

/*M Faisal Obara
10119232
IF 6
03 Juni 2022*/

public class PreviewActivity extends AppCompatActivity {

    ImageView btnBack;
    Button btnCek, btnUbah;
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);

        btnBack = findViewById(R.id.btn_back);
        btnCek = findViewById(R.id.btn_cek);
        btnUbah = findViewById(R.id.btn_ubah);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PreviewActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btnCek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBerhasilDialog();
            }
        });

        btnUbah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PreviewActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void openBerhasilDialog(){
        dialog.setContentView(R.layout.berhasil_layout_dialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        ImageView imageViewClosed = dialog.findViewById(R.id.btn_ok);

        imageViewClosed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }
}