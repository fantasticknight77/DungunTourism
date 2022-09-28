package com.example.dunguntourism;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

public class TouristAttractionFragment extends Fragment {

    RecyclerView recyclerView;
    TouristAttractionAdapter ta_Adapter;

    ArrayList<TouristAttraction> touristAttractionArrayList;

    public TouristAttractionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_tourist_attraction, container, false);
        recyclerView = v.findViewById(R.id.touristAttraction);
        touristAttractionArrayList = getArrayList();

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        ta_Adapter = new TouristAttractionAdapter(getActivity(),touristAttractionArrayList);
        recyclerView.setAdapter(ta_Adapter);
        return v;


    }

    public ArrayList<TouristAttraction> getArrayList()
    {
        ArrayList<TouristAttraction> arrayList = new ArrayList<>();

        arrayList.add(new TouristAttraction(
                "Pulau Tenggol",
                "It is an island off the coast of Terengganu" +
                        "attractive enough to visit and have one beautiful beach is the part that facing the mainland.\n" +
                        "\n" +
                        "Tenggol Island is the southernmost island in Terengganu, located on the shores of Dungun. " +
                        "This island is an island that is the focus of scuba diving activities because it is rich in preserved marine animals. " +
                        "‘Whale shark discovery’ in Pulau Tenggol are also popular.",
                "https://www.google.com.my/maps/place/Pulau+Tenggol/@4.8056818,103.6727282,15z/data=!3m1!4b1!4m5!3m4!1s0x31c7fbad5ed5eb61:0xb383caaa473e7cb3!8m2!3d4.803334!4d103.6796909",
                "https://www.google.com/search?q=pulau+tenggol&sxsrf=ALeKk013pvIrf_WGwOyzMRdlLrKhCBPdfw:1611711681612&source=lnms&tbm=isch&sa=X&ved=2ahUKEwjm3Yzy_bruAhVSmuYKHYYcBHwQ_AUoAXoECA8QAw&biw=1920&bih=969",
                R.drawable.pulau_tenggol));

        arrayList.add(new TouristAttraction(
                "Tasik Puteri Bukit Besi",
                "Tasik Puteri or formerly known as Tasik Bukit Besi is a lake in Dungun. " +
                        "It is a remnant of iron ore mines which quite historic. " +
                        "The mine is one of the largest iron ore mines in South East Asia. " +
                        "This lake is an artificially lake formed from the Besul River blocked and produce water reservoirs.",
                "https://www.google.com.my/maps/place/TASIK+PUTERI/@4.7334938,103.1877075,17z/data=!3m1!4b1!4m5!3m4!1s0x31c8173fe81f571b:0xd67e9f333b95d17c!8m2!3d4.7334885!4d103.1898962",
                "https://www.google.com/search?q=Tasik+Puteri+Bukit+Besi&tbm=isch&ved=2ahUKEwjglfby_bruAhVl_TgGHXXCDO0Q2-cCegQIABAA&oq=Tasik+Puteri+Bukit+Besi&gs_lcp=CgNpbWcQDDICCAAyAggAMgYIABAFEB4yBAgAEBgyBAgAEBgyBAgAEBhQtfYLWLX2C2C4_QtoAHAAeACAAYQBiAGEAZIBAzAuMZgBAKABAaoBC2d3cy13aXotaW1nwAEB&sclient=img&ei=w8QQYKCoFOX64-EP9YSz6A4&bih=969&biw=1920",
                R.drawable.tasik_puteri_bukit_besi));

        arrayList.add(new TouristAttraction(
                "Masjid An Naim (Masjid Biru)",
                "An Naim Sura Jetty Mosque was built on a former site Surau Sura Jeti Dungun. " +
                        "This mosque can accommodate 1500 pilgrims at a time.",
                "https://www.google.com.my/maps/place/Masjid+An+Naim/@4.7546291,103.4182827,17z/data=!3m1!4b1!4m5!3m4!1s0x31c80f6470658a5f:0x9aa9d97cba5b39bf!8m2!3d4.7546238!4d103.4204714",
                "https://www.google.com/search?q=Masjid+An+Naim+(Masjid+Biru)&tbm=isch&ved=2ahUKEwj_xYPR_rruAhVv4jgGHRe8DcUQ2-cCegQIABAA&oq=Masjid+An+Naim+(Masjid+Biru)&gs_lcp=CgNpbWcQDFDv0QFY79EBYIXXAWgAcAB4AIABUYgBUZIBATGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=iMUQYP_hKe_E4-EPl_i2qAw&bih=969&biw=1920",
                R.drawable.masjid_an_naim));

        arrayList.add(new TouristAttraction(
                "Pusat Konservasi & Penerangan Penyu",
                "This turtle information and management center works as an information center on programs turtle research, hatchery and management. " +
                        "It is a landing place for turtles to lay their eggs. " +
                        "There are various species of turtles at the Conservation Center. " +
                        "The visitors have the opportunity to feel the release of the baby turtle into the sea.",
                "https://www.google.com.my/maps/place/Pusat+Konservasi+dan+Penerangan+Penyu/@4.8698131,103.3882144,17z/data=!3m1!4b1!4m5!3m4!1s0x31c80373022fdfc3:0x1b1c7c9e98e3934c!8m2!3d4.8698078!4d103.3904031",
                "https://www.google.com/search?q=Pusat+Konservasi+%26+Penerangan+Penyu+Dungun&tbm=isch&ved=2ahUKEwjRndfe_rruAhVH8jgGHd_vBaoQ2-cCegQIABAA&oq=Pusat+Konservasi+%26+Penerangan+Penyu+Dungun&gs_lcp=CgNpbWcQAzoGCAAQCBAeOgQIABAYUMaqAViR2QFgkdsBaAxwAHgAgAFTiAGDBZIBATiYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=pcUQYJG3E8fk4-EP39-X0Ao&bih=969&biw=1920",
                R.drawable.penerangan_penyu));

        arrayList.add(new TouristAttraction(
                "Bukit Tebuk",
                "Bukit Tebuk is located in Kampung Nibong, Dungun. " +
                        "It is Malaya's first hill that drilled as a route for train carrying iron ore from Bukit Besi through the traditional village to Sura Port for exporting iron ore abroad.\n" +
                        "\n" +
                        "After the mining sector closed in 1971, the railway was later replaced by a highway to enable locals use it as an alternative route.",
                "https://www.google.com.my/maps/place/Bukit+Tebuk/@4.7731098,103.3948844,17z/data=!3m1!4b1!4m5!3m4!1s0x31c8050a05181ac7:0x4feaaeabd31fc72a!8m2!3d4.7731045!4d103.3970731",
                "https://www.google.com/search?q=Bukit+Tebuk&tbm=isch&ved=2ahUKEwjB1rj0_rruAhX_7jgGHS8OC34Q2-cCegQIABAA&oq=Bukit+Tebuk&gs_lcp=CgNpbWcQDDICCAAyAggAMgYIABAFEB4yBggAEAUQHjIGCAAQBRAeUM7wAVjO8AFg2fYBaABwAHgAgAFUiAFUkgEBMZgBAKABAaoBC2d3cy13aXotaW1nwAEB&sclient=img&ei=0sUQYMGlOv_d4-EPr5ys8Ac&bih=969&biw=1920",
                R.drawable.bukit_tebuk));

        arrayList.add(new TouristAttraction(
                "Bukit Besi",
                "Bukit Besi is a small town in the District Dungun, Terengganu. " +
                        "It got its name from iron ore mining activities there. " +
                        "Beach Teluk Lipat is a focal point for relax and unwind with the family. " +
                        "At the beach, visitors can see the effect relics of iron ore mining, such as Chimneys and Opal Pillars which are railway bridge poles for transporting iron ore to ships.",
                "https://www.google.com.my/maps/place/Bukit+Besi,+Terengganu/@4.7895948,103.0032158,11z/data=!3m1!4b1!4m5!3m4!1s0x31c817ef2abaf253:0x9d0fccdb47e44ce3!8m2!3d4.750015!4d103.1967439",
                "https://www.google.com/search?q=bukit+besi+dungun&tbm=isch&ved=2ahUKEwi5-eOT_7ruAhWbgGMGHVgjCbsQ2-cCegQIABAA&oq=Bukit+Besi+&gs_lcp=CgNpbWcQARgAMgQIABBDMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAUMk4WMk4YJg_aABwAHgAgAFViAFVkgEBMZgBAKABAaoBC2d3cy13aXotaW1nwAEB&sclient=img&ei=FMYQYLmfKZuBjuMP2Mak2As&bih=969&biw=1920",
                R.drawable.bukit_besi));

        arrayList.add(new TouristAttraction(
                "Muzium Dungun",
                "This Dungun District Museum building was built in 1941 in a building that was once the residence of the British Adviser at Dungun once upon a time. " +
                        "The interesting items display at the Dungun District Museum are artifacts taken from the wreck of the Wanli ship that had been found off the Coast Tanjung Jara in 1997.",
                "https://www.google.com.my/maps/place/Muzium+Dungun/@4.7678103,103.4186023,17z/data=!3m1!4b1!4m5!3m4!1s0x31c8058e8b45e7d5:0x120b56ddc281561f!8m2!3d4.767805!4d103.420791",
                "https://www.google.com/search?q=Muzium+Dungun&tbm=isch&ved=2ahUKEwjwoZSY_7ruAhWtgGMGHZSxCDAQ2-cCegQIABAA&oq=Muzium+Dungun&gs_lcp=CgNpbWcQDDIECCMQJ1CZkQFYmZEBYNCWAWgAcAB4AIABUYgBUZIBATGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=HcYQYLCfNK2BjuMPlOOigAM&bih=969&biw=1920",
                R.drawable.muzium_dungun));

        return arrayList;
    }
}