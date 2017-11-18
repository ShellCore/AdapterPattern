package com.shellcore.android.adapterpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static android.os.Build.VERSION_CODES.O;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OldLocation oldLocation = new CustomerLocation();
        oldLocation.setBuilding("Banco Central");
        oldLocation.setFloor(5);
        oldLocation.setOffice("Mobile Development");
        oldLocation.setDesk(26);

        NewLocation newLocation = new Adapter(oldLocation);

        TextView txtView = (TextView) findViewById(R.id.txt_view);

        StringBuilder sb = new StringBuilder()
                .append("Edificio: ")
                .append(newLocation.getBuilding())
                .append("\nPiso: ")
                .append(newLocation.getFloor())
                .append("\nMesa:")
                .append(newLocation.getDesk());

        txtView.setText(sb.toString());
    }
}
