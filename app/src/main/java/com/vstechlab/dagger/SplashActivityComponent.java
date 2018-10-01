package com.vstechlab.dagger;

import com.vstechlab.base.ActivityScope;

import dagger.Component;
import dagger.Subcomponent;

@ActivityScope
@Subcomponent(
        modules = SplashActivityModule.class
)
public interface SplashActivityComponent {
    SplashActivity inject(SplashActivity splashActivity);
}
