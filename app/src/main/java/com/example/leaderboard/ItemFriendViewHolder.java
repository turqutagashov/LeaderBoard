package com.example.leaderboard;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemFriendViewHolder extends RecyclerView.ViewHolder {

    private ImageView imageProfile;
    private TextView name;
    private TextView pts;
    private TextView level;
    private ProgressBar progress;
    private TextView placeNumber;


    public ItemFriendViewHolder(@NonNull View itemView) {
        super(itemView);
        imageProfile = itemView.findViewById(R.id.image_view_profile_photo);
        name = itemView.findViewById(R.id.text_view_name);
        pts = itemView.findViewById(R.id.text_view_pts);
        level = itemView.findViewById(R.id.text_view_level);
        progress = itemView.findViewById(R.id.progress_bar);
        placeNumber = itemView.findViewById(R.id.text_view_place_number);
    }

    public void bindItem(Friend friendData){
        name.setText(friendData.getName());
        pts.setText(friendData.getPts());
        level.setText(friendData.getLevel());
        progress.setProgress(friendData.getProgress());
        placeNumber.setText(friendData.getPlaceNumber());
    }

}
