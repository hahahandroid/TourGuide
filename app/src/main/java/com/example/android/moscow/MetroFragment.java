package com.example.android.moscow;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MetroFragment extends Fragment {

    public MetroFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create a list of words
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(getString(R.string.firts_metro), getString(R.string.first_metro_description), R.drawable.kuevskaya));
        attractions.add(new Attraction(getString(R.string.second_metro), getString(R.string.second_metro_description), R.drawable.smolenskaya));
        attractions.add(new Attraction(getString(R.string.third_metro), getString(R.string.third_metro_description), R.drawable.arbat));

        ArrayAdapter<Attraction> itemsAdapter = new AttractionAdapter(getActivity(), attractions, R.color.category_metro);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(itemsAdapter);

        return rootView;
    }
}
