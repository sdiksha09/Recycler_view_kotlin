package com.example.shipra.recyclerview_inkotlin

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.list_item.view.*

class MainActivity : AppCompatActivity() {

lateinit var country_list:RecyclerView

    // Step:1  creating a array list
    var countries:MutableList<String> = ArrayList()


        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadData()                           //load the data

        country_list = findViewById(R.id.country_list) as RecyclerView

        country_list.layoutManager=LinearLayoutManager(this)            // this means the item will be one below other
        country_list.adapter=countryAdapter(countries,this)

    }

    // step:3  Creating An Adapter class

    class countryAdapter(item:List<String>,ctx:Context):RecyclerView.Adapter<countryAdapter.ViewHolder>()//   creating a constructor inside the Adapter class as parameter
    {

        var List=item
        var context=ctx

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            //set the view holder
            return  ViewHolder(LayoutInflater.from(context).inflate(R.layout.list_item,parent,false))


        }

        override fun getItemCount(): Int {

            // this has to return ItemCount

            return  List.size
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
           // to bind this view need to set the text

            holder?.name?.text=List.get(position)                    //puting a ?mark after holder and name to check it is null or not


        }
        //Creating a view Holder inside this class

        //step: 4 creating a constructon with view as a parameter and extand the parent class RecyclerView
        class ViewHolder(v:View) :RecyclerView.ViewHolder(v){

            val name= v.country_name              //inside this creating a variable




        }
    }

    //Step:2  now creating a function to set the values in Array list
    fun loadData(){

        countries.add("India")
        countries.add("USA")
        countries.add("Pakistan")
        countries.add("china")
        countries.add("Malasiya")
        countries.add("France")
        countries.add("Sri Lanka")
        countries.add("Sweden")
        countries.add("Spain")
        countries.add("FinLand")
        countries.add("Kosovo")
        countries.add("IceLand")
        countries.add("Afganistan")
        countries.add("Iraq")
        countries.add("Brazil")
        countries.add("Turkey")
        countries.add("australia")
        countries.add("Indonesia")
        countries.add("italy")
        countries.add("Swaziland")
        countries.add("mexico")
        countries.add("Romania")
        countries.add("Greece")
        countries.add("Denmark")

    }
}
