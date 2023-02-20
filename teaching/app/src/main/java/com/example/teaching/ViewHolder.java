package com.example.teaching;

import android.app.Application;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;


@SuppressWarnings("ALL")
public class ViewHolder extends RecyclerView.ViewHolder {

    View mView;
    SimpleExoPlayer exoPlayer;
    private PlayerView mExoplayerView;
    private Object ExoPlayerFactory;


    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        mView = itemView;
    }
    public void setVideo(final Application ctx,String title,final String url){
        TextView mtextView = mView.findViewById(R.id.Titletv);
        mExoplayerView = mView.findViewById(R.id.exoplayer_view);

        mtextView.setText(title);
        try {
            BandwidthMeter bandwidthMeter = new DefaultBandwidthMeter.Builder(ctx).build();
            TrackSelector trackSelector = new DefaultTrackSelector(new AdaptiveTrackSelection.Factory(bandwidthMeter));
            exoPlayer = (SimpleExoPlayer) ExoPlayerFactory
        }

    }
}
