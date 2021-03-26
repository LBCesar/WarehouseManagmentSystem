package com.example.warehousemanagmentsystem491b.Supplier;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.example.warehousemanagmentsystem491b.R;

import java.util.ArrayList;
import java.util.List;


public class DisplaySupplierFragment extends Fragment {

    private List<String> supplierList;


//    private static final String ARG_PARAM1 = "param1";
//    private static final String ARG_PARAM2 = "param2";
//
//    private String mParam1;
//    private String mParam2;

//    public DisplaySupplierFragment() {
//        // Required empty public constructor
//    }
//
//    public static DisplaySupplierFragment newInstance(String param1, String param2) {
//        DisplaySupplierFragment fragment = new DisplaySupplierFragment();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
//        fragment.setArguments(args);
//        return fragment;
//    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
//        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_display_supplier, container, false);

        supplierList = new ArrayList<>();
        supplierList.add("You?");
        supplierList.add("Yes,");
        supplierList.add("You!!");
        supplierList.add("Guess");
        supplierList.add("What??");
        supplierList.add("You");
        supplierList.add("Suck...");
        supplierList.add(":)");

        ArrayAdapter<String> mAdapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, supplierList);

        ListView listView = view.findViewById(R.id.supplier_display_listview);
        listView.setAdapter(mAdapter);

        return view;
    }
}