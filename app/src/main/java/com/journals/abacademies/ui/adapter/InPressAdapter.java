package com.journals.abacademies.ui.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;


import com.journals.abacademies.R;
import com.journals.abacademies.databinding.InpressItemBinding;
import com.journals.abacademies.model.InPressResponse;

import java.util.List;

import static android.content.Intent.ACTION_VIEW;
import static android.content.Intent.CATEGORY_BROWSABLE;
import static android.content.Intent.FLAG_ACTIVITY_NEW_TASK;
import static android.content.Intent.FLAG_ACTIVITY_REQUIRE_NON_BROWSER;
import static com.journals.abacademies.helper.utils.viewInBrowser;


public class InPressAdapter extends RecyclerView.Adapter<InPressAdapter.ViewHolder> {

    List<InPressResponse.InpressDetailsBean.ArticlesBean> modelList;
    private static final String TAG = "InPressAdapter";
    Context context;
    public InPressAdapter(List<InPressResponse.InpressDetailsBean.ArticlesBean> modelList,Context context) {
        this.modelList = modelList;
        this.context = context;
    }

    @NonNull
    @Override
    public InPressAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(InpressItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull InPressAdapter.ViewHolder holder, int position) {

        holder.rowItemBinding.txtIssueType.setText(modelList.get(position).getArtType());
        holder.rowItemBinding.txtIssueTitle.setText(modelList.get(position).getTitle());
        holder.rowItemBinding.txtIssueAuthor.setText(Html.fromHtml(modelList.get(position).getAuthorNames()));
        holder.rowItemBinding.txtIssueDOI.setText("DOI : " + modelList.get(position).getDoiNum());

        if (modelList.get(position).getAbstractlink() != null && !modelList.get(position).getAbstractlink().equalsIgnoreCase("null") && !modelList.get(position).getAbstractlink().isEmpty() ) {
            holder.rowItemBinding.txtAbstract.setVisibility(View.VISIBLE);
        } else {
            holder.rowItemBinding.txtAbstract.setVisibility(View.GONE);
        }

        if (modelList.get(position).getPdflink() != null && !modelList.get(position).getPdflink().equalsIgnoreCase("null") && !modelList.get(position).getPdflink().isEmpty() ) {
            holder.rowItemBinding.txtPDF.setVisibility(View.VISIBLE);
        } else {
            holder.rowItemBinding.txtPDF.setVisibility(View.GONE);
        }
        if (modelList.get(position).getFulltextlink() != null && !modelList.get(position).getFulltextlink().equalsIgnoreCase("null") && !modelList.get(position).getFulltextlink().isEmpty() ) {
            holder.rowItemBinding.txtFullText.setVisibility(View.VISIBLE);
        } else {
            holder.rowItemBinding.txtFullText.setVisibility(View.GONE);
        }

        holder.rowItemBinding.txtAbstract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("abstractlink", modelList.get(position).getAbstractlink());
                bundle.putString("ActionBarTitle","Abstract");


                Navigation.findNavController(v).navigate(R.id.abstractDisplayFragment,bundle);
            }
        });
        holder.rowItemBinding.txtPDF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                viewInBrowser(context,modelList.get(position).getPdflink(),"Not Found");
            }
        });

        holder.rowItemBinding.txtFullText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                viewInBrowser(context,"https://www.abacademies.org/articles/"+modelList.get(position).getFulltextlink(),"Not Found");
            }
        });

    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        InpressItemBinding rowItemBinding;

        public ViewHolder(@NonNull InpressItemBinding rowItemBinding) {
            super(rowItemBinding.getRoot());
            this.rowItemBinding = rowItemBinding;
        }
    }
}