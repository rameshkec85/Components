package com.andhradroid.android.common.components.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ramesh on 14/1/16.
 */
public abstract class AbstractBaseAdapter<T, ViewHolder extends AbstractViewHolder> extends BaseAdapter {

    private List<T> mList;
    protected final Context mContext;


    public AbstractBaseAdapter(Context context) {
        mContext = context;
        mList = new ArrayList<>();
    }


    public void addItems(List<T> list) {
        mList = new ArrayList<>(list);
        notifyDataSetChanged();
    }

    public void addItemsAll(List<T> list) {
        this.mList.addAll(list);
        notifyDataSetChanged();
    }

    public List<T> getAllItems() {
        return mList;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public T getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(getLayoutId(), null);
            holder = getViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        bindView(position, holder, getItem(position));
        return convertView;
    }

    public abstract int getLayoutId();

    public abstract ViewHolder getViewHolder(View convertView);

    public abstract void bindView(int position, ViewHolder holder, T item);

}
