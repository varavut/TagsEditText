package mabbas007.tagsedittext.utils;

import android.content.Context;

import androidx.annotation.DimenRes;

/**
 * Created by Mohammad Abbas on 5/10/2016.
 * <p>
 * Update Jun/2016 :: delete methods - color and drawable can handler with ContextCompat
 */
public final class ResourceUtils {

    private ResourceUtils() throws InstantiationException {
        throw new InstantiationException("This utility class is created for instantiation");
    }

    public static float getDimension(Context context, @DimenRes int resourceId) {
        return context.getResources().getDimension(resourceId);
    }

    public static int getDimensionPixelSize(Context context, @DimenRes int resourceId) {
        return context.getResources().getDimensionPixelSize(resourceId);
    }

}
