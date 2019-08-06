package com.furiouskitten.amiel.solidarity.FirebaseChapterQuizzes.UBCV3QUIZ;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.furiouskitten.amiel.solidarity.R;
import com.furiouskitten.amiel.solidarity.TestFirebaseQuiz.Activities.Start;
import com.furiouskitten.amiel.solidarity.TestFirebaseQuiz.Adapters.CategoryViewHolder;
import com.furiouskitten.amiel.solidarity.TestFirebaseQuiz.Common.Common;
import com.furiouskitten.amiel.solidarity.TestFirebaseQuiz.Model.Category;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class CategoryFragmentubcv3chapter2 extends Fragment {


    View myFragment;

    //RecyclerView listCategory;
    Button testBut;
    RecyclerView.LayoutManager layoutManager;
    FirebaseRecyclerAdapter<Category, CategoryViewHolder> adapter;

    FirebaseDatabase database;
    DatabaseReference categories;
    Context mContext;


    public static CategoryFragmentubcv3chapter2 newInstance(){
        CategoryFragmentubcv3chapter2 categoryFragment = new CategoryFragmentubcv3chapter2();
        return categoryFragment;
    }



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        database = FirebaseDatabase.getInstance();
        categories = database.getReference("Category");

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       myFragment = inflater.inflate(R.layout.fragment_category,container,false);
       //listCategory = (RecyclerView) myFragment.findViewById(R.id.listCategory);
       //listCategory.setHasFixedSize(true);
       layoutManager = new LinearLayoutManager(container.getContext());
       //listCategory.setLayoutManager(layoutManager);
       testBut = myFragment.findViewById(R.id.textbut);

       loadCategory();
       //loadCategories();

       return myFragment;
    }


    private void loadCategory(){
        testBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startGame = new Intent(getActivity(), Start.class);
                Common.categoryId = "ubcv3chapter2";
                startActivity(startGame);
            }
        });
    }



    /*
    private void loadCategories() {


        adapter = new FirebaseRecyclerAdapter<Category, CategoryViewHolder>(Category.class,R.layout.category_layout,CategoryViewHolder.class,categories) {
            @Override
            protected void populateViewHolder(CategoryViewHolder viewHolder, Category model, int position) {
                viewHolder.category_name.setText(model.getName());


                viewHolder.setItemClickListener(new ItemClickListener() {
                    @Override
                    public void onClick(View view, int position, boolean isLongClick) {
                        Intent startGame = new Intent(getActivity(), Start.class);
                        Common.categoryId = adapter.getRef(position).getKey();
                        startActivity(startGame);
                    }
                });



            }
        };
        adapter.notifyDataSetChanged();
        listCategory.setAdapter(adapter);

    }
*/

}
