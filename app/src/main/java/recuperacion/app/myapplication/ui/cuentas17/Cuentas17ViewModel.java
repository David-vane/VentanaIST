package recuperacion.app.myapplication.ui.cuentas17;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Cuentas17ViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public Cuentas17ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
