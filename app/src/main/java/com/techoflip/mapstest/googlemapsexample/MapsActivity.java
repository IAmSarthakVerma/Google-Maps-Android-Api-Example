package com.techoflip.mapstest.googlemapsexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);


        //Referencing the map fragment
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {

        //Define latitude and longitude for the marker
        LatLng India = new LatLng(28.6239, 77.2090);

        //Add the marker to the position in map
        googleMap.addMarker(new MarkerOptions().position(India)
                .title("Marker in India"));

        //Set the camera to the marker location
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(India));

        //Initial zoom in the map
        googleMap.animateCamera(CameraUpdateFactory.zoomTo(10), 2000, null);
    }
}
