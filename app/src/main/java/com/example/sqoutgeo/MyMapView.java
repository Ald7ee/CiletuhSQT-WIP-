package com.example.sqoutgeo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.esri.arcgisruntime.ArcGISRuntimeEnvironment;
import com.esri.arcgisruntime.mapping.ArcGISMap;
import com.esri.arcgisruntime.mapping.Basemap;
import com.esri.arcgisruntime.mapping.Viewpoint;
import com.esri.arcgisruntime.mapping.view.MapView;


public class MyMapView extends AppCompatActivity {

    private MapView MyMapView;
    private ArcGISMap MyMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_map_view);
        MyMapView = findViewById(R.id.mapView);
        MyMap = new ArcGISMap(Basemap.Type.OPEN_STREET_MAP,-7.1829932 , 106.4609767, 14);
        MyMapView.setMap(MyMap);
    }

    @Override
    protected void onPause(){
        MyMapView.pause();
        super.onPause();
    }

    @Override
    protected void onResume(){
        super.onResume();
        MyMapView.resume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        MyMapView.dispose();
    }
}