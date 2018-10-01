package com.vstechlab.repositories;

import com.vstechlab.base.BaseComponent;

import dagger.Component;

@RepositoriesFeatureScope
@Component(
        dependencies = BaseComponent.class,
        modules = RepositoriesModule.class
)
public interface RepositoriesFeatureComponent {
    RepositoriesListActivityComponent plus(RepositoriesListActivityModule module);
}
