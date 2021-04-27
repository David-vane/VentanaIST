package recuperacion.app.myapplication.ui.elecciones;

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
import recuperacion.app.myapplication.ui.cuentas19.Cuentas19ViewModel;

public class EleccionesFragment extends Fragment {
    private EleccionesViewModel eleccionesViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        eleccionesViewModel =
                new ViewModelProvider(this).get(EleccionesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_elecciones, container, false);
        final TextView textView = root.findViewById(R.id.text_elecciones);
        eleccionesViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
