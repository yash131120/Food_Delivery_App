package com.example.myapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myapplication.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapter,adapter2;
    private RecyclerView recyclerViewCategoryList,recyclerViewPopularList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewCategoty();
        recyclerViewPopular();
    }

    private void recyclerViewPopular(){
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false);
        recyclerViewPopularList=findViewById(R.id.view2);
        recyclerViewCategoryList.setLayoutManager(linearLayoutManager);

        ArrayList<FoodDomain> foodlist = new ArrayList<>();
        foodlist.add(new FoodDomain("Pepperoni pizza","pizza1","slices pepperoni, mozzarella cheese, fresh oregano, ground black pepper, pizza sauce", 13.0, 5, 20, 1000));
        foodlist.add(new FoodDomain("Chesse Burger","burger","beef, Gouda Cheese, Special sauce, Lettuce, tomato", 15.20, 4, 18, 1500));
        foodlist.add(new FoodDomain("Vegetable pizza","pizza3","olive oil, Vegetable oli, pitted Kalamata, cherry tomatoes, fresh oregano, basil", 11.0, 3, 16, 800));

        adapter2 = new RecommendedAdapter(foodlist);
        recyclerViewPopularList.setAdapter(adapter2);
    }
    private void recyclerViewCategoty(){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerViewCategoryList=findViewById(R.id.view1);
        recyclerViewCategoryList.setLayoutManager(linearLayoutManager);

        ArrayList<CategoryDomain> categoryList = new ArrayList<>();
        categoryList.add(new CategoryDomain("Pizza", "cat_1"));
        categoryList.add(new CategoryDomain("Burger", "cat_2"));
        categoryList.add(new CategoryDomain("Hot dog", "cat_3"));
        categoryList.add(new CategoryDomain("Drink", "cat_4"));
        categoryList.add(new CategoryDomain("Donut", "cat_5"));

        adapter= new CategoryAdapter(categoryList);
        recyclerViewCategoryList.setAdapter(adapter);


    }
}