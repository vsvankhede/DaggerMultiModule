package com.vstechlab.repository;

import com.vstechlab.base.data.model.Repository;
import com.vstechlab.base.utils.AnalyticsManager;

public class RepositoryDetailsActivityPresenter {
    private final RepositoryDetailsActivity repositoryDetailsActivity;
    private final String username;
    private final AnalyticsManager analyticsManager;
    private final Repository repository;

    public RepositoryDetailsActivityPresenter(RepositoryDetailsActivity repositoryDetailsActivity,
                                              String username,
                                              AnalyticsManager analyticsManager,
                                              Repository repository) {
        this.repositoryDetailsActivity = repositoryDetailsActivity;
        this.username = username;
        this.analyticsManager = analyticsManager;
        this.repository = repository;
    }

    public void init() {
        analyticsManager.logScreenView(repositoryDetailsActivity.getScreenName());
        repositoryDetailsActivity.setupUserName(username);
        repositoryDetailsActivity.setRepositoryDetails(repository.name, repository.url);
    }
}
