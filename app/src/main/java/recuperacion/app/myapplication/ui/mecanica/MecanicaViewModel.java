package recuperacion.app.myapplication.ui.mecanica;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MecanicaViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public MecanicaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
