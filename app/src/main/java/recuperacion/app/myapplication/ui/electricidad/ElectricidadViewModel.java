package recuperacion.app.myapplication.ui.electricidad;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ElectricidadViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public ElectricidadViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
