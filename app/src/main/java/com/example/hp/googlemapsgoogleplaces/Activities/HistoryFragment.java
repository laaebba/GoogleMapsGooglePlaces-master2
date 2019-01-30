package com.example.hp.googlemapsgoogleplaces.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.hp.googlemapsgoogleplaces.ListView;
import com.example.hp.googlemapsgoogleplaces.MyAdapter;
import com.example.hp.googlemapsgoogleplaces.R;

import java.util.ArrayList;
import java.util.List;

public class HistoryFragment extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    private List<ListView> listViews;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_fragment);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listViews = new ArrayList<>();

        //HARDCODE THIS LOOP OKAY!!!!!!!

        //for(int i = 0; i<=10; i++)
        //{
        ListView listView = new ListView(
                "29th Jan'2019, 10:46 PM " ,
                "Saylani Welfare, Block 14, Gulshan-e-Iqbal"
        );
        listViews.add(listView);


        ListView listView1 = new ListView(
                "25th Jan'2019, 10.15 PM " ,
                "AZAD Foundation Pakistan, E135/2D Block 7, Gulshan-e-Iqbal"
        );
        listViews.add(listView1);

        ListView listView2 = new ListView(
                "17th Jan'2019, 11:45 PM " ,
                "Bilquis Home"
        );
        listViews.add(listView2);

        ListView listView3 = new ListView(
                "9th Jan'2019, 12:15 PM " ,
                "Edhi Welfare Centre, 186/3 Mehmoodabad No. 3, Bahadurabad Bahadur Yar Jang CHS"
        );
        listViews.add(listView3);

        ListView listView4 = new ListView(
                "3rd Jan'2019, 11:07 PM " ,
                "Dar-ul-Sukun, 159/H/3, Kashmir Rd, Block 3, PECHS"
        );
        listViews.add(listView4);

        ListView listView5 = new ListView(
                "28th Dec'2018 , 09:26 PM " ,
                "Saylani Welfare Trust, Bahadurabad Bahadur Yar Jang CHS"
        );
        listViews.add(listView5);

        ListView listView6 = new ListView(
                "19th Dec'2018, 07:30 PM " ,
                "Ansar Burney Trust International, 6-Hassan Manzil, Aram Bagh Rd, Aram Bagh"
        );
        listViews.add(listView6);

        ListView listView7 = new ListView(
                "16th Dec'2018, 11:00 PM " ,
                "Darul Sukoon, House#JM-2/243, Catholic Colony#1, M.A Jinnah Road, Catholic Colony"
        );
        listViews.add(listView7);


        ListView listView8 = new ListView(
                "10th Dec'2018, 09:06 PM " ,
                "Chhipa Welfare Association"
        );
        listViews.add(listView8);

        adapter = new MyAdapter(listViews, this);

        recyclerView.setAdapter(adapter);
    }
}