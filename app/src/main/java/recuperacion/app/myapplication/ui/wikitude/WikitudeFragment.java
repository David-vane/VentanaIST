package recuperacion.app.myapplication.ui.wikitude;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import recuperacion.app.myapplication.R;

public class WikitudeFragment extends Fragment {

    private WikitudeViewModel wikitudeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        wikitudeViewModel =
                new ViewModelProvider(this).get(WikitudeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_wikitude, container, false);
        final TextView textView = root.findViewById(R.id.text_wikitude);
        wikitudeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}