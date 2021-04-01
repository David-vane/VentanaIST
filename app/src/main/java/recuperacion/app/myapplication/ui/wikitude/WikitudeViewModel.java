package recuperacion.app.myapplication.ui.wikitude;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WikitudeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public WikitudeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Esta es la ventana de wikitude");
    }

    public LiveData<String> getText() {
        return mText;
    }
}