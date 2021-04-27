package recuperacion.app.myapplication.ui.software;

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
import recuperacion.app.myapplication.ui.instructivo.InstructivoViewModel;

public class SoftwareFragment extends Fragment {
    private SoftwareViewModel instructivoViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        instructivoViewModel =
                new ViewModelProvider(this).get(SoftwareViewModel.class);
        View root = inflater.inflate(R.layout.fragment_software, container, false);
        final TextView textView = root.findViewById(R.id.text_software);
        instructivoViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
