package com.khrys.r6assistant;

/*
 * Created by Louis on 30/12/2016.
 * RainbowSixAssistant
*/

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;

public class WeaponsFragment extends Fragment
{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.fragment_weapons, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView mRecycler;
        RecyclerView.LayoutManager mLayout;

        mRecycler = (RecyclerView) view.findViewById(R.id.WeaponsRecycler);

        mRecycler.setHasFixedSize(true);
        mLayout = new LinearLayoutManager(getContext());
        mRecycler.setLayoutManager(mLayout);

        ArrayList<Integer> weaponsimg = new ArrayList<>();
        ArrayList<String> weaponstxt = new ArrayList<>();

        String tableArme[] = {"l85a2","ar33","g36c","r4-c","556xi","f2","ak-12","aug","552 commando","416-c carbine","c8-sfw","mk17 cqb","para 308","type 89","c7e",
                              "p226 mk 25","57 usg","m45 meusoc","p9","lfp586","gsh-18","pmm","p12","mk1","d-50","prb92","luison","p229","usp40",
                              "6p41","g8a1","m249",
                              "smg-11","bearing-9",
                              "417","ots-03","camrs","sr-25",
                              "m590a1","m1014","sg-cqb","sasg-12","m870","super 90","spas-12","spas-15","supernova","ita12l","ita12s",
                              "fmg-9","mp5k","ump45","mp5","p90","9x19vsn","mp7","c1","mpx","m12","mp5sd","pdw9","vector"};

        for(int i = 0; i < 62; i++)
        {
            String img = "g_"+tableArme[i];
            img = img.replace(' ','_');
            img = img.replace('-','_');

            int imgid = getResources().getIdentifier(img, "drawable", view.getContext().getPackageName());

            weaponsimg.add(imgid);
            weaponstxt.add(tableArme[i]);
        }

        mRecycler.setAdapter(new ListAdapterWeapons(1,weaponsimg,weaponstxt));
    }

}