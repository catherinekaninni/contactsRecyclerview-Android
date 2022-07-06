package dev.kanini.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.kanini.mycontacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayContacts()
    }
    fun displayContacts(){
        var contact=Contact(" kanini"," 0794745374"," ","kanini@gmail.com "," ")
        var contact1=Contact("shaina "," 074049656","shaina@gmail.com" ,"machakos" ," ")
        var contact2=Contact("Mailu ", "0734834834","mailu@gmail.com","nairobi "," ")
        var contact3=Contact("Timo ", "0734834834","timo@gmail.com"," karen"," ")
var contactList= listOf(contact,contact1,contact2,contact3)
        var contactAdapter=ContactsRvAdapter(contactList)
        binding.rvContacts.layoutManager=LinearLayoutManager(this)
        binding.rvContacts.adapter=contactAdapter
    }
}