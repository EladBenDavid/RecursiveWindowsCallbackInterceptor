package win.interceptor.firstlib;

import android.app.Activity;
import android.os.Build;
import android.util.Log;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public class FirstLib {

    private static final String TAG = FirstLib.class.getSimpleName();

    public static void setInterceptor(Activity activity){
        Window.Callback callback = activity.getWindow().getCallback();
        if(callback instanceof  CallbackInterceptor){
            Log.d(TAG, "already have interceptor");
            return;
        }

        CallbackInterceptor interceptor = new CallbackInterceptor(callback);
        activity.getWindow().setCallback(interceptor);
        Log.d(TAG, "add CallbackInterceptor");
    }

    private static class CallbackInterceptor implements Window.Callback{

        private Window.Callback originalCallback;

        CallbackInterceptor(Window.Callback callback){
            originalCallback = callback;
        }

        @Override
        public boolean dispatchKeyEvent(KeyEvent event) {
            Log.d(TAG, "dispatchKeyEvent Do something");
            return originalCallback.dispatchKeyEvent(event);
        }

        @Override
        public boolean dispatchKeyShortcutEvent(KeyEvent event) {
            Log.d(TAG, "dispatchKeyShortcutEvent Do something");
            return originalCallback.dispatchKeyShortcutEvent(event);
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent event) {
            Log.d(TAG, "dispatchTouchEvent Do something");
            return originalCallback.dispatchTouchEvent(event);
        }

        @Override
        public boolean dispatchTrackballEvent(MotionEvent event) {
            Log.d(TAG, "dispatchTrackballEvent Do something");
            return originalCallback.dispatchTrackballEvent(event);
        }

        @Override
        public boolean dispatchGenericMotionEvent(MotionEvent event) {
            Log.d(TAG, "dispatchGenericMotionEvent Do something");
            return originalCallback.dispatchGenericMotionEvent(event);
        }

        @Override
        public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) {
            Log.d(TAG, "dispatchPopulateAccessibilityEvent Do something");
            return originalCallback.dispatchPopulateAccessibilityEvent(event);
        }

        @Nullable
        @Override
        public View onCreatePanelView(int featureId) {
            Log.d(TAG, "onCreatePanelView Do something");
            return originalCallback.onCreatePanelView(featureId);
        }

        @Override
        public boolean onCreatePanelMenu(int featureId, @NonNull Menu menu) {
            Log.d(TAG, "onCreatePanelMenu Do something");
            return originalCallback.onCreatePanelMenu(featureId, menu);
        }

        @Override
        public boolean onPreparePanel(int featureId, @Nullable View view, @NonNull Menu menu) {
            Log.d(TAG, "onPreparePanel Do something");
            return originalCallback.onPreparePanel(featureId, view, menu);
        }

        @Override
        public boolean onMenuOpened(int featureId, @NonNull Menu menu) {
            Log.d(TAG, "onMenuOpened Do something");
            return originalCallback.onMenuOpened(featureId, menu);
        }

        @Override
        public boolean onMenuItemSelected(int featureId, @NonNull MenuItem item) {
            Log.d(TAG, "onMenuItemSelected Do something");
            return originalCallback.onMenuItemSelected(featureId, item);
        }

        @Override
        public void onWindowAttributesChanged(WindowManager.LayoutParams attrs) {
            Log.d(TAG, "onWindowAttributesChanged Do something");
            originalCallback.onWindowAttributesChanged(attrs);
        }

        @Override
        public void onContentChanged() {
            Log.d(TAG, "onContentChanged Do something");
            originalCallback.onContentChanged();
        }

        @Override
        public void onWindowFocusChanged(boolean hasFocus) {
            Log.d(TAG, "onWindowFocusChanged Do something");
            originalCallback.onWindowFocusChanged(hasFocus);
        }

        @Override
        public void onAttachedToWindow() {
            Log.d(TAG, "onAttachedToWindow Do something");
            originalCallback.onAttachedToWindow();
        }

        @Override
        public void onDetachedFromWindow() {
            Log.d(TAG, "onDetachedFromWindow Do something");
            originalCallback.onDetachedFromWindow();
        }

        @Override
        public void onPanelClosed(int featureId, @NonNull Menu menu) {
            Log.d(TAG, "onPanelClosed Do something");
            originalCallback.onPanelClosed(featureId, menu);
        }

        @Override
        public boolean onSearchRequested() {
            Log.d(TAG, "onSearchRequested Do something");
            return  originalCallback.onSearchRequested();
        }

        @RequiresApi(api = Build.VERSION_CODES.M)
        @Override
        public boolean onSearchRequested(SearchEvent searchEvent) {
            Log.d(TAG, "onSearchRequested Do something");
            return  originalCallback.onSearchRequested(searchEvent);
        }

        @Nullable
        @Override
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            Log.d(TAG, "onWindowStartingActionMode Do something");
            return  originalCallback.onWindowStartingActionMode(callback);
        }

        @RequiresApi(api = Build.VERSION_CODES.M)
        @Nullable
        @Override
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int type) {
            Log.d(TAG, "onWindowStartingActionMode Do something");
            return  originalCallback.onWindowStartingActionMode(callback, type);
        }

        @Override
        public void onActionModeStarted(ActionMode mode) {
            Log.d(TAG, "onActionModeStarted Do something");
            originalCallback.onActionModeStarted(mode);
        }

        @Override
        public void onActionModeFinished(ActionMode mode) {
            Log.d(TAG, "onActionModeFinished Do something");
            originalCallback.onActionModeFinished(mode);
        }
    }
}
