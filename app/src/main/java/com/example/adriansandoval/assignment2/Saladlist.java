package madhura.com.example.assignment2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Saladlist extends Activity
{
   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.saladlist);

       Button b1 = findViewById(R.id.s2_name);

       b1.setOnClickListener(new View.OnClickListener() {
           public void onClick(View view) {
               Intent i = new Intent( "android.intent.action.Trio_salad");
               i.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
               startActivity(i);
           }
       });

    }

}
