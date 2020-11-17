package kr.hs.emirim.s2019w39.toastdialogtest;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    EditText editMainName, editMainEmail;
    EditText editName, editEmail;
    TextView textToast;
    View dialogView, toastView;
    Button btnHere2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editMainName = findViewById(R.id.edit_main_name);
        editMainEmail = findViewById(R.id.edit_main_email);
        btnHere2 = findViewById(R.id.btn_here2);
        btnHere2.setOnClickListener(btnHereListener);
    }

    View.OnClickListener btnHereListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            dialogView = View.inflate(MainActivity2.this, R.layout.dialog1, null);
            AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity2.this);
            dlg.setTitle("사용자 정보 입력");
            dlg.setIcon(R.drawable.friends);
            dlg.setView(dialogView);
            dlg.setPositiveButton("확인", positiveButtonListener);
            dlg.setNegativeButton("취소", negativeButtonListener);
            dlg.show();

        }
    };

    DialogInterface.OnClickListener positiveButtonListener = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialogInterface, int i) {
            editName = dialogView.findViewById(R.id.edit_name);
            editEmail = dialogView.findViewById(R.id.edit_email);
            editMainName.setText(editName.getText().toString());
            editMainEmail.setText(editEmail.getText().toString());
        }
    };

    DialogInterface.OnClickListener negativeButtonListener = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialogInterface, int i) {
            Toast toast = new Toast(MainActivity2.this);
            toastView = View.inflate(MainActivity2.this, R.layout.toast1, null);
            textToast = toastView.findViewById(R.id.text_toast);
            textToast.setText("취소했습니다.");
            toast.setView(toastView);
            Display display = ((WindowManager)getSystemService(WINDOW_SERVICE)).getDefaultDisplay();
            int xOffset = (int) (Math.random() * display.getWidth());
            int yOffset = (int) (Math.random() * display.getHeight());
            toast.setGravity(Gravity.TOP | Gravity.LEFT, xOffset, yOffset);
            toast.show();
        }
    };
}