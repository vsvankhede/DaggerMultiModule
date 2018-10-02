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
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final RecyclerView.ViewHolder viewHolder = viewHolderFactories.get(viewType).createViewHolder(parent);
        viewHolder.itemView.setOnClickListener(v -> onRepositoryItemClicked(viewHolder.getAdapterPosition()));
        return viewHolder;
    }

    private void onRepositoryItemClicked(int adapterPosition) {
        repositoriesListActivity.onRepositoryClick(repositories.get(adapterPosition));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((RepositoryViewHolder) holder).bind(repositories.get(position));
    }

    @Override
    public int getItemCount() {
        return repositories.size();
    }

    @Override
    public int getItemViewType(int position) {
        Repository repository = repositories.get(position);
        if (repository.stargazers_count > 500) {
            if (repository.forks_count > 100) {
                return Repository.TYPE_FEATURED;
            }
            return Repository.TYPE_BIG;
        }
        return Repository.TYPE_NORMAL;
    }

    public void updateRepositoriesList(List<Repository> repositories) {
        this.repositories.clear();
        this.repositories.addAll(repositories);
        notifyDataSetChanged();
    }
}
