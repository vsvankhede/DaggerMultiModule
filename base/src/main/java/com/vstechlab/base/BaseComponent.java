package com.vstechlab.base;

import com.vstechlab.base.data.api.GithubApiService;
import com.vstechlab.base.data.api.NetworkingModule;
import com.vstechlab.base.utils.AnalyticsManager;
import com.vstechlab.base.utils.Validator;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(
        modules = {
                BaseModule.class,
                NetworkingModule.class
        }
)
public interface BaseComponent {

    AnalyticsManager analyticsManager();

    Validator validator();

    GithubApiService githubApiService();
}
