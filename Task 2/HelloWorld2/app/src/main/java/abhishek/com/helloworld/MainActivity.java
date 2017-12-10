package abhishek.com.helloworld;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button2);
        textView = (TextView) findViewById(R.id.textView);
        textView.setTextColor(Color.parseColor("#D8D8D8"));

button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v)
    {
if(textView.getText().toString().matches("Hello World!"))
{
    textView.setText("Goodbye World!");
}
else
{
    textView.setText("Hello World!");
}
    }
});

    }


    }
