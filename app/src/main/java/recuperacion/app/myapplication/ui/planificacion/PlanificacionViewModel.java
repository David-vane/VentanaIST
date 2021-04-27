package recuperacion.app.myapplication.ui.planificacion;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PlanificacionViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public PlanificacionViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
