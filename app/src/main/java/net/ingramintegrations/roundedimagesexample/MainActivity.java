package net.ingramintegrations.roundedimagesexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {

    //TODO 4 - Create A CircleImageView Variable
    // Create a Circle Image View variable.
    CircleImageView image1, image2, image3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO 5 - Hook To Our UI
        // Hook the CircleImageView variables to our UI
        image1 = (CircleImageView) findViewById(R.id.profile_image);
        image2 = (CircleImageView) findViewById(R.id.profile_image2);
        image3 = (CircleImageView) findViewById(R.id.profile_image3);

        // The line below set's the image pragmatically using Java Code
        // It's important to use ResourcesCompat.getDrawable()
        //image3.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.cat2, null));

        //TODO 6 - Attach An OnClickListener To Our CircleImageView
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Hello World!", Toast.LENGTH_SHORT).show();
            }
        });

        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Multi-line way to go to another Activity
                /*
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(intent);
                */

                // Single-line way to go to another Activity
                startActivity(new Intent(getApplicationContext(), SecondActivity.class));
            }
        });

    }
}
