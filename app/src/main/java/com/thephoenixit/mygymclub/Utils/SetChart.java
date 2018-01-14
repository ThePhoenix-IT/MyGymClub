package com.thephoenixit.mygymclub.Utils;

import android.content.Context;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;

/**
 * Created by root on 18/01/14.
 */

public class SetChart {
    private ArrayList<String> arr;
    private Context context;
    private LineChart mChart;
    private ArrayList<Entry> values;

    public SetChart(LineChart var1, Context var2, ArrayList<String> var3, ArrayList<Entry> var4) {
        this.mChart = var1;
        this.context = var2;
        this.arr = var3;
        this.values = var4;
        int var5 = var3.size();
        //var2.getResources().getDimension(2131231416);
        var1.getDescription().setEnabled(false);
        var1.setTouchEnabled(true);
        var1.setDragEnabled(true);
        var1.setScaleEnabled(true);
        var1.setPinchZoom(true);
        var1.setHorizontalScrollBarEnabled(true);
        XAxis var6 = var1.getXAxis();
        var6.setTextSize(13.0F);
        var6.setPosition(XAxis.XAxisPosition.BOTTOM);
        var6.setTextColor(-1);
        var6.setDrawAxisLine(true);
        var6.setDrawGridLines(false);
        var6.setLabelRotationAngle(-25.0F);
        var6.setValueFormatter(new ValueFormatter(var3));
        YAxis var7 = var1.getAxisLeft();
        var7.setTextColor(-1);
        var7.setTextSize(13.0F);
        var1.getAxisRight().setEnabled(false);
        this.setData();
        var1.setVisibleXRangeMaximum(6.0F);
        if (var5 > 1) {
            if (var5 < 7) {
                var6.setLabelCount(var5, true);
            } else {
                var6.setLabelCount(7, true);
            }
        }

        var1.setExtraRightOffset(30.0F);
        var1.setExtraLeftOffset(10.0F);
        var1.animateX(2500);
    }

    private void setData() {
        if (this.mChart.getData() != null && ((LineData) this.mChart.getData()).getDataSetCount() > 0) {
            ((LineDataSet) ((LineData) this.mChart.getData()).getDataSetByIndex(0)).setValues(this.values);
            ((LineData) this.mChart.getData()).notifyDataChanged();
            this.mChart.notifyDataSetChanged();
        } else {
            LineDataSet var1 = new LineDataSet(this.values, "");
            var1.setColor(-1);
            var1.setValueTextColor(-1);
            var1.setCircleColor(-1);
            var1.setLineWidth(1.0F);
            var1.setCircleRadius(3.0F);
            var1.setValueTextSize(9.0F);
            var1.setDrawFilled(true);
            /*if(Utils.getSDKInt() >= 18) {
                var1.setFillDrawable(ContextCompat.getDrawable(this.context, 2130837612));
            }*/

            ArrayList var2 = new ArrayList();
            var2.add(var1);
            LineData var3 = new LineData(var2);
            this.mChart.setData(var3);
            //mMarkerView var4 = new mMarkerView(this.context, 2130968619, this.arr);
            //var4.setChartView(this.mChart);
            //this.mChart.setMarker(var4);
            this.mChart.getLegend().setEnabled(false);
        }
    }
}
