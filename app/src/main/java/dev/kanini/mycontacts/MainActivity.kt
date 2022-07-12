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
        var contact=Contact(" kanini"," 0794745374"," ","kanini@gmail.com ","https://images.unsplash.com/photo-1589156280159-27698a70f29e?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8YmxhY2slMjBwZW9wbGV8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60")
        var contact1=Contact("shaina "," 074049656","shaina@gmail.com" ,"machakos" ,"https://images.unsplash.com/photo-1523450001312-faa4e2e37f0f?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTZ8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var contact2=Contact("Mailu ", "0734834834","mailu@gmail.com","nairobi ","https://images.unsplash.com/photo-1531384441138-2736e62e0919?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTN8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var contact3=Contact("Timo ", "0734834834","timo@gmail.com"," karen","https://images.unsplash.com/photo-1545291730-faff8ca1d4b0?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8N3x8YmxhY2slMjBsYWRpZXN8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60 ")
        var contact4=Contact("Timo ", "0734834834","timo@gmail.com"," karen","https://images.unsplash.com/photo-1527628217451-b2414a1ee733?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTB8fGJsYWNrJTIwbGFkaWVzfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60 ")
        var contact5=Contact(" kanini"," 0794745374"," ","kanini@gmail.com ","https://images.unsplash.com/photo-1638158894759-47edf16f80a5?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8YmxhY2slMjBsYWRpZXN8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60")
var contactList= listOf(contact,contact1,contact2,contact3,contact4,contact5)
        var contactAdapter=ContactsRvAdapter(contactList)
        binding.rvContacts.layoutManager=LinearLayoutManager(this)
        binding.rvContacts.adapter=contactAdapter
    }
}