package com.techfreaks.fragmentsandservices;

import android.app.Fragment;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class ListFragment extends Fragment {
    public interface OnPartySelectedInterface
    {
        void onListPartySelected(int index);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        OnPartySelectedInterface listener= (OnPartySelectedInterface) getActivity();
        View v=inflater.inflate(R.layout.fragment_list,container,false);
        RecyclerView rv= (RecyclerView) v.findViewById(R.id.listrecyclerview);
        ListAdapter la=new ListAdapter();
        rv.setAdapter(la);
        RecyclerView.LayoutManager lm=new LinearLayoutManager(getActivity());
        rv.setLayoutManager(lm);
        return v;


    }
}
