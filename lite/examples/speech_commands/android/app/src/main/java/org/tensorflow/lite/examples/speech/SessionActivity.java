package org.tensorflow.lite.examples.speech;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SessionActivity extends AppCompatActivity {
    private TextView sessionNameTextView, zoneNameTextView, timerTextView, totalCountTextView, makesCountTextView, percentageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_session);


    }
}
