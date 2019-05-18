package com.launchcode.pattern;

import com.launchcode.stitch.LargeCrossStitch;
import com.launchcode.stitch.SmallCrossStitch;

import java.util.ArrayList;

public class CrossStitchWigglePattern extends Pattern {



    public CrossStitchWigglePattern() {
        pattern = new ArrayList<>();
        pattern.add(new SmallCrossStitch());
        pattern.add(new LargeCrossStitch());
        patternRepeatCount=5;
    }

}
