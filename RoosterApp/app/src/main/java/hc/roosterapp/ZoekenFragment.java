package hc.roosterapp;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;


/**
 * A simple {@link Fragment} subclass.
 */
public class ZoekenFragment extends android.support.v4.app.Fragment {

    public ZoekenFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Spinner spinner = (Spinner) getActivity().findViewById(R.id.class_spinner);
        return inflater.inflate(R.layout.fragment_zoeken, container, false);



    }


}
