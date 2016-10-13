package com.example.jugraj.gndecsms;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

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
            public void onClick(final View v) {
                String from = String.valueOf(sender.getText());
                String to = String.valueOf(receiver.getText());
                String sms = String.valueOf(message.getText());
                RequestQueue queue = Volley.newRequestQueue(v.getContext());
                String url = "https://www.google.com";
                StringRequest request = new StringRequest(Request.Method.GET,
                        url, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Snackbar.make(v, response, Snackbar.LENGTH_LONG)
                                .setAction("Action", null).show();
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Snackbar.make(v, error.toString(), Snackbar.LENGTH_LONG)
                                .setAction("Action", null).show();
                    }
                });
                queue.add(request);

            }
        });

        Button cancelButton = (Button) findViewById(R.id.cancel_button);
        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
