package me.everzc.patterngridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

import me.zwj.patterngridview.NineAdapter;
import me.zwj.patterngridview.NineGridView;

public class MainActivity extends AppCompatActivity {

    private NineAdapter nineAdapter;
    private ArrayList mPictureList;
    private NineGridView nineGridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nineGridView=findViewById(R.id.nvGallery);
        mPictureList = new ArrayList();
        mPictureList.add("http://img1.imgtn.bdimg.com/it/u=2539369344,2565018293&fm=26&gp=0.jpg");
        mPictureList.add("http://img1.imgtn.bdimg.com/it/u=2539369344,2565018293&fm=26&gp=0.jpg");
        mPictureList.add("http://img1.imgtn.bdimg.com/it/u=2539369344,2565018293&fm=26&gp=0.jpg");

        nineAdapter = new NineAdapter(MainActivity.this, mPictureList);
        nineGridView.setAdapter(nineAdapter);
        nineGridView.setSpace(10);
    }
}
