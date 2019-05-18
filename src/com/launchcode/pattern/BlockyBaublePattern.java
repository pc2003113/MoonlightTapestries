package com.launchcode.pattern;

import com.launchcode.stitch.*;

import java.util.ArrayList;

public class BlockyBaublePattern extends Pattern {



    public BlockyBaublePattern() {
        pattern = new ArrayList<>();
        pattern.add(new BlockStitch());
        pattern.add(new ShortLinesStitch());
        pattern.add(new ShortLinesStitch());
        pattern.add(new CircleStitch());
        pattern.add(new ShortLinesStitch());
        pattern.add(new ShortLinesStitch());
        patternRepeatCount=3;
    }

}
