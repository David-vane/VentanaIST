package recuperacion.app.myapplication.ui.interno;

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
import recuperacion.app.myapplication.ui.alimentos.AlimentosViewModel;

public class InternoFragment extends Fragment {
    private InternoViewModel internoViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        internoViewModel =
                new ViewModelProvider(this).get(InternoViewModel.class);
        View root = inflater.inflate(R.layout.fragment_registro_interno, container, false);
        final TextView textView = root.findViewById(R.id.text_interno);
        internoViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
