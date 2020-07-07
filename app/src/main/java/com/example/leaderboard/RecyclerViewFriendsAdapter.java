package com.example.leaderboard;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewFriendsAdapter extends RecyclerView.Adapter<ItemFriendViewHolder>{

    private List<Friend> givenListOfFriends = new ArrayList<>();

    @NonNull
    @Override
    public ItemFriendViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View rootView = inflater.inflate(R.layout.item_chats, parent, false);
        return new ItemFriendViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemFriendViewHolder holder, int position){
        holder.bindItem(givenListOfFriends.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), ActivityTwo.class);

                view.getContext().startActivity(intent);
            }
        });
    }

    public int getItemCount(){
        return givenListOfFriends.size();
    }

    public void submitList(List<Friend> friends){
        this.givenListOfFriends = friends;
        notifyDataSetChanged();
    }

}
