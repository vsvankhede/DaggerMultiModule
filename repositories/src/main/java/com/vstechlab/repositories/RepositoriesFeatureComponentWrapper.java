package com.vstechlab.repositories;

import android.app.Application;

import com.vstechlab.base.BaseComponent;
import com.vstechlab.base.BaseComponentWrapper;


public class RepositoriesFeatureComponentWrapper {

    private static RepositoriesFeatureComponentWrapper repositoriesFeatureComponentWrapper;

    private RepositoriesFeatureComponentWrapper() {

    }

    public static RepositoriesFeatureComponentWrapper getInstance(Application application) {
        if (repositoriesFeatureComponentWrapper == null) {
            synchronized (RepositoriesFeatureComponentWrapper.class) {
                if (repositoriesFeatureComponentWrapper == null) {
                    repositoriesFeatureComponentWrapper = new RepositoriesFeatureComponentWrapper();
                    repositoriesFeatureComponentWrapper.initializeComponent(BaseComponentWrapper.getBaseComponent(application));
                }
            }
        }
        return repositoriesFeatureComponentWrapper;
    }

    private RepositoriesFeatureComponent repositoriesFeatureComponent;

    public static RepositoriesFeatureComponent getAppComponent(Application application) {
        RepositoriesFeatureComponentWrapper appComponentWrapper = getInstance(application);
        return appComponentWrapper.repositoriesFeatureComponent;
    }

    public RepositoriesFeatureComponent initializeComponent(BaseComponent baseComponent) {
        repositoriesFeatureComponent = DaggerRepositoriesFeatureComponent.builder()
                .baseComponent(baseComponent)
                .build();
        return repositoriesFeatureComponent;
    }
}
