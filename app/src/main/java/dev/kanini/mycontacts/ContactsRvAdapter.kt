package dev.kanini.mycontacts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import dev.kanini.mycontacts.databinding.ContactListItemsBinding

class ContactsRvAdapter (var contactList: List<Contact>):
        RecyclerView.Adapter<ContactsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        var binding=ContactListItemsBinding.inflate(LayoutInflater.from(parent.context),parent,false)
              return ContactsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        var currentContact = contactList.get(position)
        val contactBinding=holder.binding
        contactBinding.tvname.text=currentContact.name
        contactBinding.tvemail.text=currentContact.email
        contactBinding.tvphonenumber.text=currentContact.phone
        contactBinding.tvadress.text=currentContact.address

        Picasso.get()
            .load(currentContact.image)
            .resize(350,350)
            .centerCrop()
            .placeholder(R.drawable.ic_baseline_person_24)
            .into(contactBinding.imgContact)
    }

    override fun getItemCount(): Int {
        return contactList.size

    }

}

class  ContactsViewHolder(var binding:ContactListItemsBinding):RecyclerView.ViewHolder(binding.root){

}
