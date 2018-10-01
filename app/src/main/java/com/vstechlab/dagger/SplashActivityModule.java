package com.vstechlab.dagger;

import com.vstechlab.base.ActivityScope;
import com.vstechlab.base.data.api.UserManager;
import com.vstechlab.base.utils.AnalyticsManager;
import com.vstechlab.base.utils.Validator;

import dagger.Module;
import dagger.Provides;

@Module
public class SplashActivityModule {

    private SplashActivity splashActivity;

    public SplashActivityModule(SplashActivity splashActivity) {
        this.splashActivity = splashActivity;
    }

    @Provides
    @ActivityScope
    SplashActivity provideSplashActivity() {
        return splashActivity;
    }

    @Provides
    @ActivityScope
    SplashActivityPresenter provideSplashActivityPresenter(Validator validator,
                                                           UserManager userManager,
                                                           AnalyticsManager analyticsManager) {
        return new SplashActivityPresenter(
                splashActivity,
                validator,
                userManager,
                analyticsManager
        );
    }
}
