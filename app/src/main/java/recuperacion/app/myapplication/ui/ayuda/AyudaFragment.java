package recuperacion.app.myapplication.ui.ayuda;

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

public class AyudaFragment extends Fragment {

    private AyudaViewModel ayudaViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ayudaViewModel =
                new ViewModelProvider(this).get(AyudaViewModel.class);
        View root = inflater.inflate(R.layout.ayuda, container, false);
        final TextView textView = root.findViewById(R.id.text_ayuda);
        ayudaViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}