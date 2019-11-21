package com.example.esoftwarica.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.esoftwarica.R;
import com.example.esoftwarica.fragments.homeFragment;
import com.example.esoftwarica.model.modelStudent;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.StudentViewHolder> {

    private Context mContext;

    private List<modelStudent> studentsList;



    public MainAdapter(Context mContext, List<modelStudent> studentsList){
        this.mContext = mContext;
        this.studentsList = studentsList;
    }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.student_card_view,parent,false);
        return new StudentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainAdapter.StudentViewHolder holder, int i) {
        modelStudent students = studentsList.get(i);
        holder.name.setText(students.getName());
        holder.age.setText(students.getAge()+"");
        holder.gender.setText(students.getGender());
        holder.address.setText(students.getAddress());
        holder.image.setImageResource(students.getImageId());
    }

    @Override
    public int getItemCount() {
        return studentsList.size();
    }



    public class StudentViewHolder extends RecyclerView.ViewHolder {
        TextView name, age, address,gender;
        Button btnDelete;
        CircleImageView image;

        public StudentViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.fullName);
            age = itemView.findViewById(R.id.age);
            address = itemView.findViewById(R.id.address);
            gender = itemView.findViewById(R.id.gender);
            image = itemView.findViewById(R.id.imgProfile);
            btnDelete = itemView.findViewById(R.id.btnDelete);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    modelStudent list = studentsList.get(getAdapterPosition());
                    Toast.makeText(mContext, list.getName(), Toast.LENGTH_LONG).show();
                }
            });

            btnDelete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    studentsList.remove(getAdapterPosition());
                    notifyItemRemoved(getAdapterPosition());
                }
            });
        }
    }
}