package com.furiouskitten.amiel.solidarity.Adapters;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.furiouskitten.amiel.solidarity.BookContents.UBCV1.UbcvOne_PageOne;
import com.furiouskitten.amiel.solidarity.BookContents.UBCV2.UbcvTwoChapterEight;
import com.furiouskitten.amiel.solidarity.BookContents.UBCV2.UbcvTwoChapterEleven;
import com.furiouskitten.amiel.solidarity.BookContents.UBCV2.UbcvTwoChapterFifteen;
import com.furiouskitten.amiel.solidarity.BookContents.UBCV2.UbcvTwoChapterFive;
import com.furiouskitten.amiel.solidarity.BookContents.UBCV2.UbcvTwoChapterFour;
import com.furiouskitten.amiel.solidarity.BookContents.UBCV2.UbcvTwoChapterFourteen;
import com.furiouskitten.amiel.solidarity.BookContents.UBCV2.UbcvTwoChapterNine;
import com.furiouskitten.amiel.solidarity.BookContents.UBCV2.UbcvTwoChapterOne;
import com.furiouskitten.amiel.solidarity.BookContents.UBCV2.UbcvTwoChapterSeven;
import com.furiouskitten.amiel.solidarity.BookContents.UBCV2.UbcvTwoChapterSix;
import com.furiouskitten.amiel.solidarity.BookContents.UBCV2.UbcvTwoChapterTen;
import com.furiouskitten.amiel.solidarity.BookContents.UBCV2.UbcvTwoChapterThirteen;
import com.furiouskitten.amiel.solidarity.BookContents.UBCV2.UbcvTwoChapterThree;
import com.furiouskitten.amiel.solidarity.BookContents.UBCV2.UbcvTwoChapterThreee;
import com.furiouskitten.amiel.solidarity.BookContents.UBCV2.UbcvTwoChapterTwelve;
import com.furiouskitten.amiel.solidarity.BookContents.UBCV2.UbcvTwoChapterTwo;
import com.furiouskitten.amiel.solidarity.BookContents.UBCV2.UbcvTwoOmnipotent;
import com.furiouskitten.amiel.solidarity.BookContents.UBCV3.UbcvThreeChapterThree;
import com.furiouskitten.amiel.solidarity.Models.UbcvOneChaptersModel;
import com.furiouskitten.amiel.solidarity.R;

import java.util.List;

public class UbcvTwoAdapters extends RecyclerView.Adapter<UbcvTwoAdapters.myUbcvAdapterViewHolder> {


    //DialogBox props

    Dialog pleaseWaitDialog;
    TextView pleaseWaitTv;
    TextView pleaseWaitdesctv;
    ProgressBar pleaseWaitProgressBar;

    //DialogBox props


    private Context mContext;
    private List<UbcvOneChaptersModel> mModels;

    public UbcvTwoAdapters(Context context, List<UbcvOneChaptersModel> models) {
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
                            pleaseWaitDialog.dismiss();
                            Intent chapterContentIntent = new Intent (mContext, UbcvTwoChapterOne.class);
                            mContext.startActivity(chapterContentIntent);
                            ((Activity)mContext).finish();

                        } else if(position == 1){
                            pleaseWaitDialog.dismiss();
                            Intent chapterContentIntent = new Intent (mContext, UbcvTwoChapterTwo.class);
                            mContext.startActivity(chapterContentIntent);
                            ((Activity)mContext).finish();
                        } else if (position == 2) {
                            pleaseWaitDialog.dismiss();
                            Intent chapterContentIntent = new Intent (mContext, UbcvTwoOmnipotent.class);
                            mContext.startActivity(chapterContentIntent);
                            ((Activity)mContext).finish();
                        }else if (position == 3) {
                            pleaseWaitDialog.dismiss();
                            Intent chapterContentIntent = new Intent (mContext, UbcvTwoChapterTwelve.class);
                            mContext.startActivity(chapterContentIntent);
                            ((Activity)mContext).finish();
                        }else if (position == 4) {
                            pleaseWaitDialog.dismiss();
                            Intent chapterContentIntent = new Intent (mContext, UbcvTwoChapterFour.class);
                            mContext.startActivity(chapterContentIntent);
                            ((Activity)mContext).finish();
                        }else if (position == 5) {
                            pleaseWaitDialog.dismiss();
                            Intent chapterContentIntent = new Intent (mContext, UbcvTwoChapterFive.class);
                            mContext.startActivity(chapterContentIntent);
                            ((Activity)mContext).finish();
                        }else if (position == 6) {
                            pleaseWaitDialog.dismiss();
                            Intent chapterContentIntent = new Intent (mContext, UbcvTwoChapterSix.class);
                            mContext.startActivity(chapterContentIntent);
                            ((Activity)mContext).finish();
                        }else if (position == 7) {
                            pleaseWaitDialog.dismiss();
                            Intent chapterContentIntent = new Intent (mContext, UbcvTwoChapterSeven.class);
                            mContext.startActivity(chapterContentIntent);
                            ((Activity)mContext).finish();
                        }else if (position == 8) {
                            pleaseWaitDialog.dismiss();
                            Intent chapterContentIntent = new Intent (mContext, UbcvTwoChapterEight.class);
                            mContext.startActivity(chapterContentIntent);
                            ((Activity)mContext).finish();
                        }else if (position == 9) {
                            pleaseWaitDialog.dismiss();
                            Intent chapterContentIntent = new Intent (mContext, UbcvTwoChapterNine.class);
                            mContext.startActivity(chapterContentIntent);
                            ((Activity)mContext).finish();
                        }else if (position == 10) {
                            pleaseWaitDialog.dismiss();
                            Intent chapterContentIntent = new Intent (mContext, UbcvTwoChapterTen.class);
                            mContext.startActivity(chapterContentIntent);
                            ((Activity)mContext).finish();
                        }else if (position == 11) {
                            pleaseWaitDialog.dismiss();
                            Intent chapterContentIntent = new Intent (mContext, UbcvTwoChapterEleven.class);
                            mContext.startActivity(chapterContentIntent);
                            ((Activity)mContext).finish();
                        }else if (position == 12) {
                            pleaseWaitDialog.dismiss();
                            Intent chapterContentIntent = new Intent (mContext, UbcvTwoChapterThreee.class);
                            mContext.startActivity(chapterContentIntent);
                            ((Activity)mContext).finish();
                        }else if (position == 13) {
                            pleaseWaitDialog.dismiss();
                            Intent chapterContentIntent = new Intent (mContext, UbcvTwoChapterThirteen.class);
                            mContext.startActivity(chapterContentIntent);
                            ((Activity)mContext).finish();
                        }else if (position == 14) {
                            pleaseWaitDialog.dismiss();
                            Intent chapterContentIntent = new Intent (mContext, UbcvTwoChapterFourteen.class);
                            mContext.startActivity(chapterContentIntent);
                            ((Activity)mContext).finish();
                        }else if (position == 15) {
                            pleaseWaitDialog.dismiss();
                            Intent chapterContentIntent = new Intent (mContext, UbcvTwoChapterFifteen.class);
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
