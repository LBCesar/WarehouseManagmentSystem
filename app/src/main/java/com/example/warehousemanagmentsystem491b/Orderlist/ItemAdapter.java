package com.example.warehousemanagmentsystem491b.Orderlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.example.warehousemanagmentsystem491b.Item;
import com.example.warehousemanagmentsystem491b.R;

import java.util.List;

/**
 * The adapter class for the item RecyclerView, contains the item
 */
public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    private final List<Item> items;

    public ItemAdapter(List<Item> itemList) {
        this.items = itemList;
    }


    @Override
    public ItemAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Inflate the item layout
        View view = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    // To delete item this is what to update :p
    // http://www.techsolpoint.com/how-to-add-remove-and-update-items-in-android-recyclerview-android-studio.html
    //
    // Populating data into the item through holder
    @Override
    public void onBindViewHolder(ItemAdapter.ViewHolder holder, int position) {
        Item item = items.get(position);
//        if (item.getName() != null) {
        holder.itemName.setText(item.getName());
        holder.itemQuantity.setText(String.valueOf(item.getQuantity()));
        holder.itemPrice.setText("$ " + item.getPrice());
//        }
    }

    // Returns the total count of items in the list
    @Override
    public int getItemCount() {
        return this.items.size();
    }


    public void deleteItem(int position) {
        Item mRecentlyDeletedItem = items.get(position);
        int mRecentlyDeletedItemPosition = position;
        items.remove(position);
        notifyItemRemoved(position);
    }


    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView itemName;
        public TextView itemQuantity;
        public TextView itemPrice;

        public ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            itemName = itemView.findViewById(R.id.item_name);
            itemQuantity = itemView.findViewById(R.id.item_quantity);
            itemPrice = itemView.findViewById(R.id.item_price);
        }

        @Override
        public void onClick(View view) {
//            Toast.makeText(view.getContext(), "position : " + getLayoutPosition() + " text : " + this.itemName.getText(), Toast.LENGTH_SHORT).show();
            Toast.makeText(view.getContext(), "Item: " + this.itemName.getText(), Toast.LENGTH_SHORT).show();
        }
    }

}
