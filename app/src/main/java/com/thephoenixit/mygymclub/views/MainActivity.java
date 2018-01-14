package com.thephoenixit.mygymclub.views;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.thephoenixit.mygymclub.Beans.ChestItem;
import com.thephoenixit.mygymclub.R;
import com.thephoenixit.mygymclub.Utils.SetChart;

import net.cachapa.expandablelayout.ExpandableLayout;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private ExpandableLayout expandable_layout1, expandable_layout2;
    private DrawerLayout drawer;
    private LineChart lineWeightChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        lineWeightChart = findViewById(R.id.lineWeight);
        List<ChestItem> measure = new ArrayList();
        measure.add(new ChestItem("10", new Date().toString()));
        measure.add(new ChestItem("100", new Date().toString()));
        measure.add(new ChestItem("170", new Date().toString()));
        measure.add(new ChestItem("102", new Date().toString()));
        measure.add(new ChestItem("210", new Date().toString()));
        chartData(measure, lineWeightChart);
        Button btn_menu = findViewById(R.id.btn_menu);
        btn_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawer.closeDrawer(GravityCompat.START);
            }
        });
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        TextView tv_weight = findViewById(R.id.tv_weight);
        tv_weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (expandable_layout2.isExpanded()) {
                    expandable_layout2.collapse();
                } else {
                    expandable_layout2.expand();
                }
            }
        });
        TextView user_name = findViewById(R.id.user_name);
        TextView user_email = findViewById(R.id.user_email);
        TextView item_class_schedule = findViewById(R.id.item_class_schedule);
        user_name.setText("Hamza JGUERIM");
        user_email.setText("hamzajg@gmail.com");
        expandable_layout1 = findViewById(R.id.expandable_layout1);
        expandable_layout2 = findViewById(R.id.expandable_layout2);
        item_class_schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (expandable_layout1.isExpanded()) {
                    expandable_layout1.collapse();
                } else {
                    expandable_layout1.expand();
                }
            }
        });
    }

    private void chartData(List list, LineChart linechart) {
        linechart.clear();
        if (list.size() > 0) {
            ArrayList arraylist = new ArrayList();
            for (int i = 0; i < list.size(); i++)
                arraylist.add(((ChestItem) list.get(i)).getResultDate());

            ArrayList arraylist1 = new ArrayList();
            for (int j = 0; j < list.size(); j++) {
                float f = Float.parseFloat(((ChestItem) list.get(j)).getResult());
                arraylist1.add(new Entry(j, f));
            }

            new SetChart(linechart, this, arraylist, arraylist1);
        }
    }

    private void setChartData(int count, float range) {
        ArrayList<Entry> values = new ArrayList<Entry>();

        for (int i = 0; i < count; i++) {
            float val = (float) (Math.random() * range) + 3;
            values.add(new Entry(i, val));
        }

        // create a dataset and give it a type
        LineDataSet set1 = new LineDataSet(values, "DataSet 1");
        // set1.setFillAlpha(110);
        // set1.setFillColor(Color.RED);

        set1.setLineWidth(1.75f);
        set1.setCircleRadius(5f);
        set1.setCircleHoleRadius(2.5f);
        set1.setColor(Color.WHITE);
        set1.setCircleColor(Color.WHITE);
        set1.setHighLightColor(Color.WHITE);
        set1.setDrawValues(false);

        // create a data object with the datasets
        LineData data = new LineData(set1);

        // set data
        lineWeightChart.setData(data);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
