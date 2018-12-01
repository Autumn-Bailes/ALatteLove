package example.android.lovealatte;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*Intent to show location on Google Maps*/

    public void mapLocation(View view) {
        Intent location = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("google.navigation:q=Laguna Beach, CA 92651" + (" + Love A Latte + ")));
        location.setPackage("com.google.android.apps.maps");
        if (location.resolveActivity(getPackageManager()) != null) {
            startActivity(location);
        }
    }

    public void addressPin(View view) {
        Intent address = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("geo:33.5100268,-117.7525544?z=10" + (" + Love A Latte + ")));
        if (address.resolveActivity(getPackageManager()) != null) {
            startActivity(address);
        }
    }

    public void callCafe(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:(707) 555 5555"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}


