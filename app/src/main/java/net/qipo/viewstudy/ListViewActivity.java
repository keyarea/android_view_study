package net.qipo.viewstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {

//    private String[] data = { "apple", "pear", "banana", "orange", "watermelon", "grape",
//            "pineapple" , "strawberry", "cherry", "mango", "apple", "pear", "banana", "orange", "watermelon", "grape",
//            "pineapple" , "strawberry", "cherry", "mango" };

    private List<Fruit> fruitList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
//                ListViewActivity.this, android.R.layout.simple_list_item_1, data
//        );
//        ListView listView = findViewById(R.id.list_view);
//        listView.setAdapter(adapter);
        // 初始化水果数据
        initFruits();
        FruitAdapter adapter = new FruitAdapter(ListViewActivity.this, R.layout.fruit_item, fruitList);
        ListView listView  = findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener((parent, view, position, id) -> {
            Fruit fruit = fruitList.get(position);
            Toast.makeText(ListViewActivity.this, fruit.getName(), Toast.LENGTH_SHORT).show();
        });
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