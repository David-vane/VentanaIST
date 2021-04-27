package recuperacion.app.myapplication.ui.investigacion;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InvestigacionViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public InvestigacionViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
