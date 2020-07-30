package com.udacity.gradle.builtitbigger;

import androidx.annotation.Nullable;

import com.udacity.gradle.builditbigger.EndpointAsyncTask;
import com.udacity.gradle.builditbigger.IEndPointAsyncTask;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.concurrent.CountDownLatch;

@RunWith(JUnit4.class)
public class AsyncTaskTest {
    private String joke=null;

    @Test
    public void jokeLoadedTester(){
        final CountDownLatch countDownLatch=new CountDownLatch(1);
        new EndpointAsyncTask(new IEndPointAsyncTask() {
            @Override
            public void onRetrieveJokeFinish(@Nullable String result) {
                joke=result;
                countDownLatch.countDown();
            }
        }).execute();
        try {
            countDownLatch.await();
            assert joke!=null: "Nulll";
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
