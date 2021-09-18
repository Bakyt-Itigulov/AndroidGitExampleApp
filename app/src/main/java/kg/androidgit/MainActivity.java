package kg.androidgit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button mBtn;
    Button mDelete;
    TextView mTextView;

    String[] mNames = {
            "Бакыт","Бакыт","Бакыт","Бакыт","Бакыт",
            "Бакыт","Бакыт","Бакыт","Бакыт","Бакыт",
            "Бакыт","Бакыт","Бакыт","Бакыт","Бакыт",
            "Бакыт","Бакыт","Бакыт","Бакыт","Бакыт",

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = findViewById(R.id.text_view);
        mBtn = findViewById(R.id.show);
        mDelete = findViewById(R.id.delete);


        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showNames();

            }
        });
        mDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                deleteNames();
            }
        });


    }


    private void showNames() {
        String names = "";
        for (int i = 0; i < mNames.length; i++) {
            names += mNames[i] + "\n";
        }

        mTextView.setText(names);
    }
    public void deleteNames() {
        String toNull = "";


        mTextView.setText(toNull);
    }

}