package com.furiouskitten.amiel.solidarity.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.furiouskitten.amiel.solidarity.Models.Bookies;
import com.furiouskitten.amiel.solidarity.R;

import java.util.List;

public class BookiesAdapter extends RecyclerView.Adapter<BookiesAdapter.MyViewHolder> {

    Context mContext;
    List<Bookies> mData;
    BookItemClickListener bookItemClickListener;

    public BookiesAdapter(Context context, List<Bookies> data, BookItemClickListener listener) {
        this.mContext = context;
        this.mData = data;
        bookItemClickListener = listener;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_movie, viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        myViewHolder.TvTitle.setText(mData.get(i).getTitle());
        myViewHolder.ImgMovie.setImageResource(mData.get(i).getThumbnail());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {


        private TextView TvTitle;
        private ImageView ImgMovie;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            TvTitle = itemView.findViewById(R.id.item_movie_title);
            ImgMovie = itemView.findViewById(R.id.item_movie_img);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    bookItemClickListener.onBookClick(mData.get(getAdapterPosition()),ImgMovie);


                }
            });


        }
    }
}
