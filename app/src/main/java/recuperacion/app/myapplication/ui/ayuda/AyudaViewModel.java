package recuperacion.app.myapplication.ui.ayuda;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AyudaViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AyudaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(" Esta es la pagina de ayuda ");
    }

    public LiveData<String> getText() {
        return mText;
    }
}