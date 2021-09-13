package kg.androidgit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView mTextView;

    String[] mNames = {
            "Бакыт",
            "Асан",
            "Усон",
            "Иван",
            "Рома",
            "Иван",
            "Мирлан",
            "Aйзирек",
            "Кундуз"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = findViewById(R.id.text_view);

        showNames();
    }

    private void showNames() {
        String names = "";
        for (int i = 0; i < mNames.length; i++) {
            names += mNames[i] + "\n";
        }

        mTextView.setText(names);
    }
}
