package com.launchcode.pattern;

import com.launchcode.stitch.Stitch;

import java.util.ArrayList;

public class Pattern {
    protected ArrayList<Stitch> pattern;
    protected int patternRepeatCount;

    //protected Stitch stitch1;
   // protected Stitch stitch2;

public void pattern(){
    //i)what is repeating and ii) how many times
    for (int m=1;m<=patternRepeatCount;m++) {
        for (int i=0; i < pattern.size(); i++) {
            pattern.get(i).sew();
        }
    }


}


}
