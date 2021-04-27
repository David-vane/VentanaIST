package recuperacion.app.myapplication.ui.seguridad;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SeguridadViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public SeguridadViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
