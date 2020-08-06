package com.detoxic.recycler;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.detoxic.recycler.models.Group;
import com.detoxic.recycler.models.MockResponse;

import java.util.List;

@SuppressWarnings("ALL")
public class GroupAdapter extends RecyclerView.Adapter<GroupAdapter.MyViewHolder> {
    List<Group> groupList;
    Activity activity;

    public GroupAdapter(MockResponse mockResponse, Activity activity) {
        this.groupList = mockResponse.getGroups();
        this.activity = activity;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row_group, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.head.setText(groupList.get(position).getTitle());

        holder.recyclerView.setHasFixedSize(false);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(activity);
        holder.recyclerView.setLayoutManager(layoutManager);
        RecyclerView.Adapter mAdapter = new BabyAdapter(groupList.get(position).getBabies());
        holder.recyclerView.setAdapter(mAdapter);
    }

    @Override
    public int getItemCount() {
        return groupList.size();
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView head;
        RecyclerView recyclerView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            head = itemView.findViewById(R.id.head);
            recyclerView = itemView.findViewById(R.id.baby_view);
        }
    }


}

