package com.furiouskitten.amiel.solidarity.Adapters;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.furiouskitten.amiel.solidarity.Activities.BookHomeActivity;
import com.furiouskitten.amiel.solidarity.Activities.BookMainMenu;
import com.furiouskitten.amiel.solidarity.Authentication.LoginActivity;
import com.furiouskitten.amiel.solidarity.DictionaryMainActivity;
import com.furiouskitten.amiel.solidarity.Models.MainMenuModel;
import com.furiouskitten.amiel.solidarity.R;

import java.util.List;

public class MainMenuAdapter extends PagerAdapter {


    //DialogBox props

    Dialog pleaseWaitDialog;
    TextView pleaseWaitTv;
    TextView pleaseWaitdesctv;
    ProgressBar pleaseWaitProgressBar;

    //DialogBox props

    private List<MainMenuModel> mMainMenuModelList;
    private LayoutInflater mMainMenuLayoutInflater;
    private Context mContext;

    public MainMenuAdapter(List<MainMenuModel> mainMenuModelList, Context context) {
        this.mMainMenuModelList = mainMenuModelList;
        mContext = context;
    }

    @Override
    public int getCount() {
        return mMainMenuModelList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view.equals(o);
    }


    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        mMainMenuLayoutInflater = LayoutInflater.from(mContext);
        View view = mMainMenuLayoutInflater.inflate(R.layout.item_main_menu, container, false);

        //dialog
        pleaseWaitDialog = new Dialog(mContext);
        //doalog

        ImageView mMainMenuImageView;
        TextView mMainMenuTitle;
        TextView mMainMenuDescription;
        Button mMainMenuButton;


        mMainMenuImageView = view.findViewById(R.id.ItemImage);
        mMainMenuTitle = view.findViewById(R.id.ItemTitle);
        mMainMenuDescription = view.findViewById(R.id.ItemDesc);
        mMainMenuButton = view.findViewById(R.id.mMainMenuButton);

        mMainMenuImageView.setImageResource(mMainMenuModelList.get(position).getMainMenuImage());
        mMainMenuTitle.setText(mMainMenuModelList.get(position).getMainMenuTitle());
        mMainMenuDescription.setText(mMainMenuModelList.get(position).getMainMenuDescription());
        mMainMenuButton.setText(mMainMenuModelList.get(position).getMainMenuButtonName());
        mMainMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (position == 0) {
                            pleaseWaitDialog.dismiss();
                            Intent goToBookMenuIntent = new Intent(mContext, BookHomeActivity.class);
                            mContext.startActivity(goToBookMenuIntent);
                            ((Activity)mContext).finish();

                } else if (position == 1) {
                            pleaseWaitDialog.dismiss();
                            Intent goToWallAppIntent = new Intent(mContext, DictionaryMainActivity.class);
                            mContext.startActivity(goToWallAppIntent);
                            ((Activity)mContext).finish();
                }
            }
        });
        container.addView(view, 0);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

    /*
    private void showPleaseWait() {
        pleaseWaitDialog.setContentView(R.layout.pleasewait_dialog);
        pleaseWaitDialog.setCanceledOnTouchOutside(false); //test
        pleaseWaitProgressBar = pleaseWaitDialog.findViewById(R.id.pleasewait_progress);
        pleaseWaitTv = pleaseWaitDialog.findViewById(R.id.titleTv);
        pleaseWaitdesctv = pleaseWaitDialog.findViewById(R.id.messageTv);
        pleaseWaitDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        pleaseWaitDialog.show();
    }
     */

}