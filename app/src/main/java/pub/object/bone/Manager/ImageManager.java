package pub.object.bone.Manager;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.Transformation;
import pub.object.R;

/**
 * @author dlinking-lxy
 * @PackageName: pub.object.surface.fragment.
 * @date 17-7-19
 * @discription 图片处理类
 */
public class ImageManager {
    private static ImageManager mImageManager = null;

    private ImageManager() {}

    public static ImageManager getInstance() {
        if (mImageManager == null) {
            mImageManager = new ImageManager();
        }
        return mImageManager;
    }

    /**
     * 加载图片
     *
     * @param context
     * @param path
     * @param targetImageView 使用默认的占位等待图片和错误图片
     */
    public void loadImage(Context context, Object path, ImageView targetImageView) {
        Glide.with(context).load(path).placeholder(R.drawable.placeholder).error(R.drawable.notfound).centerCrop().into(targetImageView);
    }

    /**
     * 加载图片
     *
     * @param context
     * @param path
     * @param targetImageView 使用默认的占位等待图片和错误图片
     * @param transformation  图片转换器
     */
    public void loadImage(Context context, Object path, ImageView targetImageView, Transformation transformation) {
        Glide.with(context).load(path).bitmapTransform(transformation).placeholder(R.drawable.placeholder).error(R.drawable.placeholder).centerCrop().into(targetImageView);
    }

    /**
     * 加载图片
     *
     * @param context
     * @param path
     * @param targetImageView
     * @param placeHolderResourceId 加载中占位图片
     * @param errorResourceId       加载错误占位图片
     */
    public void loadImage(Context context, Object path, ImageView targetImageView, int placeHolderResourceId, int errorResourceId) {
        Glide.with(context).load(path).placeholder(placeHolderResourceId).error(errorResourceId).into(targetImageView);
    }

}
