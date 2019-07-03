package com.mmuhamadamirzaidi.firebaserecyclerview.ViewHolder;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


import com.mmuhamadamirzaidi.firebaserecyclerview.R;
import com.squareup.picasso.Picasso;

public class ViewHolder extends RecyclerView.ViewHolder {

    View mView;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);

        mView = itemView;
    }

    public void setDetails(Context ctx, String name, String description, String image){

        //View
        TextView mTitleTv = mView.findViewById(R.id.rTitleTv);
        TextView mDetailTv = mView.findViewById(R.id.rDescriptionTv);
        ImageView mImageIv = mView.findViewById(R.id.rImageView);

        //Set data to view
        mTitleTv.setText(name);
        mDetailTv.setText(description);
        Picasso.get().load(image).into(mImageIv);
    }
}
