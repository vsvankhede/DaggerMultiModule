package com.vstechlab.repository;

import com.vstechlab.base.ActivityScope;
import com.vstechlab.base.data.api.response.RepositoryResponse;
import com.vstechlab.base.data.model.Repository;
import com.vstechlab.base.utils.AnalyticsManager;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class RepositoryDetailsActivityModule {
    private final RepositoryDetailsActivity repositoryDetailsActivity;
    private final String username;
    private final Repository repository;

    public RepositoryDetailsActivityModule(RepositoryDetailsActivity repositoryDetailsActivity,
                                           String username,
                                           Repository repository) {
        this.repositoryDetailsActivity = repositoryDetailsActivity;
        this.username = username;
        this.repository = repository;
    }

    @Provides
    @ActivityScope
    RepositoryDetailsActivity provideRepositoryDetailsActivity() {
        return this.repositoryDetailsActivity;
    }

    @Provides
    @ActivityScope
    @Named("github-username")
    String provideUsername() {
        return this.username;
    }

    @Provides
    @ActivityScope
    Repository provideRepository() {
        return this.repository;
    }

    @Provides
    @ActivityScope
    RepositoryDetailsActivityPresenter provideRepositoryDetailsActivityPresenter(
            RepositoryDetailsActivity repositoryDetailsActivity,
            @Named("github-username") String username,
            AnalyticsManager analyticsManager,
            Repository repository
    ) {
        return new RepositoryDetailsActivityPresenter(
                repositoryDetailsActivity,
                username,
                analyticsManager,
                repository
        );
    }

}
