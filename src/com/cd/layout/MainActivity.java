package com.cd.layout;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
	private static final String TAG = "MainActivity";
	private static final int BUTTON_1 = 1;
	private static final int BUTTON_2 = 2;
	private static final int BUTTON_3 = 3;
	private static final int BUTTON_4 = 4;
	private static final int BUTTON_5 = 5;
	private static final int BUTTON_6 = 6;
	private static final int BUTTON_7 = 7;
	private static final int BUTTON_8 = 8;
	private static final int BUTTON_9 = 9;
	private static final int BUTTON_10 = 10;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		generateView();
	}

	private void generateView() {
		final CompositeView View1 = new CompositeView(this);
		View1.setText("1");
		View1.setOnClickListener(this);
		View1.setIcon(R.drawable.ic_launcher);
		View1.setBackgroundResource(R.drawable.selector_blue2);
		View1.setId(BUTTON_1);
		View1.getTextView().setPadding(5, 0, 0, 0);

		final CompositeView View3 = new CompositeView(this);
		View3.setText("2");
		View3.setOnClickListener(this);
		View3.setIcon(R.drawable.ic_launcher);
		View3.setBackgroundResource(R.drawable.selector_blue1);
		View3.setId(BUTTON_9);
		View3.getTextView().setPadding(5, 0, 0, 0);

		final CompositeView View2 = new CompositeView(this);
		View2.setText("3");
		View2.setOnClickListener(this);
		View2.setIcon(R.drawable.ic_launcher);
		View2.setBackgroundResource(R.drawable.selector_blue4);
		View2.setId(BUTTON_10);
		View2.getTextView().setPadding(5, 0, 0, 0);

		final CompositeView View4 = new CompositeView(this);
		View4.setText("4");
		View4.setOnClickListener(this);
		View4.setIcon(R.drawable.ic_launcher);
		View4.setBackgroundResource(R.drawable.selector_blue3);
		View4.setId(BUTTON_2);
		View4.getTextView().setPadding(5, 0, 0, 0);

		final CompositeView View5 = new CompositeView(this);
		View5.setText("5");
		View5.setOnClickListener(this);
		View5.setIcon(R.drawable.ic_launcher);
		View5.setBackgroundResource(R.drawable.selector_green1);
		View5.setId(BUTTON_3);
		View5.getTextView().setPadding(5, 0, 0, 0);

		final CompositeView View6 = new CompositeView(this);
		View6.setText("6");
		View6.setOnClickListener(this);
		View6.setIcon(R.drawable.ic_launcher);
		View6.setBackgroundResource(R.drawable.selector_yellow);
		View6.setId(BUTTON_4);
		View6.getTextView().setPadding(5, 0, 0, 0);

		final CompositeView View7 = new CompositeView(this);
		View7.setText("7");
		View7.setOnClickListener(this);
		View7.setIcon(R.drawable.ic_launcher);
		View7.setBackgroundResource(R.drawable.selector_green2);
		View7.setId(BUTTON_5);
		View7.getTextView().setPadding(5, 0, 0, 0);

		final CompositeView View8 = new CompositeView(this);
		View8.setText("8");
		View8.setOnClickListener(this);
		View8.setOrientation(LinearLayout.VERTICAL);
		View8.setIcon(R.drawable.ic_launcher);
		View8.setBackgroundResource(R.drawable.selector_red);
		View8.setId(BUTTON_6);
		View8.getTextView().setGravity(Gravity.CENTER);

		final CompositeView View9 = new CompositeView(this);
		View9.setText("9");
		View9.setOnClickListener(this);
		View9.setOrientation(LinearLayout.VERTICAL);
		View9.setIcon(R.drawable.ic_launcher);
		View9.setBackgroundResource(R.drawable.selector_pink);
		View9.setId(BUTTON_7);

		final CompositeView View10 = new CompositeView(this);
		View10.setText("10");
		View10.setOnClickListener(this);
		View10.setIcon(R.drawable.ic_launcher);
		View10.setBackgroundResource(R.drawable.selector_orange);
		View10.setId(BUTTON_8);
		View10.getTextView().setPadding(5, 0, 0, 0);

		final RelativeLayout mainLayout = (RelativeLayout) findViewById(R.id.main_layout);
		ViewTreeObserver vto = mainLayout.getViewTreeObserver();
		vto.addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
			@Override
			public void onGlobalLayout() {
				final int oneUnitWidth = mainLayout.getMeasuredWidth() / 8;
				final int oneUnitHeight = mainLayout.getMeasuredHeight() / 6;
				Log.i(TAG, "Unit Width: " + oneUnitWidth);
				Log.i(TAG, "Unit Height: " + oneUnitHeight);
				/**
				 * 1
				 ***************************************************************/
				final RelativeLayout.LayoutParams otelParams = new RelativeLayout.LayoutParams(
						oneUnitWidth * 4, oneUnitHeight);
				otelParams.addRule(RelativeLayout.ALIGN_PARENT_TOP);
				otelParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
				// otelParams.setMargins(0, 0, 2, 0);
				View1.setLayoutParams(otelParams);
				/***************************************************************/

				/**
				 * 2
				 ***************************************************************/
				final RelativeLayout.LayoutParams otherParams = new RelativeLayout.LayoutParams(
						oneUnitWidth * 4, oneUnitHeight);
				otherParams.addRule(RelativeLayout.ALIGN_PARENT_TOP);
				otherParams.addRule(RelativeLayout.RIGHT_OF, View1.getId());
				otherParams.setMargins(2, 0, 0, 0);
				View2.setLayoutParams(otherParams);
				/***************************************************************/

				/**
				 * 3
				 ***************************************************************/
				final RelativeLayout.LayoutParams animationParams = new RelativeLayout.LayoutParams(
						oneUnitWidth * 3, oneUnitHeight);
				animationParams.addRule(RelativeLayout.BELOW, View1.getId());
				animationParams.addRule(RelativeLayout.RIGHT_OF, View4.getId());
				animationParams.setMargins(2, 2, 0, 0);

				View3.setLayoutParams(animationParams);
				/***************************************************************/

				/**
				 * 4
				 ***************************************************************/
				final RelativeLayout.LayoutParams wtdParams = new RelativeLayout.LayoutParams(
						oneUnitWidth * 5, oneUnitHeight);
				wtdParams.addRule(RelativeLayout.BELOW, View1.getId());
				wtdParams.setMargins(0, 2, 0, 2);
				View4.setLayoutParams(wtdParams);
				/***************************************************************/

				/**
				 * 5
				 ***************************************************************/
				final RelativeLayout.LayoutParams tvParams = new RelativeLayout.LayoutParams(
						oneUnitWidth * 4, oneUnitHeight);
				tvParams.addRule(RelativeLayout.BELOW, View4.getId());
				View5.setLayoutParams(tvParams);

				/***************************************************************/

				/**
				 * 6
				 ***************************************************************/
				final RelativeLayout.LayoutParams dealsParams = new RelativeLayout.LayoutParams(
						oneUnitWidth * 4, oneUnitHeight);
				dealsParams.addRule(RelativeLayout.RIGHT_OF, View5.getId());
				dealsParams.addRule(RelativeLayout.BELOW, View4.getId());
				dealsParams.setMargins(2, 0, 0, 0);
				View6.setLayoutParams(dealsParams);

				/***************************************************************/
				/**
				 * 7
				 ***************************************************************/
				final RelativeLayout.LayoutParams weatherParams = new RelativeLayout.LayoutParams(
						oneUnitWidth * 4, oneUnitHeight);
				weatherParams.addRule(RelativeLayout.BELOW, View5.getId());
				weatherParams.setMargins(0, 2, 0, 2);
				View7.setLayoutParams(weatherParams);

				/***************************************************************/

				/**
				 * 8
				 ***************************************************************/
				final RelativeLayout.LayoutParams alacarteParams = new RelativeLayout.LayoutParams(
						oneUnitWidth * 4, oneUnitHeight * 2);
				alacarteParams.addRule(RelativeLayout.RIGHT_OF, View7.getId());
				alacarteParams.addRule(RelativeLayout.BELOW, View6.getId());
				alacarteParams.setMargins(2, 2, 0, 2);
				View8.setLayoutParams(alacarteParams);

				/***************************************************************/

				/**
				 * 9
				 ***************************************************************/
				final RelativeLayout.LayoutParams wteParams = new RelativeLayout.LayoutParams(
						oneUnitWidth * 4, oneUnitHeight * 2);
				wteParams.addRule(RelativeLayout.BELOW, View7.getId());
				View9.setLayoutParams(wteParams);

				/***************************************************************/
				/**
				 * 10
				 ***************************************************************/
				final RelativeLayout.LayoutParams myInfoParams = new RelativeLayout.LayoutParams(
						oneUnitWidth * 4, oneUnitHeight * 2);
				myInfoParams.addRule(RelativeLayout.BELOW, View8.getId());
				myInfoParams.addRule(RelativeLayout.RIGHT_OF, View9.getId());
				myInfoParams.setMargins(2, 0, 0, 0);

				View10.setLayoutParams(myInfoParams);

				/***************************************************************/
				/**
				 * Delete tree observer
				 */
				ViewTreeObserver obs = mainLayout.getViewTreeObserver();
				obs.removeGlobalOnLayoutListener(this);
			}
		});

		mainLayout.addView(View1);
		mainLayout.addView(View2);
		mainLayout.addView(View3);
		mainLayout.addView(View4);
		mainLayout.addView(View5);
		mainLayout.addView(View6);
		mainLayout.addView(View7);
		mainLayout.addView(View8);
		mainLayout.addView(View9);
		mainLayout.addView(View10);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case BUTTON_1:
			Toast.makeText(this, "Pressed 1", Toast.LENGTH_SHORT).show();
			break;
		case BUTTON_9:
			Toast.makeText(this, "Pressed 9", Toast.LENGTH_SHORT).show();
			break;
		case BUTTON_2:
			Toast.makeText(this, "Pressed 2", Toast.LENGTH_SHORT).show();
			break;
		case BUTTON_3:
			Toast.makeText(this, "Pressed 3", Toast.LENGTH_SHORT).show();
			break;
		case BUTTON_4:
			Toast.makeText(this, "Pressed 4", Toast.LENGTH_SHORT).show();
			break;
		case BUTTON_5:
			Toast.makeText(this, "Pressed 5", Toast.LENGTH_SHORT).show();
			break;
		case BUTTON_6:
			Toast.makeText(this, "Pressed 6", Toast.LENGTH_SHORT).show();
			break;
		case BUTTON_7:
			Toast.makeText(this, "Pressed 7", Toast.LENGTH_SHORT).show();
			break;
		case BUTTON_8:
			Toast.makeText(this, "Pressed 8", Toast.LENGTH_SHORT).show();
			break;
		case BUTTON_10:
			Toast.makeText(this, "Pressed 10", Toast.LENGTH_SHORT).show();
			break;
		default:
			break;
		}
	}
}