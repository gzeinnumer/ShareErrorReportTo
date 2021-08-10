package com.gzeinnumer.sert;

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
    }

    public ShareErrorDialog builder() {
        _transaction = _context.beginTransaction();
        Fragment previous = _context.findFragmentByTag(ShareErrorDialog.TAG);
        if (previous != null) {
            _transaction.remove(previous);
        }
        return this;
    }

    public ShareErrorDialog setErrorMessage(String error) {
        this.error = error;
        return this;
    }

    public void show() {
        this.show(_transaction, ShareErrorDialog.TAG);
    }
}