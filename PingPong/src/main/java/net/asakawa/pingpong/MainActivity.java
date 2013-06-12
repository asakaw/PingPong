package net.asakawa.pingpong;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.widget.SeekBar;

public class MainActivity extends Activity {

    private SeekBar seekBar1;
    private SeekBar seekBar2;
    private SeekBar seekBar3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // test
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar1 = (SeekBar) findViewById(R.id.seekBar1);
        seekBar2 = (SeekBar) findViewById(R.id.seekBar2);
        seekBar3 = (SeekBar) findViewById(R.id.seekBar3);

        seekBar1.setOnSeekBarChangeListener(new SeekBarChanged());
        seekBar2.setOnSeekBarChangeListener(new SeekBarChanged());
        seekBar3.setOnSeekBarChangeListener(new SeekBarChanged());
    }

    class SeekBarChanged implements SeekBar.OnSeekBarChangeListener {
        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
            Log.v("onStartTrackingTouch()",
                    String.valueOf(seekBar.getProgress()));
        }
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromTouch) {
            Log.v("onProgressChanged()",
                    String.valueOf(progress) + ", " + String.valueOf(fromTouch));
        }
        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            Log.v("onStopTrackingTouch()",
                    String.valueOf(seekBar.getProgress()));
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
