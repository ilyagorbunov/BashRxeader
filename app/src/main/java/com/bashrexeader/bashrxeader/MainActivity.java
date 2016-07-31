package com.bashrexeader.bashrxeader;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Action1;
import rx.functions.Func1;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Observable.just("Text")
                .map(new Func1<String, String>() {
                    @Override
                    public String call(String s) {
                        return s + " -Owner";
                    }
                })
                .subscribe(s -> System.out.println(s));
    }

}
