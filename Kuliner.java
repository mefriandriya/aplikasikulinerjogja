package com.example.admin.kulinerjogja;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class Kuliner extends AppCompatActivity {
    //Deklarasi Variable GridView
    protected GridView TampilanGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuliner);
        TampilanGrid = (GridView) findViewById(R.id.gridview);
        //Mengset/Menerapkan adapter pada GridView
        TampilanGrid.setAdapter(new ImageAdapter(this));
        //Membuat Listener untuk menangani kejadian saat salah satu item di klik
        TampilanGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView parent, View v, int position, long id) {
                Toast.makeText(Kuliner.this, "" + position, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
//Digunakan Untuk Mengatur Konten yang Akan Ditampilkan
class ImageAdapter extends BaseAdapter {
    //List Konten Gambar yang akan ditampilkan pada GridView
    private int[] gambar = {R.drawable.bakpia, R.drawable.gudeg, R.drawable.krecek,
            R.drawable.oseng_mercon, R.drawable.yangko, R.drawable.geplak};
    private Context mContext;

    //Membuat Contructor, dengan parameter Context, Untuk menghubungkan Adapter dengan GridView
    ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        //Menghitung Jumlah/Panjang dari Daftar Konten
        return gambar.length;
    }

    public Object getItem(int position) {
        return null;
    }
    public long getItemId(int position) {
        return 0;
    }
    //Membuat ImageView baru untuk setiap item yang direferensikan oleh Adaptor
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        //Jika tidak di daur ulang
        if (convertView == null) {
            //Menginisialisasi beberapa atribut
            imageView = new ImageView(mContext);
            //Mengatur Panjang dan Lebar pada ImageView
            imageView.setLayoutParams(new GridView.LayoutParams(200, 200));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            //Mengatur Padding
            imageView.setPadding(10,10,10,10);
        } else {
            imageView = (ImageView) convertView;
        }

        //Mengset Image dari Resource/Sumber berdasarkan posisinya
        imageView.setImageResource(gambar[position]);
        return imageView;
    }
}

