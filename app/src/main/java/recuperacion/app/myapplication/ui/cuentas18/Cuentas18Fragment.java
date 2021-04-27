package recuperacion.app.myapplication.ui.cuentas18;

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

public class Cuentas18Fragment extends Fragment {
    private Cuentas18ViewModel cuentas18ViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        cuentas18ViewModel =
                new ViewModelProvider(this).get(Cuentas18ViewModel.class);
        View root = inflater.inflate(R.layout.fragment_cuentas18, container, false);
        final TextView textView = root.findViewById(R.id.text_cuentas18);
        cuentas18ViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
