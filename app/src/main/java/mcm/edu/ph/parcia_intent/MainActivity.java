package mcm.edu.ph.parcia_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button next1 = findViewById(R.id.btnNextCondition1);
        Button next2 = findViewById(R.id.btnNextCondition1);


        next1.setOnClickListener(this);
        next2.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        TextView display = findViewById(R.id.txtDisplay);
        EditText input = findViewById(R.id.txtMonthValue);

        Intent i = new Intent(MainActivity.this, Activity2.class);

        startActivity(i);

        int numberMonths = Integer.parseInt(String.valueOf(display.getText()));


        switch (v.getId()) {
            case R.id.btnNextCondition1:

                i.putExtra("INT MONTHS", numberMonths);
                startActivity(i);

                break;


        }
    }
}