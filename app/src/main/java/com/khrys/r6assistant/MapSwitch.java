package com.khrys.r6assistant;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Chrysler on 11/30/2016.
 * <p>
 * RainbowSixPartner
 */

class MapSwitch
{

    private ArrayList<Integer> pics, poscam;
    private int pos;

    MapSwitch()
    {

    }

     MapSwitch(ArrayList<Integer> pics, ArrayList<Integer> poscam, int pos)
    {
        this.pics = pics;
        this.poscam = poscam;
        this.pos = pos;
    }


    ArrayList<Integer> SwitcherPics()
    {
        switch (pos)
        {
            case 0:
                pics.add(R.drawable.bank_cam_1);
                pics.add(R.drawable.bank_cam_2);
                pics.add(R.drawable.bank_cam_3);
                pics.add(R.drawable.bank_cam_4);
                pics.add(R.drawable.bank_cam_5);
                pics.add(R.drawable.bank_cam_6);
                pics.add(R.drawable.bank_cam_7);
                break;

            case 1:
                pics.add(R.drawable.chalet_cam_1);
                pics.add(R.drawable.chalet_cam_2);
                pics.add(R.drawable.chalet_cam_3);
                pics.add(R.drawable.chalet_cam_4);
                pics.add(R.drawable.chalet_cam_5);
                pics.add(R.drawable.chalet_cam_6);
                break;

            case 2:
                pics.add(R.drawable.clubhouse_cam_1);
                pics.add(R.drawable.clubhouse_cam_2);
                pics.add(R.drawable.clubhouse_cam_3);
                pics.add(R.drawable.clubhouse_cam_4);
                pics.add(R.drawable.clubhouse_cam_5);
                pics.add(R.drawable.clubhouse_cam_6);
                pics.add(R.drawable.clubhouse_cam_7);
                break;

            case 3:
                pics.add(R.drawable.consulate_cam_1);
                pics.add(R.drawable.consulate_cam_2);
                pics.add(R.drawable.consulate_cam_3);
                pics.add(R.drawable.consulate_cam_4);
                pics.add(R.drawable.consulate_cam_5);
                pics.add(R.drawable.consulate_cam_6);
                pics.add(R.drawable.consulate_cam_7);
                pics.add(R.drawable.consulate_cam_8);
                break;

            case 4:
                pics.add(R.drawable.hereford_cam_1);
                pics.add(R.drawable.hereford_cam_2);
                pics.add(R.drawable.hereford_cam_3);
                pics.add(R.drawable.hereford_cam_4);
                pics.add(R.drawable.hereford_cam_5);
                pics.add(R.drawable.hereford_cam_6);
                break;

            case 5:
                pics.add(R.drawable.house_cam_1);
                pics.add(R.drawable.house_cam_2);
                pics.add(R.drawable.house_cam_3);
                pics.add(R.drawable.house_cam_4);
                pics.add(R.drawable.house_cam_5);
                pics.add(R.drawable.house_cam_6);
                break;

            case 6:
                pics.add(R.drawable.kafedostoyevsky_cam_1);
                pics.add(R.drawable.kafedostoyevsky_cam_2);
                pics.add(R.drawable.kafedostoyevsky_cam_3);
                pics.add(R.drawable.kafedostoyevsky_cam_4);
                pics.add(R.drawable.kafedostoyevsky_cam_5);
                pics.add(R.drawable.kafedostoyevsky_cam_6);
                break;

            case 7:
                pics.add(R.drawable.kanal_cam_1);
                pics.add(R.drawable.kanal_cam_2);
                pics.add(R.drawable.kanal_cam_3);
                pics.add(R.drawable.kanal_cam_4);
                pics.add(R.drawable.kanal_cam_5);
                pics.add(R.drawable.kanal_cam_6);
                pics.add(R.drawable.kanal_cam_7);
                break;

            case 8:
                pics.add(R.drawable.oregon_cam_1);
                pics.add(R.drawable.oregon_cam_2);
                pics.add(R.drawable.oregon_cam_3);
                pics.add(R.drawable.oregon_cam_4);
                pics.add(R.drawable.oregon_cam_5);
                pics.add(R.drawable.oregon_cam_6);
                pics.add(R.drawable.oregon_cam_7);
                break;

            case 9:
                pics.add(R.drawable.plane_cam_1);
                pics.add(R.drawable.plane_cam_2);
                pics.add(R.drawable.plane_cam_3);
                pics.add(R.drawable.plane_cam_4);
                pics.add(R.drawable.plane_cam_5);
                break;

            case 10:
                pics.add(R.drawable.favela_cam_1);
                pics.add(R.drawable.favela_cam_2);
                pics.add(R.drawable.favela_cam_3);
                pics.add(R.drawable.favela_cam_4);
                pics.add(R.drawable.favela_cam_5);
                pics.add(R.drawable.favela_cam_6);
                pics.add(R.drawable.favela_cam_7);
                break;

            case 11:
                pics.add(R.drawable.border_cam_1);
                pics.add(R.drawable.border_cam_2);
                pics.add(R.drawable.border_cam_3);
                pics.add(R.drawable.border_cam_4);
                pics.add(R.drawable.border_cam_5);
                pics.add(R.drawable.border_cam_6);
                pics.add(R.drawable.border_cam_7);
                break;

            case 12:
                pics.add(R.drawable.yacht_cam_1);
                pics.add(R.drawable.yacht_cam_2);
                pics.add(R.drawable.yacht_cam_3);
                pics.add(R.drawable.yacht_cam_4);
                pics.add(R.drawable.yacht_cam_5);
                pics.add(R.drawable.yacht_cam_6);
                pics.add(R.drawable.yacht_cam_7);
                pics.add(R.drawable.yacht_cam_8);
                break;

            case 13:
                pics.add(R.drawable.skyscraper_cam_1);
                pics.add(R.drawable.skyscraper_cam_2);
                pics.add(R.drawable.skyscraper_cam_3);
                pics.add(R.drawable.skyscraper_cam_4);
                pics.add(R.drawable.skyscraper_cam_5);
                pics.add(R.drawable.skyscraper_cam_6);
                pics.add(R.drawable.skyscraper_cam_7);
                break;

        }
        return pics;
    }

    ArrayList<Integer> SwitchPos()
    {
        switch (pos)
        {
            case 0:
                poscam.add(R.string.bank_cam_s1);
                poscam.add(R.string.bank_cam_s2);
                poscam.add(R.string.bank_cam_s3);
                poscam.add(R.string.bank_cam_s4);
                poscam.add(R.string.bank_cam_s5);
                poscam.add(R.string.bank_cam_s6);
                poscam.add(R.string.bank_cam_s7);
                break;

            case 1:
                poscam.add(R.string.chalet_cam_s1);
                poscam.add(R.string.chalet_cam_s2);
                poscam.add(R.string.chalet_cam_s3);
                poscam.add(R.string.chalet_cam_s4);
                poscam.add(R.string.chalet_cam_s5);
                poscam.add(R.string.chalet_cam_s6);
                break;

            case 2:
                poscam.add(R.string.clubhouse_cam_s1);
                poscam.add(R.string.clubhouse_cam_s2);
                poscam.add(R.string.clubhouse_cam_s3);
                poscam.add(R.string.clubhouse_cam_s4);
                poscam.add(R.string.clubhouse_cam_s5);
                poscam.add(R.string.clubhouse_cam_s6);
                poscam.add(R.string.clubhouse_cam_s7);
                break;

            case 3:
                poscam.add(R.string.consulate_cam_s1);
                poscam.add(R.string.consulate_cam_s2);
                poscam.add(R.string.consulate_cam_s3);
                poscam.add(R.string.consulate_cam_s4);
                poscam.add(R.string.consulate_cam_s5);
                poscam.add(R.string.consulate_cam_s6);
                poscam.add(R.string.consulate_cam_s7);
                poscam.add(R.string.consulate_cam_s8);
                break;

            case 4:
                poscam.add(R.string.hereford_cam_s1);
                poscam.add(R.string.hereford_cam_s2);
                poscam.add(R.string.hereford_cam_s3);
                poscam.add(R.string.hereford_cam_s4);
                poscam.add(R.string.hereford_cam_s5);
                poscam.add(R.string.hereford_cam_s6);
                break;

            case 5:
                poscam.add(R.string.house_cam_s1);
                poscam.add(R.string.house_cam_s2);
                poscam.add(R.string.house_cam_s3);
                poscam.add(R.string.house_cam_s4);
                poscam.add(R.string.house_cam_s5);
                poscam.add(R.string.house_cam_s6);
                break;

            case 6:
                poscam.add(R.string.kafedostoyevsky_cam_s1);
                poscam.add(R.string.kafedostoyevsky_cam_s2);
                poscam.add(R.string.kafedostoyevsky_cam_s3);
                poscam.add(R.string.kafedostoyevsky_cam_s4);
                poscam.add(R.string.kafedostoyevsky_cam_s5);
                poscam.add(R.string.kafedostoyevsky_cam_s6);
                break;

            case 7:
                poscam.add(R.string.kanal_cam_s1);
                poscam.add(R.string.kanal_cam_s2);
                poscam.add(R.string.kanal_cam_s3);
                poscam.add(R.string.kanal_cam_s4);
                poscam.add(R.string.kanal_cam_s5);
                poscam.add(R.string.kanal_cam_s6);
                poscam.add(R.string.kanal_cam_s7);
                break;

            case 8:
                poscam.add(R.string.oregon_cam_s1);
                poscam.add(R.string.oregon_cam_s2);
                poscam.add(R.string.oregon_cam_s3);
                poscam.add(R.string.oregon_cam_s4);
                poscam.add(R.string.oregon_cam_s5);
                poscam.add(R.string.oregon_cam_s6);
                poscam.add(R.string.oregon_cam_s7);
                break;

            case 9:
                poscam.add(R.string.plane_cam_s1);
                poscam.add(R.string.plane_cam_s2);
                poscam.add(R.string.plane_cam_s3);
                poscam.add(R.string.plane_cam_s4);
                poscam.add(R.string.plane_cam_s5);
                break;

            case 10:
                poscam.add(R.string.favela_cam_s1);
                poscam.add(R.string.favela_cam_s2);
                poscam.add(R.string.favela_cam_s3);
                poscam.add(R.string.favela_cam_s4);
                poscam.add(R.string.favela_cam_s5);
                poscam.add(R.string.favela_cam_s6);
                poscam.add(R.string.favela_cam_s7);
                break;

            case 11:
                poscam.add(R.string.border_cam_s1);
                poscam.add(R.string.border_cam_s2);
                poscam.add(R.string.border_cam_s3);
                poscam.add(R.string.border_cam_s4);
                poscam.add(R.string.border_cam_s5);
                poscam.add(R.string.border_cam_s6);
                poscam.add(R.string.border_cam_s7);
                break;

            case 12:
                poscam.add(R.string.yacht_cam_s1);
                poscam.add(R.string.yacht_cam_s2);
                poscam.add(R.string.yacht_cam_s3);
                poscam.add(R.string.yacht_cam_s4);
                poscam.add(R.string.yacht_cam_s5);
                poscam.add(R.string.yacht_cam_s6);
                poscam.add(R.string.yacht_cam_s7);
                poscam.add(R.string.yacht_cam_s8);
                break;

            case 13:
                poscam.add(R.string.skyscraper_cam_s1);
                poscam.add(R.string.skyscraper_cam_s2);
                poscam.add(R.string.skyscraper_cam_s3);
                poscam.add(R.string.skyscraper_cam_s4);
                poscam.add(R.string.skyscraper_cam_s5);
                poscam.add(R.string.skyscraper_cam_s6);
                poscam.add(R.string.skyscraper_cam_s7);
                break;
        }

        return poscam;
    }

    List<Pair<Integer, Integer>> SwitchMapName()
    {
        return Arrays.asList(
                Pair.create(R.string.bank, R.drawable.mapbank),
                Pair.create(R.string.chalet, R.drawable.mapchalet),
                Pair.create(R.string.clubhouse, R.drawable.mapclubhouse),
                Pair.create(R.string.consulate, R.drawable.mapconsulate),
                Pair.create(R.string.hereford, R.drawable.maphereford),
                Pair.create(R.string.house, R.drawable.maphouse),
                Pair.create(R.string.kafedostoyevsky, R.drawable.mapkafedostoyevsky),
                Pair.create(R.string.kanal, R.drawable.mapkanal),
                Pair.create(R.string.oregon, R.drawable.maporegon),
                Pair.create(R.string.plane, R.drawable.mapplane),
                Pair.create(R.string.favela, R.drawable.mapfavela),
                Pair.create(R.string.border, R.drawable.mapborder),
                Pair.create(R.string.yacht, R.drawable.mapyacht),
                Pair.create(R.string.skyscraper, R.drawable.mapskyscraper));
    }

}
