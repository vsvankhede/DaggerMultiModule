package com.vstechlab.repository;

import com.vstechlab.base.BaseComponent;

import dagger.Component;

@RepositoryFeatureScope
@Component(dependencies = BaseComponent.class)
public interface RepositoryFeatureComponent {
    RepositoryDetailsActivityComponent plus(RepositoryDetailsActivityModule module);
}
