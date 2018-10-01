package com.vstechlab.repositories;

import com.vstechlab.base.data.api.RepositoriesManager;
import com.vstechlab.base.utils.AnalyticsManager;

public class RepositoriesListActivityPresenter {
    private final RepositoriesListActivity repositoriesListActivity;
    private final RepositoriesManager repositoriesManager;
    private final String username;
    private final AnalyticsManager analyticsManager;

    public RepositoriesListActivityPresenter(RepositoriesListActivity repositoriesListActivity,
                                             RepositoriesManager repositoriesManager,
                                             String username,
                                             AnalyticsManager analyticsManager) {
        this.repositoriesListActivity = repositoriesListActivity;
        this.repositoriesManager = repositoriesManager;
        this.username = username;
        this.analyticsManager = analyticsManager;
    }
}
