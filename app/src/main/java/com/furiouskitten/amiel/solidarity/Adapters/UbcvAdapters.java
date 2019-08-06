package com.furiouskitten.amiel.solidarity.Adapters;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.furiouskitten.amiel.solidarity.BookContents.UBCV1.UbcvOneChapterEight;
import com.furiouskitten.amiel.solidarity.BookContents.UBCV1.UbcvOneChapterFive;
import com.furiouskitten.amiel.solidarity.BookContents.UBCV1.UbcvOneChapterFour;
import com.furiouskitten.amiel.solidarity.BookContents.UBCV1.UbcvOneChapterNine;
import com.furiouskitten.amiel.solidarity.BookContents.UBCV1.UbcvOneChapterSeven;
import com.furiouskitten.amiel.solidarity.BookContents.UBCV1.UbcvOneChapterSix;
import com.furiouskitten.amiel.solidarity.BookContents.UBCV1.UbcvOneChapterThree;
import com.furiouskitten.amiel.solidarity.BookContents.UBCV1.UbcvOneChapterTwo;
import com.furiouskitten.amiel.solidarity.BookContents.UBCV1.UbcvOne_PageOne;
import com.furiouskitten.amiel.solidarity.Models.UbcvOneChaptersModel;
import com.furiouskitten.amiel.solidarity.R;

import java.util.List;

public class UbcvAdapters extends RecyclerView.Adapter<UbcvAdapters.myUbcvAdapterViewHolder> {


    //DialogBox props

    Dialog pleaseWaitDialog;
    TextView pleaseWaitTv;
    TextView pleaseWaitdesctv;
    ProgressBar pleaseWaitProgressBar;

    //DialogBox props


    private Context mContext;
    private List<UbcvOneChaptersModel> mModels;

    public UbcvAdapters(Context context, List<UbcvOneChaptersModel> models) {
        this.mContext = context;
        this.mModels = models;
    }

    @NonNull
    @Override
    public myUbcvAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater mLayoutInflater = LayoutInflater.from(mContext);
        view = mLayoutInflater.inflate(R.layout.cardview_chapters,viewGroup,false);
        return new myUbcvAdapterViewHolder(view);
        //return null;
    }

    @Override
    public void onBindViewHolder(@NonNull myUbcvAdapterViewHolder myUbcvAdapterViewHolder, final int position) {

        //dialog
        pleaseWaitDialog = new Dialog(mContext);
        //doalog

        myUbcvAdapterViewHolder.mChapterTextView.setText(mModels.get(position).getChapterTitle());
        myUbcvAdapterViewHolder.mChapterTextView.bringToFront();
        myUbcvAdapterViewHolder.mBookNumberImageView.setImageResource(mModels.get(position).getChapterImage());
        myUbcvAdapterViewHolder.mChaptersCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    if(position == 0){
                        Intent chapterContentIntent = new Intent (mContext, UbcvOne_PageOne.class);
                        mContext.startActivity(chapterContentIntent);
                        ((Activity)mContext).finish();
                    }else if(position == 1){
                        Intent chapterContentIntent = new Intent (mContext, UbcvOneChapterTwo.class);
                        mContext.startActivity(chapterContentIntent);
                        ((Activity)mContext).finish();
                    }else if(position == 2){
                        Intent chapterContentIntent = new Intent (mContext, UbcvOneChapterThree.class);
                        mContext.startActivity(chapterContentIntent);
                        ((Activity)mContext).finish();
                    }else if(position == 3){
                        Intent chapterContentIntent = new Intent (mContext, UbcvOneChapterFour.class);
                        mContext.startActivity(chapterContentIntent);
                        ((Activity)mContext).finish();
                    }else if(position == 4){
                        Intent chapterContentIntent = new Intent (mContext, UbcvOneChapterFive.class);
                        mContext.startActivity(chapterContentIntent);
                        ((Activity)mContext).finish();
                    }else if(position == 5){
                        Intent chapterContentIntent = new Intent (mContext, UbcvOneChapterSix.class);
                        mContext.startActivity(chapterContentIntent);
                        ((Activity)mContext).finish();
                    }else if(position == 6){
                        Intent chapterContentIntent = new Intent (mContext, UbcvOneChapterSeven.class);
                        mContext.startActivity(chapterContentIntent);
                        ((Activity)mContext).finish();
                    }else if(position == 7){
                        Intent chapterContentIntent = new Intent (mContext, UbcvOneChapterEight.class);
                        mContext.startActivity(chapterContentIntent);
                        ((Activity)mContext).finish();
                    }else if(position == 8){
                        Intent chapterContentIntent = new Intent (mContext, UbcvOneChapterNine.class);
                        mContext.startActivity(chapterContentIntent);
                        ((Activity)mContext).finish();
                    }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mModels.size();
    }



    public static class myUbcvAdapterViewHolder extends RecyclerView.ViewHolder{

            CardView mChaptersCardView;
            TextView mChapterTextView;
            ImageView mBookNumberImageView;

        public myUbcvAdapterViewHolder(@NonNull View itemView) {
            super(itemView);

            mChaptersCardView = itemView.findViewById(R.id.cardview_chapters_id);
            mChapterTextView = itemView.findViewById(R.id.chapter_title_textview);
            mBookNumberImageView = itemView.findViewById(R.id.bookNumberImage);

        }
    }



    /*
    private void showPleaseWait(){
        pleaseWaitDialog.setContentView(R.layout.pleasewait_dialog);
        pleaseWaitDialog.setCanceledOnTouchOutside(false);
        pleaseWaitProgressBar = pleaseWaitDialog.findViewById(R.id.pleasewait_progress);
        pleaseWaitTv = pleaseWaitDialog.findViewById(R.id.titleTv);
        pleaseWaitdesctv = pleaseWaitDialog.findViewById(R.id.messageTv);
        pleaseWaitDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        pleaseWaitDialog.show();
    }
 */


}
