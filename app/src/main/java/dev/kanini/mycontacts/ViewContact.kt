package dev.kanini.mycontacts

import android.location.Address
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Toast
import com.squareup.picasso.Picasso
import dev.kanini.mycontacts.databinding.ActivityViewContactBinding

class ViewContact : AppCompatActivity() {
    lateinit var binding: ActivityViewContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getExtras()
    }
    fun getExtras(){
        val extras = intent.extras
        var name = extras?.getString("Name")
        var phone = extras?.getString("PHONE")
        var email= extras?.getString("EMAIL")
        var address= extras?.getString("ADDRESS")
        var image = binding.imgPerson

        Toast.makeText(this,name,Toast.LENGTH_LONG).show()
        Toast.makeText(this,phone,Toast.LENGTH_LONG).show()
        binding.tvnames.text=name
        binding.tvAdress.text=address
        binding.tvEmail.text=email
        Picasso.get().load(intent.getStringExtra("IMAGE")).into(image)

    }
}