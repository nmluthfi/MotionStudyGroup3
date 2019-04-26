package com.example.motionstudygroup3;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.ViewHolder> {

    private Context mContext;
    private List<MenuModel> listMenu;

    public MenuAdapter(Context mContext) {
        this.mContext = mContext;
        listMenu = new ArrayList<>();
    }

    public List<MenuModel> getListMenu() {
        return listMenu;
    }

    public void setListMenu(List<MenuModel> listMenu) {
        this.listMenu = listMenu;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list
                , viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        MenuModel menuModel = listMenu.get(position);

        viewHolder.tvNamaMenu.setText(menuModel.getmNamaMenu());
        viewHolder.tvHargaMenu.setText(String.valueOf(menuModel.getmHargaMenu()));
        viewHolder.tvDetailMenu.setText(menuModel.getmDetailMenu());
    }

    @Override
    public int getItemCount() {
        return listMenu.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView ivMenu;
        TextView tvNamaMenu, tvHargaMenu, tvDetailMenu;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivMenu = itemView.findViewById(R.id.iv_menu);
            tvDetailMenu = itemView.findViewById(R.id.tv_detail_menu);
            tvHargaMenu = itemView.findViewById(R.id.tv_harga_menu);
            tvNamaMenu = itemView.findViewById(R.id.tv_nama_menu);
        }
    }
}