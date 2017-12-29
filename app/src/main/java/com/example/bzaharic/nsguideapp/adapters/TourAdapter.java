package com.example.bzaharic.nsguideapp.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bzaharic.nsguideapp.R;
import com.example.bzaharic.nsguideapp.model.Tour;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bzaharic on 22.12.17..
 */

public class TourAdapter extends RecyclerView.Adapter<TourAdapter.TourViewHolder> {
    private Context mCtx;
    private List<Tour> tourList;
    private ItemClicked itemClicked;

    public TourAdapter(Context mCtx, List<Tour> tourList, ItemClicked itemClicked) {
        this.mCtx = mCtx;
        this.tourList = tourList;
        this.itemClicked = itemClicked;
    }

    @Override
    public TourViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.list_layout_tour, null);
        return new TourViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TourViewHolder holder, int position) {
        Tour tour = tourList.get(position);

        holder.textViewTitle.setText(tour.getTitleOfTour());
        holder.textViewDesc.setText(tour.getShortDesc());
        holder.textViewSizeOfTour.setText(String.valueOf(tour.getSizeOfTour()));
        holder.textViewDuration.setText(String.valueOf(tour.getDuration()));
        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(tour.getImage()));

    }

    @Override
    public int getItemCount() {
        return tourList.size();
    }

    class TourViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textViewTitle, textViewDesc, textViewSizeOfTour, textViewDuration;

        public TourViewHolder(final View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewDesc = itemView.findViewById(R.id.textViewDesc);
            textViewSizeOfTour = itemView.findViewById(R.id.textViewDist);
            textViewDuration = itemView.findViewById(R.id.textViewDuration);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    itemClicked.itemClicked();
                }
            });

        }
    }

    public interface ItemClicked {
        void itemClicked();
    }
}


