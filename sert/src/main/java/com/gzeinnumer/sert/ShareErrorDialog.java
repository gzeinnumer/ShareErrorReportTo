package com.gzeinnumer.sert;

import android.graphics.drawable.Drawable;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class ShareErrorDialog extends ShareErrorDialogSetting {

    public static final String TAG = "CustomDialog";

    private FragmentManager _context;
    private FragmentTransaction _transaction;

    public ShareErrorDialog() {
    }

    public ShareErrorDialog(FragmentManager context) {
        this._context = context;

        _transaction = _context.beginTransaction();
        Fragment previous = _context.findFragmentByTag(ShareErrorDialog.TAG);
        if (previous != null) {
            _transaction.remove(previous);
        }
    }

    //CANVAS
    public ShareErrorDialog setDialogCanvas(Drawable resource) {
        this.shapeCanvas = resource;
        return this;
    }

    //ACTION CALLBACK
    public ShareErrorDialog onCancelPressedCallBack(OnCancelPressed callBack) {
        this.onCancelPressed = callBack;
        return this;
    }

    public void show() {
        this.show(_transaction, ShareErrorDialog.TAG);
    }

    public ShareErrorDialog setErrorMessage(String error) {
        this.error = error;
        return this;
    }

    //callback
    public interface OnCancelPressed {
        void onCancelPressed();
    }

    public interface OnOkPressed {
        void onOkPressed();
    }
}