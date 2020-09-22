package de.bluestarfish.buttontutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Integer counter = 0;

    TextView tvZaehler;
    Button btnEins, btnZwei;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvZaehler = (TextView) findViewById(R.id.tvZaehler);

        btnEins = (Button) findViewById(R.id.btnEins);
        btnEins.setOnClickListener(this);

        btnZwei = (Button) findViewById(R.id.btnZwei);
        btnZwei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count();
            }
        });

    }

    public void count() {
        counter += 1;
        tvZaehler.setText(counter.toString());
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnEins:
                count();
                break;
        }
    }

    public void btnDrei(View view) {
        count();
    }
}