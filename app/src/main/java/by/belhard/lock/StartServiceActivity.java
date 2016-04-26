package by.belhard.lock;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class StartServiceActivity extends AppCompatActivity {

    private Button turnLockButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        turnLockButton = (Button) findViewById(R.id.turn_lock) ;
        turnLockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startService(new Intent(StartServiceActivity.this, CheckScreenStateService.class));
                finish();
            }
        });

    }
}
