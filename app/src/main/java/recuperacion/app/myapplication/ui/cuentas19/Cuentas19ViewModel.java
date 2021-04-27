package recuperacion.app.myapplication.ui.cuentas19;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Cuentas19ViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public Cuentas19ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
