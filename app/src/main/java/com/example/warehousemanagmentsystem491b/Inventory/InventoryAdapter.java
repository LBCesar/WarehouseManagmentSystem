package com.example.warehousemanagmentsystem491b.Inventory;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.warehousemanagmentsystem491b.Item;
import com.example.warehousemanagmentsystem491b.R;

import java.util.List;

public class InventoryAdapter extends RecyclerView.Adapter<InventoryAdapter.ViewHolder> {

    private List<Item> items;

    public InventoryAdapter(List<Item> items) {
        this.items = items;
    }

    @Override
    public InventoryAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_manage_inventory, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull InventoryAdapter.ViewHolder holder, int position) {
        Item item = items.get(position);
        holder.itemName.setText(item.getName());
        holder.itemQuantity.setText(String.valueOf(item.getQuantity()));
        holder.itemPrice.setText("$ " + item.getPrice());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView itemName;
        private TextView itemQuantity;
        private TextView itemPrice;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            itemName = itemView.findViewById(R.id.manageInventory_itemName);
            itemQuantity = itemView.findViewById(R.id.manageInventory_itemQuantity);
            itemPrice = itemView.findViewById(R.id.manageInventory_itemPrice);
        }

        @Override
        public void onClick(View view) {
            Toast.makeText(view.getContext(), "Item: " + this.itemName.getText(), Toast.LENGTH_SHORT).show();
        }
    }

}
