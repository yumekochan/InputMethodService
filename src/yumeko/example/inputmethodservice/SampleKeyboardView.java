package yumeko.example.inputmethodservice;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

public class SampleKeyboardView extends View {

	int height = 100;
	
	private Bitmap mBuffer;
	
	public SampleKeyboardView(Context context) {
		super(context);
	}
	
	public SampleKeyboardView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}
	
	public SampleKeyboardView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}
	
	public @interface KeyAction{
		boolean processKey() default false;
		
	}
	
	@Override
	public void onMeasure(int widthMeasureSpec,int heightMeasureSpec){
		int mPaddingLeft = super.getPaddingLeft();
		int mPaddingRight = super.getPaddingRight();
		int mPaddingTop = super.getPaddingTop();
		int mPaddingBottom = super.getPaddingBottom();
		int width = mPaddingLeft + mPaddingRight;
		setMeasuredDimension(MeasureSpec.getSize(widthMeasureSpec), height + mPaddingTop + mPaddingBottom);
	}
	
	@Override
	public void onDraw(Canvas canvas){
		
	}
	
	private void onBufferDraw(){
		
	}
}
