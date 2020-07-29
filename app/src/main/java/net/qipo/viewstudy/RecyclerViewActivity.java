package net.qipo.viewstudy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {

    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        this.initFruits();
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapter fruitAdapter = new FruitAdapter(fruitList);
        recyclerView.setAdapter(fruitAdapter);
    }

    private void initFruits() {
        for (int i = 0; i < 5; i ++) {
            Fruit apple = new Fruit("Apple",R.drawable.apple);
            fruitList.add(apple);
            Fruit pear = new Fruit("Pear", R.drawable.pear);
            fruitList.add(pear);
            Fruit banana = new Fruit("Banana", R.drawable.banana);
            fruitList.add(banana);
        }
    }
}