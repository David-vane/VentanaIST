package recuperacion.app.myapplication.ui.estatuto;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EstatutoViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public EstatutoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
