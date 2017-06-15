package fr.formation.tp12;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import fr.formation.tp12.database.modele.User;

/**
 * Created by admin on 15/06/2017.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private List<User> utilisateurs;
    private int itemLayout;

    public RecyclerViewAdapter(List<User> items, int layout) {
        this.utilisateurs = items;
        this.itemLayout = layout;
    }

    public int getItemCount() {
        return utilisateurs.size();
    }

    public void onBindViewHolder(RecyclerViewAdapter.ViewHolder holder, int position) {
        ((ViewHolder) holder).mContentView.setText(utilisateurs.get(position).getNom());
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(itemLayout, parent, false);
        return new ViewHolder(view);

    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        // TextViex
        public final View mView;
        public final TextView mContentView;

        public ViewHolder(View View) {
            super(View);
            mView=View;
            // link primaryText
            mContentView = (TextView) itemView.findViewById(android.R.id.text1);
        }
    }


}