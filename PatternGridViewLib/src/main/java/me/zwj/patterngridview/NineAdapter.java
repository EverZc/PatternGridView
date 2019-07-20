package me.zwj.patterngridview;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import java.util.List;

/**
 * @描述: 九宫格适配器
 * @创建时间: 2019-07-17
 * @作者: 张文靖同学
 * @简书: https://www.jianshu.com/u/197319888337
 */

public class NineAdapter extends NineGridViewDefaultAdapter<String> {

    private Context context;
    private List<String> items;

    public NineAdapter(Context context1, List<String> items) {
        super(context1, items);
        this.context = context1;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items == null ? 0 : items.size();
    }


    @Override
    public View getView(int position, View recycleView) {
        final String url = getItem(position);
        ImageView imageView;
        if (recycleView == null) {
            imageView = generialDefaultImageView();
        } else {
            imageView = (ImageView) recycleView;
        }
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);

        Glide.with(context).load(url)
                .placeholder(R.mipmap.position_square_medium)
                .into(imageView);

        return imageView;
    }
}
