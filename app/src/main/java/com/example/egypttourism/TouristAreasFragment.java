package com.example.egypttourism;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class TouristAreasFragment extends Fragment {

    ListView listOfRestaurants;

    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_fragment, container, false);

        final ArrayList<Lists> results = new ArrayList<Lists>();

        results.add(new Lists(R.drawable.pramids,getString(R.string.TAFName1), getString(R.string.TAFAddress1),
                R.drawable.the_egyptian_museum, getString(R.string.TAFName2) , getString(R.string.TAFAddress2)));
        results.add(new Lists(R.drawable.khanelkhalily,getString(R.string.TAFName3), getString(R.string.TAFAddress3),
                R.drawable.elmo3ez, getString(R.string.TAFName4) , getString(R.string.TAFAddress4)));

        ListsAdapter adapter = new ListsAdapter(getActivity(), R.layout.all_list, results);

        listOfRestaurants = view.findViewById(R.id.lists);

        listOfRestaurants.setAdapter(adapter);

        return view;
    }
}
