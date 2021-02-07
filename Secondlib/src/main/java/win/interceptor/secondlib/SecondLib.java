package win.interceptor.secondlib;

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

public class SecondLib {

    private static final String TAG = SecondLib.class.getSimpleName();

    public static void setInterceptor(Activity activity){
        Window.Callback callback = activity.getWindow().getCallback();
        if(callback instanceof  CallbackInterceptor2){
            Log.d(TAG, "already have interceptor 2");
            return;
        }

        CallbackInterceptor2 interceptor = new CallbackInterceptor2(callback);
        activity.getWindow().setCallback(interceptor);
        Log.d(TAG, "add CallbackInterceptor2");
    }

    private static class CallbackInterceptor2 implements Window.Callback{

        private Window.Callback originalCallback;

        CallbackInterceptor2(Window.Callback callback){
            originalCallback = callback;
        }

        @Override
        public boolean dispatchKeyEvent(KeyEvent event) {
            Log.d(TAG, "dispatchKeyEvent Do something 2");
            return originalCallback.dispatchKeyEvent(event);
        }

        @Override
        public boolean dispatchKeyShortcutEvent(KeyEvent event) {
            Log.d(TAG, "dispatchKeyShortcutEvent Do something 2");
            return originalCallback.dispatchKeyShortcutEvent(event);
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent event) {
            Log.d(TAG, "dispatchTouchEvent Do something 2");
            return originalCallback.dispatchTouchEvent(event);
        }

        @Override
        public boolean dispatchTrackballEvent(MotionEvent event) {
            Log.d(TAG, "dispatchTrackballEvent Do something 2");
            return originalCallback.dispatchTrackballEvent(event);
        }

        @Override
        public boolean dispatchGenericMotionEvent(MotionEvent event) {
            Log.d(TAG, "dispatchGenericMotionEvent Do something 2");
            return originalCallback.dispatchGenericMotionEvent(event);
        }

        @Override
        public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) {
            Log.d(TAG, "dispatchPopulateAccessibilityEvent Do something 2");
            return originalCallback.dispatchPopulateAccessibilityEvent(event);
        }

        @Nullable
        @Override
        public View onCreatePanelView(int featureId) {
            Log.d(TAG, "onCreatePanelView Do something 2");
            return originalCallback.onCreatePanelView(featureId);
        }

        @Override
        public boolean onCreatePanelMenu(int featureId, @NonNull Menu menu) {
            Log.d(TAG, "onCreatePanelMenu Do something 2");
            return originalCallback.onCreatePanelMenu(featureId, menu);
        }

        @Override
        public boolean onPreparePanel(int featureId, @Nullable View view, @NonNull Menu menu) {
            Log.d(TAG, "onPreparePanel Do something 2");
            return originalCallback.onPreparePanel(featureId, view, menu);
        }

        @Override
        public boolean onMenuOpened(int featureId, @NonNull Menu menu) {
            Log.d(TAG, "onMenuOpened Do something 2");
            return originalCallback.onMenuOpened(featureId, menu);
        }

        @Override
        public boolean onMenuItemSelected(int featureId, @NonNull MenuItem item) {
            Log.d(TAG, "onMenuItemSelected Do something 2");
            return originalCallback.onMenuItemSelected(featureId, item);
        }

        @Override
        public void onWindowAttributesChanged(WindowManager.LayoutParams attrs) {
            Log.d(TAG, "onWindowAttributesChanged Do something 2");
            originalCallback.onWindowAttributesChanged(attrs);
        }

        @Override
        public void onContentChanged() {
            Log.d(TAG, "onContentChanged Do something 2");
            originalCallback.onContentChanged();
        }

        @Override
        public void onWindowFocusChanged(boolean hasFocus) {
            Log.d(TAG, "onWindowFocusChanged Do something 2");
            originalCallback.onWindowFocusChanged(hasFocus);
        }

        @Override
        public void onAttachedToWindow() {
            Log.d(TAG, "onAttachedToWindow Do something 2");
            originalCallback.onAttachedToWindow();
        }

        @Override
        public void onDetachedFromWindow() {
            Log.d(TAG, "onDetachedFromWindow Do something 2");
            originalCallback.onDetachedFromWindow();
        }

        @Override
        public void onPanelClosed(int featureId, @NonNull Menu menu) {
            Log.d(TAG, "onPanelClosed Do something 2");
            originalCallback.onPanelClosed(featureId, menu);
        }

        @Override
        public boolean onSearchRequested() {
            Log.d(TAG, "onSearchRequested Do something 2");
            return  originalCallback.onSearchRequested();
        }

        @RequiresApi(api = Build.VERSION_CODES.M)
        @Override
        public boolean onSearchRequested(SearchEvent searchEvent) {
            Log.d(TAG, "onSearchRequested Do something 2");
            return  originalCallback.onSearchRequested(searchEvent);
        }

        @Nullable
        @Override
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            Log.d(TAG, "onWindowStartingActionMode Do something 2");
            return  originalCallback.onWindowStartingActionMode(callback);
        }

        @RequiresApi(api = Build.VERSION_CODES.M)
        @Nullable
        @Override
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int type) {
            Log.d(TAG, "onWindowStartingActionMode Do something 2");
            return  originalCallback.onWindowStartingActionMode(callback, type);
        }

        @Override
        public void onActionModeStarted(ActionMode mode) {
            Log.d(TAG, "onActionModeStarted Do something 2");
            originalCallback.onActionModeStarted(mode);
        }

        @Override
        public void onActionModeFinished(ActionMode mode) {
            Log.d(TAG, "onActionModeFinished  something 2");
            originalCallback.onActionModeFinished(mode);
        }
    }
}
