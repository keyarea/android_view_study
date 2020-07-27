package net.qipo.viewstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MainActivity";
//    private EditText editText;
//    private ImageView imageView;
//    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);

        // 获取editText
//        editText = findViewById(R.id.editText1);
        // 获取imageView
//        imageView = findViewById(R.id.image_view);
        // 获取progressBar
        //progressBar = findViewById(R.id.progress_bar);
        // 使用匿名类的方式来注册监听器
//        button1.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "clicked Button", Toast.LENGTH_SHORT).show();
//            }
//        });
        // 使用lambda表达式来注册监听器
//        button1.setOnClickListener((v) -> {
//            Toast.makeText(MainActivity.this, "click Button", Toast.LENGTH_SHORT).show();
//        });
        // 使用实现接口的形式来注册监听器
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                // 显示EditText中的内容
//                String str = editText.getText().toString();
//                Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
                // 设置ImageView显示的图片资源
//                imageView.setImageResource(R.drawable.img_2);
                // 设置进度条的可见性
//                if (progressBar.getVisibility() == View.GONE) {
//                    progressBar.setVisibility(View.VISIBLE);
//                } else {
//                    progressBar.setVisibility(View.GONE);
//                }
                // 设置水平进度条的值
                // int progress = progressBar.getProgress();
                // progress += 10;
                // progressBar.setProgress(progress);
//                int progress = progressBar.getProgress();
//                progress += 10;
//                progressBar.setProgress(progress);
                // 对话框
//                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
//                dialog.setTitle("This is Dialog");
//                dialog.setMessage("Something important.");
//                dialog.setCancelable(false);
//                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                    }
//                });
//                dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                    }
//                });
//                dialog.show();
                // ProgressDialog
//                ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
//                progressDialog.setTitle("This is ProgressDialog");
//                progressDialog.setMessage("Loading...");
//                progressDialog.setCancelable(true);
//                progressDialog.show();
                break;
            case R.id.button2:
                Log.d(TAG, "onClick: ");
                Intent intent = new Intent(MainActivity.this ,LinearLayoutActivity.class);
                startActivity(intent);
                break;
            case R.id.button3:
                Intent intent1 = new Intent(MainActivity.this, RelativeLayoutActivity.class);
                startActivity(intent1);
            default:
                break;
        }
    }
}