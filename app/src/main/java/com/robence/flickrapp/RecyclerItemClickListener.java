package com.robence.flickrapp;

import android.content.Context;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by user on 2017.10.12..
 */

class RecyclerItemClickListener extends RecyclerView.SimpleOnItemTouchListener {
    public static final String TAG = "RecyclerItemClickListen";

    interface OnRecyclerCLickListener {
        void onItemClick(View view, int position);
        void onItemLongClick(View view, int position);
    }

    private final OnRecyclerCLickListener mListener;
    private final GestureDetectorCompat mGestureDetector;

    public RecyclerItemClickListener(Context context, final RecyclerView recyclerView, OnRecyclerCLickListener listener) {
        mListener = listener;
        mGestureDetector = null;

    }

    @Override
    public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
        Log.d(TAG, "onInterceptTouchEvent: starts");
        return super.onInterceptTouchEvent(rv, e);
    }
}
