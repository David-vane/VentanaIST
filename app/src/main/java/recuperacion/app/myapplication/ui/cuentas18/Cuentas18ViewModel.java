package recuperacion.app.myapplication.ui.cuentas18;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Cuentas18ViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public Cuentas18ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
