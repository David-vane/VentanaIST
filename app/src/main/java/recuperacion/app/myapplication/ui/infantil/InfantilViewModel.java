package recuperacion.app.myapplication.ui.infantil;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InfantilViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public InfantilViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
