package com.example.arturmusayelyan.karofragmenttask;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by artur.musayelyan on 19/12/2017.
 */

public class FragmentForEdit extends Fragment implements View.OnClickListener {

    private Communicator communicator;
    private EditText sendEditText;
    private Button sendButton;

    public FragmentForEdit() {

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        communicator = (Communicator) context;
    }

    public static FragmentForEdit newInstance() {
        Bundle args = new Bundle();
        FragmentForEdit fragment = new FragmentForEdit();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.edit_for_fragment, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        sendEditText = view.findViewById(R.id.send_edit_text);
        sendButton = view.findViewById(R.id.send_button);
        sendButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.send_button:
                String data = sendEditText.getText().toString();
                communicator.respond(data);
                sendEditText.setText("");
                break;
        }
    }
}
