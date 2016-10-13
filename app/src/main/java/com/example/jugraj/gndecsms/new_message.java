package com.example.jugraj.gndecsms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class new_message extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_message);

        final EditText sender = (EditText) findViewById(R.id.sender);
        final EditText receiver = (EditText) findViewById(R.id.receiver);
        final EditText message = (EditText) findViewById(R.id.message);
        Button sendButton = (Button) findViewById(R.id.send_button);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String from = String.valueOf(sender.getText());
                String to = String.valueOf(receiver.getText());
                String sms = String.valueOf(message.getText());
                // send message
            }
        });
    }
}
