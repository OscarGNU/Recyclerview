package com.devspace.recyclerview

import android.content.Intent
import android.os.Bundle
import android.provider.Telephony.Mms.Intents
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val rvList = findViewById<RecyclerView>(R.id.rv_list)
        val ivList = findViewById<ImageView>(R.id.iv_list)
        val ivGrid = findViewById<ImageView>(R.id.iv_grid)
        val adapter = ContactListAdapter()

        rvList.adapter= adapter
        rvList.layoutManager = LinearLayoutManager(this )
        adapter.submitList(contact)

        ivGrid.setOnClickListener{
            rvList.layoutManager =GridLayoutManager( this, 2)
             }
        ivList.setOnClickListener{
            rvList.layoutManager = LinearLayoutManager ( this)
    }
        adapter.setOnClickListener { 
            contact ->

            val intent = Intent(this, ContactDetailActivity::class.java)
            intent.putExtra("name", contact.name)
            intent.putExtra("phone", contact.phone)
            intent.putExtra("icon", contact.icon)
            startActivity(intent)
        }
    }
}

val  contact = listOf(
    Contact(
        name =   "Oscar",
        phone =  "(+351) 934084537",
        icon = R.drawable.sample1
    ),

    Contact(
        name = "Pedro",
        phone = "(+351)934084538",
        icon = R.drawable.sample2
    ),

    Contact(
        name = "Julio",
        phone = "(+351) 934084539",
        icon =  R.drawable.sample3
    ),

    Contact(
        name = "Jose",
        phone = "(+351) 934084540",
        icon =  R.drawable.sample4
    ),

    Contact(
        name = "João",
        phone = "(+351) 934084541",
        icon = R.drawable.sample5
    ),

    Contact(
        name = "Fernando",
        phone = "(+351) 934084542",
        icon = R.drawable.sample6
    ),

    Contact(
        name = "Jorge",
        phone = "(+351) 934084543",
        icon = R.drawable.sample7
    ),

    Contact(
        name = "Rui",
        phone = "(+351) 934084544",
        icon = R.drawable.sample8
    ),

    Contact(
        name = "Miguel",
        phone = "(+351) 934084545",
        icon = R.drawable.sample9
    ),

    Contact(
        name = "Pedro",
        phone = "(+351)934084538",
        icon = R.drawable.sample10
    ),

    Contact(
        name = "Julio",
        phone = "(+351) 934084539",
        icon =  R.drawable.sample11
    ),

    Contact(
        name = "Jose",
        phone = "(+351) 934084540",
        icon =  R.drawable.sample12
    ),

    Contact(
        name = "João",
        phone = "(+351) 934084541",
        icon = R.drawable.sample13
    ),

    Contact(
        name = "Fernando",
        phone = "(+351) 934084542",
        icon = R.drawable.sample14
    ),

    Contact(
        name = "Jorge",
        phone = "(+351) 934084543",
        icon = R.drawable.sample15
    ),

    Contact(
        name = "Rui",
        phone = "(+351) 934084544",
        icon = R.drawable.sample16
    )

)