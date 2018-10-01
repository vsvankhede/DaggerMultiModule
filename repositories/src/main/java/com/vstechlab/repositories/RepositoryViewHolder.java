package com.vstechlab.repositories;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.vstechlab.base.data.model.Repository;

public abstract class RepositoryViewHolder extends RecyclerView.ViewHolder {

    public RepositoryViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public abstract void bind(Repository repository);
}
