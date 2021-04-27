package recuperacion.app.myapplication.ui.equipo;

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

public class EquipoFragment extends Fragment {
    private EquipoViewModel equipoViewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        equipoViewModel = new ViewModelProvider(this).get(EquipoViewModel.class);
        View root = inflater.inflate(R.layout.fragment_equipo, container, false);
        final TextView textView = root.findViewById(R.id.text_equipo);
        equipoViewModel.getText().observe(getViewLifecycleOwner(),new Observer<String>(){
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
