package com.vstechlab.repositories;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.vstechlab.base.data.model.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RepositoriesListAdapter extends RecyclerView.Adapter {

    private RepositoriesListActivity repositoriesListActivity;
    private Map<Integer, RepositoriesListViewHolderFactory> viewHolderFactories;

    private final List<Repository> repositories = new ArrayList<>();

    public RepositoriesListAdapter(RepositoriesListActivity repositoriesListActivity,
                                   Map<Integer, RepositoriesListViewHolderFactory> viewHolderFactories) {
        this.repositoriesListActivity = repositoriesListActivity;
        this.viewHolderFactories = viewHolderFactories;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
