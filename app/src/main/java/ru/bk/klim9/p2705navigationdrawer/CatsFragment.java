package ru.bk.klim9.p2705navigationdrawer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class CatsFragment extends Fragment {
    public static final String CAT_NAMES = "cats_names";
    public static final String CAT_DESCRIPTIONS = "cat_descriptions";
    public final static String TOP_IMAGE = "top image";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.cat_fragment, container, false);

        Bundle arguments = getArguments();
        if (arguments != null) {
            String catName = arguments.getString(CAT_NAMES);
            String catDescription = arguments.getString(CAT_DESCRIPTIONS);
            int topCardResourceId = arguments.getInt(TOP_IMAGE);

            displayValues(view, catName, catDescription, topCardResourceId);
        }
        return view;
    }

    private void displayValues(View v, String name,
                               String catDescription, int topCardResourceId) {
        TextView tvCatName = (TextView) v
                .findViewById(R.id.catTitle);
        TextView tvCatDescription = (TextView) v
                .findViewById(R.id.catDescription);
        ImageView ivCard = (ImageView) v
                .findViewById(R.id.topImage);

        tvCatName.setText(name);
        tvCatDescription.setText(catDescription);

        ivCard.setImageResource(topCardResourceId);
    }
}
