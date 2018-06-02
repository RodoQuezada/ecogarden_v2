package com.example.rodo.ecogarden.view.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rodo.ecogarden.R;
import com.example.rodo.ecogarden.adapter.PictureAdapterRecycleView;
import com.example.rodo.ecogarden.model.Picture;

import java.util.ArrayList;

public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        RecyclerView pictureRecycle = (RecyclerView) view.findViewById(R.id.pictureRecycle);



        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        pictureRecycle.setLayoutManager(linearLayoutManager);

        PictureAdapterRecycleView pictureAdapterRecycleView = new PictureAdapterRecycleView(buildPictures() , R.layout.cardview_concejos,getActivity());

        pictureRecycle.setAdapter(pictureAdapterRecycleView);

        return view;
    }

     public ArrayList<Picture> buildPictures(){
         ArrayList<Picture> pictures = new ArrayList<>();
         pictures.add(new Picture("http://www.cuidadodeflores.com/Imagenes/las-10-mejores-flores-medicinales.jpg","Flor blanca"));
         pictures.add(new Picture("https://www.ecoticias.com/userfiles/extra/RMPM_56.jpg","Muchas Flores"));
         pictures.add(new Picture("http://www.cuidadodeflores.com/Imagenes/cuidados-de-flores-bonitas.jpg","Flores Bonitas"));
         pictures.add(new Picture("https://i.pinimg.com/originals/7a/1b/e5/7a1be5872cb71521f505ac6a7256f56b.jpg","Flores Rosadas"));
         pictures.add(new Picture("https://i2.wp.com/lahuertinadetoni.es/wp-content/uploads/2017/06/cosmos-2280144_1280-1024x685.jpg?resize=1024%2C685","Otra flor"));
         pictures.add(new Picture("https://i.ytimg.com/vi/EjHz9ClbrAk/hqdefault.jpg","Angel, La niña de las Flores"));
         pictures.add(new Picture("http://www.elperiscopio.cl/wp-content/uploads/2018/03/Aton_70078-820x385.jpg","Florcita Motuda"));
        return pictures;
     }


}
