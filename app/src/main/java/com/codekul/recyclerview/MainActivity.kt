package com.codekul.recyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val _recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        _recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        val items = ArrayList<MyDataClass>()

        items.add(MyDataClass(R.drawable.ic_alarm_clock,"AlarmClock","wednesday"))
        items.add(MyDataClass(R.drawable.ic_gmail,"Gmail","bhorpooja22@gmail.com"))
        items.add(MyDataClass(R.drawable.ic_facebook,"Facebook","bhorpooja895@gmail.com"))
        items.add(MyDataClass(R.drawable.ic_gallery_,"Gallery","It's My Gallery"))
        items.add(MyDataClass(R.drawable.ic_music_player,"MusicPlayer","Play Music Here"))
        items.add(MyDataClass(R.drawable.ic_playstore,"PlayStore","Get App from Here"))
        items.add(MyDataClass(R.drawable.ic_settings,"Setting","Your Phone Setting"))
        items.add(MyDataClass(R.drawable.ic_whatsapp,"WhatsApp","Hey WhatsApp"))
        items.add(MyDataClass(R.drawable.ic_youtube,"YouTube","Me YouTube"))
                        
          val adapter = MyAdapter(items)

                //now adding the adapter to recyclerview
                _recyclerView.adapter = adapter
    }
}
