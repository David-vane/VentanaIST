package recuperacion.app.myapplication.ui.instructivo;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InstructivoViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public InstructivoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
