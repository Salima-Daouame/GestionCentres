package com.example.gestioncentres;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ModelRecycleView extends RecyclerView.Adapter<ModelRecycleView.ViewHolder> {
    Context  context;

       ArrayList<centre_profil> arrayList = new ArrayList<>();

       public ModelRecycleView(Context context,ArrayList<centre_profil> arrayList){
           this.context=context;
           this.arrayList=arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
           View view = LayoutInflater.from(context).inflate(R.layout.item_centre,parent,false);
           ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder,int position) {
             holder.imageView.setImageResource(arrayList.get(position).getImage());
             holder.textview1.setText(arrayList.get(position).getNom());
             holder.textview2.setText(arrayList.get(position).getDesc());
             holder.textview3.setText(arrayList.get(position).getLoc());

             holder.cardview.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View view) {
                     Toast.makeText(context,"Centre" +position,Toast.LENGTH_LONG).show();
                     Intent intent = new Intent(context,Detail.class);
                     intent.putExtra("flag",arrayList.get(position).getImage());
                     intent.putExtra("name",arrayList.get(position).getNom());
                     intent.putExtra("desc",arrayList.get(position).getDesc());
                     intent.putExtra("loc",arrayList.get(position).getLoc());
                     context.startActivity(intent);
                 }
             });

    }

    @Override
    public int getItemCount() {

           return arrayList.size();
    }

    public class ViewHolder extends  RecyclerView.ViewHolder{
              ImageView imageView;
              TextView textview1,textview2,textview3;
              CardView cardview;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imageCentre);
            textview1=itemView.findViewById(R.id.nameCentre);
            textview2= itemView.findViewById(R.id.tele);
            textview3= itemView.findViewById(R.id.loc);
            cardview=itemView.findViewById(R.id.cardRecommended1);
        }
    }
}
