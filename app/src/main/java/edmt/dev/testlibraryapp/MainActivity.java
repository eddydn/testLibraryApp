package edmt.dev.testlibraryapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import edmt.dev.myultils.CustomMath;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int a = CustomMath.Plus(10,20);
        Toast.makeText(this, String.valueOf(a), Toast.LENGTH_SHORT).show();
    }
}
