package project.com.singlescreenapp;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Free vector art via <a href="https://www.vecteezy.com">Vecteezy</a>

        //get reference to float action button
        FloatingActionButton btShare = findViewById(R.id.floatingActionButton2);

        //set click listener
        btShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT, getResources().getString(R.string.share_text));
                intent.setType("text/plan");
                startActivity(intent);
            }
        });

    }
}
