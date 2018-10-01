package com.vstechlab.dagger;

import com.vstechlab.base.BaseComponent;

import dagger.Component;

@AppScope
@Component (
        modules = GithubClientModule.class,
        dependencies = BaseComponent.class
)
public interface AppComponent {
    SplashActivityComponent plus(SplashActivityModule module);
}
