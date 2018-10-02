package com.vstechlab.repositories;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.auto.factory.AutoFactory;
import com.vstechlab.base.data.model.Repository;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Miroslaw Stanek on 11.06.2016.
 */
@AutoFactory(implementing = RepositoriesListViewHolderFactory.class)
public class RepositoryViewHolderBig extends RepositoryViewHolder {

    @BindView(R2.id.tvName)
    TextView tvName;
    @BindView(R2.id.tvStars)
    TextView tvStarts;
    @BindView(R2.id.tvForks)
    TextView tvForks;

    public RepositoryViewHolderBig(ViewGroup parent) {
        super(LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_big, parent, false));
        ButterKnife.bind(this, itemView);
    }

    @Override
    public void bind(Repository repository) {
        tvName.setText(repository.name);
        tvStarts.setText("Stars: " + repository.stargazers_count);
        tvForks.setText("Forks: " + repository.forks_count);
    }

}
