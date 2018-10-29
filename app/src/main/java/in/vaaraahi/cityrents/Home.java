package in.vaaraahi.cityrents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class Home extends AppCompatActivity {

    GridView gridView;

    int[] image={R.drawable.imageland,R.drawable.imageland,R.drawable.imageland,
            R.drawable.imageland,R.drawable.imageland,R.drawable.imageland};

    String[] name={"Owners","Tenents","rented homes","Buying & Selling","Contact Us","Service Agreements"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);

        gridView=findViewById(R.id.grid);

        CustomGrid customGrid=new CustomGrid(this,image,name);
        gridView.setAdapter(customGrid);

    }
}
