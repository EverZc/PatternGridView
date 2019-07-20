package me.zwj.patterngridview;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

/**
 * @描述: 九宫格适配器
 * @创建时间: 2019-07-17
 * @作者: 张文靖同学
 * @简书: https://www.jianshu.com/u/197319888337
 */

public abstract class NineGridViewDefaultAdapter<T> implements NineGridView.NineGridAdapter{
    protected List<T> data ;
    protected Context context ;

    public NineGridViewDefaultAdapter(Context context, List<T> t) {
        this.context = context ;
        this.data = t ;
    }

    @Override
    public int getCount() {
        return data == null ? 0 : data.size() ;
    }

    @Override
    public T getItem(int position) {
        return data.get(position);
    }

    public ImageView generialDefaultImageView() {
        ImageView imageView = new ImageView(context) ;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        ViewGroup.LayoutParams params = generialDefaultLayoutParams() ;
        imageView.setLayoutParams(params);

        return imageView ;
    }

    protected ViewGroup.LayoutParams generialDefaultLayoutParams() {
        return new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT) ;
    }
}
