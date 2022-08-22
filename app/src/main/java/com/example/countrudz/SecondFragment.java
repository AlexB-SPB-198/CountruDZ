package com.example.countrudz;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SecondFragment extends Fragment implements onClick {
    private ArrayList<Model> data;
    private MainAdapter adapter;
    private RecyclerView recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        recyclerView = view.findViewById(R.id.recycle_second);
        adapter = new MainAdapter(data, this::onClick);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        data = new ArrayList<>();
        Bundle bundle = getArguments();
        Integer val = bundle.getInt(getString(R.string.key));
        switch (val) {
            case 1:
                data.add(new Model("Сanada", R.drawable.canada));
                data.add(new Model("Cuba", R.drawable.cuba));
                data.add(new Model("Bagamy", R.drawable.bagamy));
                data.add(new Model("Mexico", R.drawable.mexco));
                data.add(new Model("USA", R.drawable.usa));
                break;

            case 2:
                data.add(new Model("Brazil", R.drawable.brazil));
                data.add(new Model("Argentina", R.drawable.argentina));
                data.add(new Model("Uruguay", R.drawable.uruguay));
                data.add(new Model("Peru", R.drawable.peru));
                data.add(new Model("Bolivia", R.drawable.bolivia));
                break;

            case 3:
                data.add(new Model("Australia", R.drawable.australia));
                break;

            case 4:
                data.add(new Model("Egypt", R.drawable.egypt));
                data.add(new Model("Sudan", R.drawable.sudan));
                data.add(new Model("Kenya", R.drawable.kenya));
                data.add(new Model("Nigerya", R.drawable.nigerya));
                data.add(new Model("Angelo", R.drawable.angelo));
                break;

            case 5:
                data.add(new Model("Russia", R.drawable.russia));
                data.add(new Model("Kyrgyzstan", R.drawable.kyrgyzstan));
                data.add(new Model("Kazahstan", R.drawable.kazahstan));
                data.add(new Model("Turkey", R.drawable.turkey));
                data.add(new Model("Horwatya", R.drawable.horwatya));

                break;


        }


    }

    @Override
    public void onClick(Model model) {

    }
}
