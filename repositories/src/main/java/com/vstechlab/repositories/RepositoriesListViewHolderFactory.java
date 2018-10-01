package com.vstechlab.repositories;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

public interface RepositoriesListViewHolderFactory {
    RecyclerView.ViewHolder createViewHolder(ViewGroup parent);
}
