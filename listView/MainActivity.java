package com.example.listview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private TextView tv;
    private ListView lv;
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
        tv=findViewById(R.id.e1);
        String msg=getIntent().getStringExtra("mykey");// receiving the data
        tv.setText("welcome " + msg);
        lv=findViewById(R.id.l1);// display(welcom changing to admin)
// listvivew operation
        String[] courses={"MCA","MBA","BBA","BCA"};
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,courses);
        lv.setAdapter(adapter);
// attach listener
        lv.setOnItemClickListener(this);//implement the method by alt+enter
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String itemname=lv.getItemAtPosition(i).toString();
        tv.setText("welcome " + itemname);
        Toast.makeText(this,itemname,Toast.LENGTH_SHORT).show();
    }

}