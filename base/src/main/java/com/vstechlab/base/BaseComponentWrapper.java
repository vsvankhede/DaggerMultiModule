package com.vstechlab.base;

import android.app.Application;

import com.vstechlab.base.data.api.NetworkingModule;

public class BaseComponentWrapper {

    private static BaseComponentWrapper baseComponentWrapper;

    private BaseComponentWrapper() {

    }

    public static BaseComponentWrapper getInstance(Application application) {
        if (baseComponentWrapper == null) {
            synchronized (BaseComponentWrapper.class) {
                if (baseComponentWrapper == null) {
                    baseComponentWrapper = new BaseComponentWrapper();
                    baseComponentWrapper.initializeComponent(application);
                }
            }
        }
        return baseComponentWrapper;
    }

    private BaseComponent baseComponent;

    public static BaseComponent getBaseComponent(Application application) {
        BaseComponentWrapper baseComponentWrapper = getInstance(application);
        return baseComponentWrapper.baseComponent;
    }

    public BaseComponent initializeComponent(Application application) {
        baseComponent = DaggerBaseComponent.builder()
                .baseModule(new BaseModule(application))
                .build();
        return baseComponent;
    }
}
