package com.example.egypttourism;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class resturantsFragment extends Fragment {

    ListView listOfRestaurants;

    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_fragment, container, false);

        final ArrayList<Lists> results = new ArrayList<Lists>();

        results.add(new Lists(R.drawable.sobhykaber,getString(R.string.RFName1), getString(R.string.RFAddress1),
                R.drawable.abutarek, getString(R.string.RFName2) , getString(R.string.RFAddress2)));
        results.add(new Lists(R.drawable.olives,getString(R.string.RFName3), getString(R.string.RFAddress3),
                R.drawable.kebdet_elbrense, getString(R.string.RFName4) , getString(R.string.RFAddress4)));

        ListsAdapter adapter = new ListsAdapter(getActivity(), R.layout.all_list, results);

        listOfRestaurants = view.findViewById(R.id.lists);

        listOfRestaurants.setAdapter(adapter);

        return view;
    }
}
