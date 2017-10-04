package com.example.yubaraj.lms.librarian;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.yubaraj.lms.Model.Book_item;
import com.example.yubaraj.lms.R;

import java.util.List;

/**
 * Created by yubar on 9/25/2017.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private List<Book_item> bookLists;
    private Context context;

    public RecyclerViewAdapter(List<Book_item> bookLists, Context context) {
        this.bookLists = bookLists;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_recycler_view, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Book_item book_item = bookLists.get(position);
        holder.name.setText(book_item.getName());
        holder.extra.setText(book_item.getCode1());
    }

    @Override
    public int getItemCount() {
        return bookLists.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView name, extra;

        public ViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.recy_name);
            extra = (TextView) itemView.findViewById(R.id.recy_extra);

        }
    }
}
