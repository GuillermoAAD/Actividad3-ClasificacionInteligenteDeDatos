package com.example.actividad3_clasificacioninteligentededatos.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.actividad3_clasificacioninteligentededatos.Adapters.EmergencyAdapter;
import com.example.actividad3_clasificacioninteligentededatos.Models.Emergency;
import com.example.actividad3_clasificacioninteligentededatos.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private EmergencyAdapter adapter;
    private List<Emergency> emergencies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        emergencies = getData();

        adapter = new EmergencyAdapter(this, emergencies, R.layout.list_view_item);
        listView = (ListView) findViewById(R.id.listView_EmergencysList);
        listView.setAdapter(adapter);
    }

    private List<Emergency> getData() {
        List<Emergency> list = new ArrayList<Emergency>() {{
            this.add(new Emergency("DERRAME", "Guanajuato", 1645, 5665, R.drawable.derrame));
            this.add(new Emergency("EXPLOSION", "Estado de México", 111,602, R.drawable.explosion));
            this.add(new Emergency("FUGA", "Chiapas", 134, 838, R.drawable.fuga));
            this.add(new Emergency("INCENDIO", "Guanajuato", 65, 703, R.drawable.incendio));
            this.add(new Emergency("OTRO", "Sinaloa", 7, 43, R.drawable.otro));
            }};
        return  list;
    }
}