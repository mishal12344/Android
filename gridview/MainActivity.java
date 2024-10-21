package com.example.gridview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private GridView gv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        gv=findViewById(R.id.gridview);// display(welcom changing to admin)
// listvivew operation
        String[] courses={"MCA","MBA","BBA","BCA","BCOM","BSC","MA","BA"};
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,courses);
        gv.setAdapter(adapter);
// attach listener
        gv.setOnItemClickListener(this);//implement the method by alt+enter
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String itemname=gv.getItemAtPosition(i).toString();

        Toast.makeText(this,itemname,Toast.LENGTH_SHORT).show();
    }

}