package com.detoxic.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.detoxic.recycler.models.Baby;

import java.util.List;

public class BabyAdapter extends RecyclerView.Adapter<BabyAdapter.ViewHolder> {
    List<Baby> stringArrayList;

    public BabyAdapter(List<Baby> stringArrayList) {
        this.stringArrayList = stringArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row_child, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.babyId.setText(stringArrayList.get(position).getTitle());

    }

    @Override
    public int getItemCount() {
        return stringArrayList.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView babyId;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            babyId = itemView.findViewById(R.id.baby_id);
        }
    }


}
