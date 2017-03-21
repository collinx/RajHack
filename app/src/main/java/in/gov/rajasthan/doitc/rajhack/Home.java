package in.gov.rajasthan.doitc.rajhack;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }


    public void generate(View v){
        Intent intent = new Intent(Home.this, MainActivity.class);
        startActivity(intent);
    }
    public void decode(View v){
        Intent intent = new Intent(Home.this, BHome.class);
        startActivity(intent);
    }

}
