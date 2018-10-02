package com.vstechlab.repository;

import com.vstechlab.base.ActivityScope;

import dagger.Subcomponent;

@ActivityScope
@Subcomponent(
        modules = RepositoryDetailsActivityModule.class
)
public interface RepositoryDetailsActivityComponent {
    RepositoryDetailsActivity inject(RepositoryDetailsActivity repositoryDetailsActivity);
}
