package com.example.egypttourism;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class ReligiousTouristPlacesFragment extends Fragment {

    ListView listOfRestaurants;

    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_fragment, container, false);

        final ArrayList<Lists> results = new ArrayList<Lists>();

        results.add(new Lists(R.drawable.derstcathrin,getString(R.string.RTPFName1), getString(R.string.RTPFAddress1),
                R.drawable.elazhar, getString(R.string.RTPFName2) , getString(R.string.RTPFAddress2)));
        results.add(new Lists(R.drawable.temleelkebty,getString(R.string.RTPFName3), getString(R.string.RTPFAddress3),
                R.drawable.templeelfaneleslamy, getString(R.string.RTPFName4) , getString(R.string.RTPFAddress4)));

        ListsAdapter adapter = new ListsAdapter(getActivity(), R.layout.all_list, results);

        listOfRestaurants = view.findViewById(R.id.lists);

        listOfRestaurants.setAdapter(adapter);

        return view;
    }
}
