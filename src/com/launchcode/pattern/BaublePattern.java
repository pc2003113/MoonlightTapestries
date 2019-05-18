package com.launchcode.pattern;

import com.launchcode.stitch.CircleStitch;
import com.launchcode.stitch.LargeCrossStitch;
import com.launchcode.stitch.ShortLinesStitch;
import com.launchcode.stitch.SmallCrossStitch;

import java.util.ArrayList;

public class BaublePattern extends Pattern {



    public BaublePattern() {
        pattern = new ArrayList<>();
        pattern.add(new ShortLinesStitch());
        pattern.add(new ShortLinesStitch());
        pattern.add(new CircleStitch());
        patternRepeatCount=5;
    }

}
