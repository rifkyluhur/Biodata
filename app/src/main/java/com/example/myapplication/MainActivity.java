package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import java.net.URI;



public class MainActivity extends AppCompatActivity {
    public void kirimEmail (View view) {
        Uri tabEmail = Uri.parse("mailto:mrarifutama@gmail.com");
        Intent Email = new Intent(Intent.ACTION_SENDTO, tabEmail);
        startActivity(Email);
    }

    public void kirimTelpon(View view) {
        Uri tabTelpon = Uri.parse("tel:089694773988");
        Intent Telpon = new Intent(Intent.ACTION_DIAL, tabTelpon);
        startActivity(Telpon);
    }

    public void tampilMaps(View view) {
        Uri tabMaps = Uri.parse("geo:1.859098,109.971901?q=Jl.Agus+Salim+No.03,+Kec.+Delta+Pawan.,+Ketapang,+Kalimantan+Barat+78813");
        Intent Maps = new Intent(Intent.ACTION_VIEW, tabMaps);
        startActivity(Maps);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}