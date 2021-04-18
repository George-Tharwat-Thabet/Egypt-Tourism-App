package com.example.egypttourism;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class hotelsFragment extends Fragment {

    ListView listOfRestaurants;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_fragment, container, false);

        final ArrayList<Lists> results = new ArrayList<Lists>();
        results.add(new Lists(R.drawable.elmasa,getString(R.string.HFName1), getString(R.string.HFAddress1),
                R.drawable.royal_maxim_kempinski, getString(R.string.HFName2) , getString(R.string.HFAddress2)));
        results.add(new Lists(R.drawable.forseason,getString(R.string.HFName3), getString(R.string.HFAddress3),
                R.drawable.dositany, getString(R.string.HFName4) , getString(R.string.HFAddress4)));

        ListsAdapter adapter = new ListsAdapter(getActivity(), R.layout.all_list, results);

        listOfRestaurants = view.findViewById(R.id.lists);

        listOfRestaurants.setAdapter(adapter);

        return view;
    }
}
