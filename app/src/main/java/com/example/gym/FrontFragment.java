package com.example.gym;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FrontFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FrontFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FrontFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FrontFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FrontFragment newInstance(String param1, String param2) {
        FrontFragment fragment = new FrontFragment();
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

    ImageView shoulder1, shoulder2;
    ImageView chest;
    ImageView biceps1 ,biceps2;
    ImageView tri1, tri2;
    ImageView forearms1, forearms2;
    ImageView abs;
    ImageView obliques1, obliques2;
    ImageView quads1, quads2;
    ImageView calves1, calves2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_front, container, false);

        shoulder1 = view.findViewById(R.id.shoulder1);
        shoulder2 = view.findViewById(R.id.shoulder2);
        biceps1 = view.findViewById(R.id.Biceps1);
        biceps2 = view.findViewById(R.id.Biceps2);
        tri1 = view.findViewById(R.id.tri1);
        tri2 = view.findViewById(R.id.tri2);
        forearms1 = view.findViewById(R.id.forearms1);
        forearms2 = view.findViewById(R.id.forearms2);
        chest = view.findViewById(R.id.chest);
        abs = view.findViewById(R.id.abs);
        obliques1 = view.findViewById(R.id.obliques1);
        obliques2 = view.findViewById(R.id.obliques2);
        quads1 = view.findViewById(R.id.quads1);
        quads2 = view.findViewById(R.id.quads2);
        calves1 = view.findViewById(R.id.calves1);
        calves2 = view.findViewById(R.id.calves2);

        shoulder1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shoulder();
            }
        });

        shoulder2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shoulder();
            }
        });

        biceps1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Biceps();
            }
        });

        biceps2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Biceps();
            }
        });

        tri1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tri();
            }
        });

        tri2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tri();
            }
        });

        forearms1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Forearms();
            }
        });

        forearms2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Forearms();
            }
        });

        chest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chest();
            }
        });
        abs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Abdominals();
            }
        });

        obliques1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Obliques();
            }
        });

        obliques2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Obliques();
            }
        });

        quads1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Quads();
            }
        });

        quads2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Quads();
            }
        });

        calves1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calves();
            }
        });

        calves2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calves();
            }
        });

        return view;
    }

    public void shoulder() {
        reset();
        shoulder1.setColorFilter(getResources().getColor(R.color.red));
        shoulder2.setColorFilter(getResources().getColor(R.color.red));
        Intent intent = new Intent(getContext(), Page.class);
        intent.putExtra("page", "shoulder");
        startActivity(intent);
    }

    public void chest() {
        reset();
        chest.setColorFilter(getResources().getColor(R.color.red));
        Intent intent = new Intent(getContext(), Page.class);
        intent.putExtra("page", "chest");
        startActivity(intent);
    }

    public void Biceps() {
        reset();
        biceps1.setColorFilter(getResources().getColor(R.color.red));
        biceps2.setColorFilter(getResources().getColor(R.color.red));
        Intent intent = new Intent(getContext(), Page.class);
        intent.putExtra("page", "biceps");
        startActivity(intent);
    }

    public void Tri() {
        reset();
        tri1.setColorFilter(getResources().getColor(R.color.red));
        tri2.setColorFilter(getResources().getColor(R.color.red));
        Intent intent = new Intent(getContext(), Page.class);
        intent.putExtra("page", "Triceps");
        startActivity(intent);
    }

    public void Forearms() {
        reset();
        forearms1.setColorFilter(getResources().getColor(R.color.red));
        forearms2.setColorFilter(getResources().getColor(R.color.red));
        Intent intent = new Intent(getContext(), Page.class);
        intent.putExtra("page", "Forearms");
        startActivity(intent);
    }

    public void Abdominals() {
        reset();
        abs.setColorFilter(getResources().getColor(R.color.red));
        Intent intent = new Intent(getContext(), Page.class);
        intent.putExtra("page", "Abdominals");
        startActivity(intent);
    }

    public void Obliques() {
        reset();
        obliques1.setColorFilter(getResources().getColor(R.color.red));
        obliques2.setColorFilter(getResources().getColor(R.color.red));
        Intent intent = new Intent(getContext(), Page.class);
        intent.putExtra("page", "Obliques");
        startActivity(intent);
    }

    public void Quads() {
        reset();
        quads1.setColorFilter(getResources().getColor(R.color.red));
        quads2.setColorFilter(getResources().getColor(R.color.red));
        Intent intent = new Intent(getContext(), Page.class);
        intent.putExtra("page", "Quads");
        startActivity(intent);
    }

    public void Calves() {
        reset();
        calves1.setColorFilter(getResources().getColor(R.color.red));
        calves2.setColorFilter(getResources().getColor(R.color.red));
        Intent intent = new Intent(getContext(), Page.class);
        intent.putExtra("page", "Calves");
        startActivity(intent);
    }

    public void reset() {
        chest.setColorFilter(getResources().getColor(R.color.black));
        shoulder1.setColorFilter(getResources().getColor(R.color.black));
        shoulder2.setColorFilter(getResources().getColor(R.color.black));
        biceps1.setColorFilter(getResources().getColor(R.color.black));
        biceps2.setColorFilter(getResources().getColor(R.color.black));
        forearms1.setColorFilter(getResources().getColor(R.color.black));
        forearms2.setColorFilter(getResources().getColor(R.color.black));
        tri1.setColorFilter(getResources().getColor(R.color.black));
        tri2.setColorFilter(getResources().getColor(R.color.black));
        abs.setColorFilter(getResources().getColor(R.color.black));
        obliques1.setColorFilter(getResources().getColor(R.color.black));
        obliques2.setColorFilter(getResources().getColor(R.color.black));
        quads1.setColorFilter(getResources().getColor(R.color.black));
        quads2.setColorFilter(getResources().getColor(R.color.black));
        calves1.setColorFilter(getResources().getColor(R.color.black));
        calves2.setColorFilter(getResources().getColor(R.color.black));
    }
}