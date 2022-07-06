package dev.kanini.mycontacts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView

class ContactsRvAdapter (var contactList: List<Contact>):
        RecyclerView.Adapter<ContactsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.contact_list_items,parent,false)
        return ContactsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        var currentContact = contactList.get(position)
        holder.tvName.text=currentContact.name
        holder.tvemail.text=currentContact.email
        holder.tvPhone.text=currentContact.phone
        holder.tvaddress.text=currentContact.address


    }

    override fun getItemCount(): Int {
        return contactList.size

    }
}

class  ContactsViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var tvName =itemView.findViewById<TextView>(R.id.tvname)
    var tvPhone=itemView.findViewById<TextView>(R.id.tvphonenumber)
    var tvemail=itemView.findViewById<TextView>(R.id.tvemail)
    var tvaddress=itemView.findViewById<TextView>(R.id.tvadress)
    var imgContact =itemView.findViewById<ImageView>(R.id.imgContact)

}
