package recipes.deshi.bangladeshi.bangla.swapnopuri.com.myviewpager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by NAYAN on 5/10/2017.
 */
public class FragmentFour extends Fragment {
    @Nullable
    public static FragmentFour newInstance() {
        return new FragmentFour();
    }

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_four, container, false);
        return view;
    }
}
