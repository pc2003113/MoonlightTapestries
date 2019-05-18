package com.launchcode.pattern;

import com.launchcode.stitch.FillStitch;
import com.launchcode.stitch.ZigZagStitch;

import java.util.ArrayList;

public class ZigZagLinesPattern extends Pattern {



    public ZigZagLinesPattern() {
        pattern = new ArrayList<>();
        pattern.add(new ZigZagStitch());
        pattern.add(new ZigZagStitch());
        pattern.add(new ZigZagStitch());
        pattern.add(new FillStitch());
        pattern.add(new FillStitch());
        pattern.add(new FillStitch());
        patternRepeatCount=2;
    }

}
