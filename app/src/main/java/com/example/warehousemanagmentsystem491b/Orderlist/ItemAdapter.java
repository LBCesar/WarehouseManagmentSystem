package com.example.warehousemanagmentsystem491b.Orderlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.example.warehousemanagmentsystem491b.R;

import java.util.List;

/**
 * The adapter class for the item RecyclerView, contains the item
 */
public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    private List<String> data;

    public ItemAdapter(List<String> d) {
        this.data = d;
    }


    @Override
    public ItemAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        // Inflate the item layout
        View rowItem = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.list_item, parent, false);
        return new ViewHolder(rowItem);
    }

    // Populating data into the item through holder
    @Override
    public void onBindViewHolder(ItemAdapter.ViewHolder holder, int position) {
        holder.itemName.setText(this.data.get(position));
    }

    // Returns the total count of items in the list
    @Override
    public int getItemCount() {
        return this.data.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView itemName;

        public ViewHolder(View itemView) {
            super(itemView);

            itemView.setOnClickListener(this);
            itemName = (TextView) itemView.findViewById(R.id.item_name);
        }

        @Override
        public void onClick(View view) {
            Toast.makeText(view.getContext(), "position : " + getLayoutPosition() + " text : " + this.itemName.getText(), Toast.LENGTH_SHORT).show();
        }
    }

}
