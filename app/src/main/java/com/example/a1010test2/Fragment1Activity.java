package com.example.a1010test2;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment1Activity extends Fragment implements View.OnClickListener
{
    private ImageButton IB1,IB2,IB3,IB4;
    private View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment1,container,false);
        IB1 = view.findViewById(R.id.IB1);
        IB2 = view.findViewById(R.id.IB2);
        IB3 = view.findViewById(R.id.IB3);
        IB4 = view.findViewById(R.id.IB4);
        IB1.setOnClickListener(this);
        IB2.setOnClickListener(this);
        IB3.setOnClickListener(this);
        IB4.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(getActivity(), SubActivity.class);
        switch (v.getId()) {
            case R.id.IB1:
                intent.putExtra("IBid","IB1");
                break;
            case R.id.IB2:
                intent.putExtra("IBid", "IB2");
                break;
            case R.id.IB3:
                intent.putExtra("IBid", "IB3");
                break;
            case R.id.IB4:
                intent.putExtra("IBid", "IB4");
                break;
        }
        getActivity().startActivity(intent);
    }
}
