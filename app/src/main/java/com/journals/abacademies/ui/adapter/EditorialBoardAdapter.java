package com.journals.abacademies.ui.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;

import com.journals.abacademies.R;
import com.journals.abacademies.databinding.EditorialBoardItemBinding;
import com.journals.abacademies.model.EditorialBoardResponse;

import java.util.List;

public class EditorialBoardAdapter extends RecyclerView.Adapter<EditorialBoardAdapter.ViewHolder> {

    List<EditorialBoardResponse.EditorialboardarrBean> modelList;
    Context context;

    public EditorialBoardAdapter(List<EditorialBoardResponse.EditorialboardarrBean> modelList, Context context) {
        this.modelList = modelList;
        this.context = context;
    }

    @NonNull
    @Override
    public EditorialBoardAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(EditorialBoardItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull EditorialBoardAdapter.ViewHolder holder, int position) {


        holder.rowItemBinding.txtName.setText(modelList.get(position).getEname()+" "+modelList.get(position).getEditorType());

        if (modelList.get(position).getEditorDescription() != null && !modelList.get(position).getEditorDescription().equalsIgnoreCase("null") && !modelList.get(position).getEditorDescription().isEmpty()) {
            holder.rowItemBinding.txtView1.setText(modelList.get(position).getEditorDescription());
        } else {
            holder.rowItemBinding.txtView1.setVisibility(View.GONE);
        }



    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        EditorialBoardItemBinding rowItemBinding;

        public ViewHolder(@NonNull EditorialBoardItemBinding rowItemBinding) {
            super(rowItemBinding.getRoot());
            this.rowItemBinding = rowItemBinding;
        }
    }
}
