package com.example.tugas_layout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LinearActivity extends AppCompatActivity {

    private FrameLayout frameContent;
    private Button btnDataDiri, btnJadwal, btnInfo, btnBackLinear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);

        frameContent = findViewById(R.id.frameContent);
        btnDataDiri = findViewById(R.id.btnDataDiri);
        btnJadwal = findViewById(R.id.btnJadwal);
        btnInfo = findViewById(R.id.btnInfo);
        btnBackLinear = findViewById(R.id.btnBackLinear);

        // default tampil Data Diri
        showDataDiri();

        btnDataDiri.setOnClickListener(v -> {
            showDataDiri();
            setActiveButton(btnDataDiri);
        });

        btnJadwal.setOnClickListener(v -> {
            showJadwal();
            setActiveButton(btnJadwal);
        });

        btnInfo.setOnClickListener(v -> {
            showInformasi();
            setActiveButton(btnInfo);
        });

        btnBackLinear.setOnClickListener(v -> {
            Intent i = new Intent(LinearActivity.this, MainActivity.class);
            startActivity(i);
            finish();
        });
    }

    private void setActiveButton(Button activeBtn) {
        // reset semua ke warna normal
        btnDataDiri.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
        btnJadwal.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
        btnInfo.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));

        // tombol aktif → warna biru
        activeBtn.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_dark));

        // teks biar kontras
        btnDataDiri.setTextColor(getResources().getColor(android.R.color.white));
        btnJadwal.setTextColor(getResources().getColor(android.R.color.white));
        btnInfo.setTextColor(getResources().getColor(android.R.color.white));
    }

    private void showDataDiri() {
        frameContent.removeAllViews();
        TextView tv = new TextView(this);
        tv.setText("Nama: Alya Rachma Kamila\nNIM: E41240983\nProdi: Teknik Informatika\nJurusan: Teknologi Informasi");
        tv.setTextSize(16);
        frameContent.addView(tv);

        setActiveButton(btnDataDiri);
    }

    private void showJadwal() {
        frameContent.removeAllViews();
        TextView tv = new TextView(this);
        tv.setText("Jadwal Kuliah:\n Senin: \n - Matematika Diskrit (07.00-09.00 WIB) \n - Konsep Jaringan Komputer (09.00-11.00 WIB) \n - Struktur Data (13.00-15.00 WIB) \n - Interpersonal Skill (15.00-17.00 WIB) \n \n Selasa: \n - Workshop Mobile Application (07.00-11.00 WIB) \n - Workshop Kualitas Perangkat lunak (13.00-17.00 WIB)");
        tv.setTextSize(16);
        frameContent.addView(tv);

        setActiveButton(btnJadwal);
    }

    private void showInformasi() {
        frameContent.removeAllViews();
        TextView tv = new TextView(this);
        tv.setText("Informasi Mata Kuliah:\nMata Kuliah: Matematika Diskrit\nDosen Koordinator: Moh. Munih Dian Widianta, S.Kom, M.T\nJumlah SKS: 2\n \nMata Kuliah: Konsep Jaringan Komputer\nDosen Koordinator: Agus Purwadi, ST.MT\nJumlah SKS: 2\n \nMata Kuliah: Struktur Data\nDosen Koordinator: Didit Rahmat Hartadi, S.Kom, MT\nJumlah SKS: 2\n \nMata Kuliah: Interpersonal Skill\nDosen Koordinator: Prawidya Destarianto, S.Kom, M.T\nJumlah SKS: 2\n \nMata Kuliah: Workshop Mobile Application\nDosen Koordinator: Choirul Huda, S.Kom., M.Kom.\nJumlah SKS: 4\n \nMata Kuliah: Workshop Kualitas Perangkat Lunak\nDosen Koordinator: Fatimatuzzahra, S.Kom., M.Kom\nJumlah SKS: 4");
        tv.setTextSize(16);
        frameContent.addView(tv);

        setActiveButton(btnInfo);
    }
}

