package com.example.resturangmenu;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

import com.example.resturangmenu.R;

public class MainActivity extends AppCompatActivity {

    private TextView starterDescription;
    private TextView mainDescription;
    private TextView dessertDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        starterDescription = findViewById(R.id.starterDescription);
        mainDescription = findViewById(R.id.mainDescription);
        dessertDescription = findViewById(R.id.dessertDescription);

        starterDescription.setText(getString(R.string.starter_menu));
        mainDescription.setText(getString(R.string.main_menu));
        dessertDescription.setText(getString(R.string.dessert_menu));
    }
}
