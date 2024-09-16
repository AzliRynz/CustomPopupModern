package com.nurazlib.custompopupmodern;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CustomPopUpModern {
    private Dialog dialog;
    private TextView title, message;
    private Button okButton;

    public CustomPopUpModern(Context context) {
        dialog = new Dialog(context);
        dialog.setContentView(R.layout.popup_layout);
        title = dialog.findViewById(R.id.title);
        message = dialog.findViewById(R.id.message);
        okButton = dialog.findViewById(R.id.ok_button);
    }

    // Set Title Text
    public void setTitle(String titleText) {
        title.setText(titleText);
    }

    // Set Message Text
    public void setMessage(String messageText) {
        message.setText(messageText);
    }

    // Set OK Button Text
    public void setOkButtonText(String buttonText) {
        okButton.setText(buttonText);
    }

    // Set OK Button Click Listener
    public void setOkButtonListener(View.OnClickListener listener) {
        okButton.setOnClickListener(listener);
    }

    // Show Pop-up
    public void show() {
        dialog.show();
    }

    // Dismiss Pop-up
    public void dismiss() {
        dialog.dismiss();
    }
}
