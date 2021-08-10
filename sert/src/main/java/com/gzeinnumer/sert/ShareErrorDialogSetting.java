package com.gzeinnumer.sert;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ShareErrorDialogSetting extends BaseDialog {

    private View _view;
    private TextView tvError;
    private ImageView whatsapp;
    private ImageView btn_cancel;
    protected String error = null;

    private void initView() {
        tvError = _view.findViewById(R.id.tv_error);
        whatsapp = _view.findViewById(R.id.whatsapp);
        btn_cancel = _view.findViewById(R.id.btn_cancel);
    }

    @Override
    protected int contentView() {
        return R.layout.share_error_dialog;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this._view = view;
        initView();
        initDesign();
        initOnClick();
    }

    private void initDesign() {

        if (error != null)
            tvError.setText(error);
    }

    private void initOnClick() {
        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent whatsappIntent = new Intent(Intent.ACTION_SEND);
                whatsappIntent.setType("text/plain");
                whatsappIntent.setPackage("com.whatsapp");
                whatsappIntent.putExtra(Intent.EXTRA_TEXT, error);
                try {
                    requireActivity().startActivity(whatsappIntent);
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(requireContext(), "Whatsapp have not been installed.", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getDialog()!=null)
                    getDialog().dismiss();
            }
        });
    }
}
