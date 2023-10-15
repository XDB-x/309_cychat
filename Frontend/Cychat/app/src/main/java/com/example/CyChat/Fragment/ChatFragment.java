package com.example.CyChat.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.example.myapplication.R;

public class ChatFragment extends Fragment {
    private TextView tv;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View messageLayout = inflater.inflate(R.layout.chat_layout, container, false);
        tv=(TextView) messageLayout.findViewById(R.id.message);
        tv.setText("0");
        return messageLayout;
    }
}
