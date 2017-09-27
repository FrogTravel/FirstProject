package innopolis.study.firstproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    private int numberOfNevertheless;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
    }

    public void onPlus(View view){
        textView.setText("Number of Nevertheless: " + String.valueOf(++numberOfNevertheless));
    }

    public void onMinus(View view){
        textView.setText("Number of Nevertheless: " + String.valueOf(--numberOfNevertheless));
    }


}
