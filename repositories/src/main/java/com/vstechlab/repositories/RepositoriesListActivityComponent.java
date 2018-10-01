package com.vstechlab.repositories;

import com.vstechlab.base.ActivityScope;

import dagger.Subcomponent;

@ActivityScope
@Subcomponent(
        modules =  RepositoriesListActivityModule.class
)
public interface RepositoriesListActivityComponent {
    RepositoriesListActivity inject(RepositoriesListActivity repositoriesListActivity);
}
