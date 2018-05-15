package com.example.admin.kulinerjogja;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatRatingBar;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class Rating extends AppCompatActivity {
    private TextView getRating;
    private Button Submit;
    private AppCompatRatingBar RatingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);
        getRating = (TextView) findViewById(R.id.rate);
        Submit = (Button) findViewById(R.id.submit);
        RatingBar = (AppCompatRatingBar) findViewById(R.id.penilaian);
        // Menambahkan Listener Pada RatingBar
        RatingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float nilai, boolean b) {
                // Nilai pada TextView Akan Berupa/Terupdate Saat Nilai Ratingnya Berubah
                getRating.setText("Rating: "+nilai);
            }
        });
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Menampilkan Pesan Berupa Nilai Yang Di inputkan User Pada RatingBar
                Toast.makeText(getApplicationContext(), "Nilai Yang Anda Kirimkan: "+RatingBar.getRating(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
