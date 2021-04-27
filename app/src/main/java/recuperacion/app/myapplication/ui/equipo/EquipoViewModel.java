package recuperacion.app.myapplication.ui.equipo;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EquipoViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public EquipoViewModel(){
        mText = new MutableLiveData<>();
        mText.setValue("");
    }
    public LiveData<String> getText() {
        return mText;
    }
}
