package com.thephoenixit.mygymclub.Utils;

import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;

import java.util.ArrayList;

/**
 * Created by root on 18/01/14.
 */

public class ValueFormatter implements IAxisValueFormatter {
    private ArrayList<String> mValues;

    ValueFormatter(ArrayList<String> var1) {
        this.mValues = var1;
    }

    public String getFormattedValue(float var1, AxisBase var2) {
        return var1 > 0.0F ? (String) this.mValues.get((int) var1) : (String) this.mValues.get(0);
    }
}
