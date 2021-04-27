package recuperacion.app.myapplication.ui.contabilidad;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ContabilidadViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public ContabilidadViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
