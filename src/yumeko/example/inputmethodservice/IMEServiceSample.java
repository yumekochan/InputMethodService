package yumeko.example.inputmethodservice;

import android.inputmethodservice.InputMethodService;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;

public class IMEServiceSample extends InputMethodService{

	
	InputMethodManager mInputMethodManager;

	/**
	 * 
	 */
	@Override
	public void onCreate(){
		 super.onCreate();
	     mInputMethodManager = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
	}	
	
	/**
	 * 
	 */
	@Override
	public void onInitializeInterface(){
		
	}
	
	/**
	 * 
	 */
	@Override
	public View onCreateInputView(){
		
		return null;
	}

	/**
	 * 
	 */
    @Override 
    public View onCreateCandidatesView() {
    
    	return null;	
    }
    
    /**
     * 
     */
    @Override 
    public void onStartInput(EditorInfo attribute, boolean restarting) {
    	
    }
    
    /**
     * 
     */
    @Override
    public void onFinishInput(){
    	
    }
    
    /**
     * 
     */
    @Override
    public void onStartInputView(EditorInfo attribute, boolean restarting){
    	
    }
    
    /**
     * 
     */
    @Override
    public void onCurrentInputMethodSubtypeChanged(InputMethodSubtype subtype){
    	
    }
    
    /**
     * 
     */
    @Override public void onUpdateSelection(int oldSelStart, int oldSelEnd,
            int newSelStart, int newSelEnd,
            int candidatesStart, int candidatesEnd) {
    	
    }
    
    /**
     * 
     */
    @Override 
    public void onDisplayCompletions(CompletionInfo[] completions) {
    	
    }
    
    /**
     * 
     */
    @Override 
    public boolean onKeyDown(int keyCode, KeyEvent event) {
    	return false;
    }
    
    /**
     * 
     */
    @Override 
    public boolean onKeyUp(int keyCode, KeyEvent event) {
    	return false;
    }
}
