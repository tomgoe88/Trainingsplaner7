package com.example.jutom.myapplication;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link UebungFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class UebungFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private UebungListAdapter uebungListAdapter;
    private ListAdapterBauch listAdapterBauch= null;
    private ListAdapterBeine listAdapterBeine= null;
    private ListAdapterTricep listAdapterTricep= null;
    private ListAdapterBicep listAdapterBicep= null;
    private ListAdapterBrust listAdapterBrust= null;
    private ListAdapterObererRuecken listAdapterObererRuecken= null;
    private ListAdapterSchulter listAdapterSchulter= null;
    private ListAdapterRuecken listAdapterRuecken= null;
    private String listName;

    private List<Uebung> uebungList;

    public UebungFragment() {
        // Required empty public constructor
    }
    public UebungFragment( UebungListAdapter uA){

        this.uebungListAdapter=uA;
    }
    public UebungFragment( ListAdapterBrust uA){

        this.listAdapterBrust=uA;
    }
    public UebungFragment( ListAdapterRuecken uA){

        this.listAdapterRuecken=uA;
    }
    public UebungFragment( ListAdapterSchulter uA){

        this.listAdapterSchulter=uA;
    }
    public UebungFragment( ListAdapterObererRuecken uA){

        this.listAdapterObererRuecken=uA;
    }
    public UebungFragment( ListAdapterBauch uA){

        this.listAdapterBauch=uA;
    }
    public UebungFragment( ListAdapterBeine uA){

        this.listAdapterBeine=uA;
    }
    public UebungFragment( ListAdapterBicep uA){

        this.listAdapterBicep=uA;
    }
    public UebungFragment( ListAdapterTricep uA){

        this.listAdapterTricep=uA;
    }
    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment UebungFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static UebungFragment newInstance(String param1, String param2) {
        UebungFragment fragment = new UebungFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
//das muss neu gemacht werden jeder Adapter braucht sein eigenes Fragment
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.uebung_fragment, container, false);
        ListView listView= (ListView)v.findViewById(R.id.uebungList);
        if (uebungListAdapter!= null){
            listView.setAdapter(uebungListAdapter);
            listName="UntererRuecken";}
       else if (listAdapterBrust!= null){
            listView.setAdapter(listAdapterBrust);
            listName="Brust";
        }
       else if (listAdapterTricep!= null){
           listView.setAdapter(listAdapterTricep);
            listName="Tricep";}
       else if (listAdapterBeine!= null){
            listView.setAdapter(listAdapterBeine);
            listName="Beine";}
       else if (listAdapterBauch!= null){
            listView.setAdapter(listAdapterBauch);
            listName="Bauch";}
       else if (listAdapterObererRuecken!= null){
            listView.setAdapter(listAdapterObererRuecken);
            listName="ObererRuecken";}
        else if (listAdapterSchulter!= null){
            listView.setAdapter(listAdapterSchulter);
            listName="Schulter";}
       else if (listAdapterBicep!= null){
            listView.setAdapter(listAdapterBicep);
            listName="Bicep";}
      else if (listAdapterRuecken!= null){
            listView.setAdapter(listAdapterRuecken);
            listName="Ruecken";}

        //TODO hier muss noch ein Button bearbeitet werden hier muss auch die oben darrgestellte IF-Anweisung eingebracht werden um die neue Übung zu öffnen
        //TODO um welche übung es sich handelt sollte über einen String übergeben werden in den Konstruktor
        FloatingActionButton fab = (FloatingActionButton) v.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        return v;
    }

}
