package com.udacity.gradle.builditbigger;

import androidx.annotation.Nullable;
import androidx.annotation.UiThread;

import com.udacity.gradle.builditbigger.backend.myApi.MyApi;

public interface IEndPointAsyncTask {
    @UiThread
    void onRetrieveJokeFinish(@Nullable String result);

}
