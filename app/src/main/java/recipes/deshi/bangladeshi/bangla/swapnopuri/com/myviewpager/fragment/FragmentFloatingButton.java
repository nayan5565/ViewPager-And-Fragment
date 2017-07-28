package recipes.deshi.bangladeshi.bangla.swapnopuri.com.myviewpager.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import recipes.deshi.bangladeshi.bangla.swapnopuri.com.myviewpager.R;

/**
 * Created by NAYAN on 5/8/2017.
 */
public class FragmentFloatingButton extends Fragment {
    private FloatingActionButton fab;

    @Nullable
    public static FragmentFloatingButton newInstance() {
        return new FragmentFloatingButton();
    }

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_floating, container, false);

        fab = (FloatingActionButton) view.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
//                Toast.makeText(getContext(), "floating button click", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
