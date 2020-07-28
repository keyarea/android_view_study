package net.qipo.viewstudy;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class TitleLayout extends LinearLayout {
    public TitleLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.title, this);
        Button titleBack = findViewById(R.id.title_back);
        Button titleEdit = findViewById(R.id.title_edit);
        titleBack.setOnClickListener((v)-> {
            ((Activity) getContext()).finish();
        });
        titleEdit.setOnClickListener((v)-> {
            Toast.makeText(context, "You click edit", Toast.LENGTH_SHORT).show();
        });
    }
}
