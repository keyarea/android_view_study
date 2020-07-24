package net.qipo.viewstudy;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
//    private EditText editText;
//    private ImageView imageView;
    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = findViewById(R.id.button1);

        // 获取editText
//        editText = findViewById(R.id.editText1);
        // 获取imageView
//        imageView = findViewById(R.id.image_view);
        // 获取progressBar
        progressBar = findViewById(R.id.progress_bar);
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
                int progress = progressBar.getProgress();
                progress += 10;
                progressBar.setProgress(progress);
                break;
            default:
                break;
        }
    }
}