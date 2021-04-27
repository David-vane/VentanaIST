package recuperacion.app.myapplication.ui.alimentos;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AlimentosViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public AlimentosViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
