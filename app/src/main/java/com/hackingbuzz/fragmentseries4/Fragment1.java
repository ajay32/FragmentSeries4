package com.hackingbuzz.fragmentseries4;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Avi Hacker on 8/18/2016.
 */
public class Fragment1 extends Fragment  {

    Button b4;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.frag1,container,false);
    }


}
