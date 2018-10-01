package com.vstechlab.dagger;

import com.vstechlab.base.data.api.GithubApiService;
import com.vstechlab.base.data.api.UserManager;

import dagger.Module;
import dagger.Provides;

@Module
public class GithubClientModule {

    @Provides
    @AppScope
    public UserManager provideUserManager(GithubApiService githubApiService) {
        return new UserManager(githubApiService);
    }
}
