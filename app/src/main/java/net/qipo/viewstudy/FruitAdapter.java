package net.qipo.viewstudy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

// ListView

//public class FruitAdapter extends ArrayAdapter<Fruit> {
//    private int resourceId;
//    public FruitAdapter(@NonNull Context context, int resource, @NonNull List<Fruit> objects) {
//        super(context, resource, objects);
//        resourceId = resource;
//    }
//
//    @NonNull
//    @Override
//    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        Fruit fruit = getItem(position); // 获取当前项的Fruit实例
//        View view;
//        ViewHolder viewHolder;
//        if (convertView == null) {
//            view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
//            viewHolder = new ViewHolder();
//            viewHolder.fruitImage = view.findViewById(R.id.fruit_image);
//            viewHolder.fruitName = view.findViewById(R.id.fruit_name);
//            view.setTag(viewHolder); // 将ViewHolder存储在view中
//        } else {
//            view = convertView;
//            viewHolder = (ViewHolder) view.getTag(); // 重新获取ViewHolder
//        }
////        TextView fruitName = view.findViewById(R.id.fruit_name);
////        ImageView fruitImage = (ImageView) view.findViewById(R.id.fruit_image);
////        fruitImage.setImageResource(fruit.getImageId());
////        fruitName.setText(fruit.getName());
//        viewHolder.fruitName.setText(fruit.getName());
//        viewHolder.fruitImage.setImageResource(fruit.getImageId());
//        return view;
//    }
//}
//
//class ViewHolder {
//    ImageView fruitImage;
//    TextView fruitName;
//}

public class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.ViewHolder> {
    private  List<Fruit> mFruitList;

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView fruitImage;
        TextView fruitName;
        public ViewHolder(View v) {
            super(v);
            fruitImage = (ImageView) v.findViewById(R.id.fruit_image);
            fruitName = (TextView) v.findViewById(R.id.fruit_name);
        }
    }

    public FruitAdapter(List<Fruit> fruitList) {
        this.mFruitList = fruitList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fruit_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Fruit fruit = mFruitList.get(position);
        holder.fruitImage.setImageResource(fruit.getImageId());
        holder.fruitName.setText(fruit.getName());
    }

    @Override
    public int getItemCount() {
        return mFruitList.size();
    }
}
