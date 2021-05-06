package sg.edu.np.madpractical3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    User user = new User();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String name = user.name;
        String description = user.description;
        user.followed = false; //initially the value is false
        setRandom();
    }

    public void followToggler(View view) {
        Button btn = findViewById(R.id.followBtn);
        if(btn.getText().toString().compareTo("Follow") == 0){
            user.followed = true;
            btn.setText("Unfollow");
            Toast.makeText(getApplicationContext(), "Followed", Toast.LENGTH_SHORT).show();
        }
        else{
            user.followed = false;
            btn.setText("Follow");
            Toast.makeText(getApplicationContext(), "Unfollowed", Toast.LENGTH_SHORT).show();
        }
    }
    public void setRandom(){
        TextView textView = findViewById(R.id.helloText);
        Intent intent = getIntent();
        textView.setText("MAD" + " " +intent.getExtras().get("random").toString());
    }
}