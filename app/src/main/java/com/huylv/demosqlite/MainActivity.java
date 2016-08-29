package com.huylv.demosqlite;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.huylv.demosqlite.model.Pokemon;
import com.orm.SugarRecord;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Pokemon p = new Pokemon();
        p.setName("sss");
        p.setRating(0.3f);
        p.save();
        List<Pokemon> ps = SugarRecord.listAll(Pokemon.class);
        for(Pokemon pp : ps ){
            Log.e("cxz","__"+pp.getName());
        }

    }
}
