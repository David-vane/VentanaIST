package recuperacion.app.myapplication.ui.elecciones;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EleccionesViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public EleccionesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
