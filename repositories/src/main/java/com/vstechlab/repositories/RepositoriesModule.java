package com.vstechlab.repositories;


import com.vstechlab.base.data.api.GithubApiService;
import com.vstechlab.base.data.api.RepositoriesManager;

import dagger.Module;
import dagger.Provides;

@Module
class RepositoriesModule {
    @Provides
    RepositoriesManager provideRepositoriesManager(GithubApiService githubApiService) {
        return new RepositoriesManager(githubApiService);
    }
}
