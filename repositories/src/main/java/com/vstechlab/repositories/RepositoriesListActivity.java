package com.vstechlab.repositories;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.vstechlab.base.BaseActivity;

public class RepositoriesListActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repositories_list);
    }

    @Override
    protected void setupActivityComponent() {

    }

    @Override
    public String getScreenName() {
        return null;
    }
}
