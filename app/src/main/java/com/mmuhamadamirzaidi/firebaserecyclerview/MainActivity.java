package com.mmuhamadamirzaidi.firebaserecyclerview;


import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.mmuhamadamirzaidi.firebaserecyclerview.Model.Category;
import com.mmuhamadamirzaidi.firebaserecyclerview.ViewHolder.ViewHolder;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    FirebaseDatabase mFirebaseDatabase;
    DatabaseReference mRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Action bar
        ActionBar actionBar = getSupportActionBar();

        //Set title
        actionBar.setTitle("Category");

        //RecyclerView
        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);

        //Set layout as linear layout
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        //Send query to Firebase
        mFirebaseDatabase = FirebaseDatabase.getInstance();
        mRef = mFirebaseDatabase.getReference("Category");
    }

    @Override
    protected void onStart(){
        super.onStart();
        FirebaseRecyclerAdapter<Category, ViewHolder> firebaseRecyclerAdapter = new FirebaseRecyclerAdapter<Category, ViewHolder>(Category.class, R.layout.row, ViewHolder.class, mRef) {
            @Override
            protected void populateViewHolder(ViewHolder viewHolder, Category category, int i) {
                viewHolder.setDetails(getApplicationContext(), category.getName(), category.getDescription(), category.getImage());
            }
        };
        //Set adapter to recyclerview
        mRecyclerView.setAdapter(firebaseRecyclerAdapter);
    }
}
