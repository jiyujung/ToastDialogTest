package kr.hs.emirim.s2019w39.toastdialogtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textName, textEmail;   // activity_main.xml
    EditText editName, editEmail;   // dialog1.xml
    TextView textToast;             // toast1.xml
    View dialogView, toastView;
    Button btnHere;                 // activity_main.xml

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textName = findViewById(R.id.text_name);
        textEmail = findViewById(R.id.text_email);
        editName = findViewById(R.id.edit_name);
        editEmail = findViewById(R.id.edit_email);
        textToast = findViewById(R.id.text_toast);
        btnHere = findViewById(R.id.btn_here);
    }
}