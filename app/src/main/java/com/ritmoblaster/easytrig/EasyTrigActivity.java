package com.ritmoblaster.easytrig;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;

public class EasyTrigActivity extends Activity implements OnClickListener {

  @Override
  public void onCreate(Bundle savedInstanceState) {

    super.onCreate(savedInstanceState);

    setContentView(R.layout.main);
    
    // retrieve central linear layout

    this.centralLinearLayout = (LinearLayout) findViewById(R.id.centralLinearLayout);
    
    // instantiate new graph view
    
    this.graphView = new GraphView(this);
    
    // add graph view to central linear layout
    
    this.centralLinearLayout.addView(this.graphView);

    // retrieve function value buttons

    funcval_zero_Button = (Button) findViewById(R.id.funcval_zero);
    funcval_plus_frac_1_2_Button = (Button) findViewById(R.id.funcval_plus_frac_1_2);
    funcval_minus_frac_1_2_Button = (Button) findViewById(R.id.funcval_minus_frac_1_2);
    funcval_plus_frac_sqrt3_3_Button = (Button) findViewById(R.id.funcval_plus_frac_sqrt3_3);
    funcval_minus_frac_sqrt3_3_Button = (Button) findViewById(R.id.funcval_minus_frac_sqrt3_3);
    funcval_plus_frac_sqrt2_2_Button = (Button) findViewById(R.id.funcval_plus_frac_sqrt2_2);
    funcval_minus_frac_sqrt2_2_Button = (Button) findViewById(R.id.funcval_minus_frac_sqrt2_2);
    funcval_plus_frac_sqrt3_2_Button = (Button) findViewById(R.id.funcval_plus_frac_sqrt3_2);
    funcval_minus_frac_sqrt3_2_Button = (Button) findViewById(R.id.funcval_minus_frac_sqrt3_2);
    funcval_plus_1_Button = (Button) findViewById(R.id.funcval_plus_1);
    funcval_minus_1_Button = (Button) findViewById(R.id.funcval_minus_1);
    funcval_plus_frac_2sqrt3_3_Button = (Button) findViewById(R.id.funcval_plus_frac_2sqrt3_3);
    funcval_minus_frac_2sqrt3_3_Button = (Button) findViewById(R.id.funcval_minus_frac_2sqrt3_3);
    funcval_plus_sqrt2_Button = (Button) findViewById(R.id.funcval_plus_sqrt2);
    funcval_minus_sqrt2_Button = (Button) findViewById(R.id.funcval_minus_sqrt2);
    funcval_plus_2_Button = (Button) findViewById(R.id.funcval_plus_2);
    funcval_plus_sqrt3_Button = (Button) findViewById(R.id.funcval_plus_sqrt3);
    funcval_minus_sqrt3_Button = (Button) findViewById(R.id.funcval_minus_sqrt3);
    funcval_minus_2_Button = (Button) findViewById(R.id.funcval_minus_2);
    funcval_undefined_Button = (Button) findViewById(R.id.funcval_undefined);

    // reteieve set on click listeners for function value buttons

    funcval_zero_Button.setOnClickListener(this);
    funcval_plus_frac_1_2_Button.setOnClickListener(this);
    funcval_minus_frac_1_2_Button.setOnClickListener(this);
    funcval_plus_frac_sqrt3_3_Button.setOnClickListener(this);
    funcval_minus_frac_sqrt3_3_Button.setOnClickListener(this);
    funcval_plus_frac_sqrt2_2_Button.setOnClickListener(this);
    funcval_minus_frac_sqrt2_2_Button.setOnClickListener(this);
    funcval_plus_frac_sqrt3_2_Button.setOnClickListener(this);
    funcval_minus_frac_sqrt3_2_Button.setOnClickListener(this);
    funcval_plus_1_Button.setOnClickListener(this);
    funcval_minus_1_Button.setOnClickListener(this);
    funcval_plus_frac_2sqrt3_3_Button.setOnClickListener(this);
    funcval_minus_frac_2sqrt3_3_Button.setOnClickListener(this);
    funcval_plus_sqrt2_Button.setOnClickListener(this);
    funcval_minus_sqrt2_Button.setOnClickListener(this);
    funcval_plus_sqrt3_Button.setOnClickListener(this);
    funcval_minus_sqrt3_Button.setOnClickListener(this);
    funcval_plus_2_Button.setOnClickListener(this);
    funcval_minus_2_Button.setOnClickListener(this);
    funcval_undefined_Button.setOnClickListener(this);

    // retrieve preferences
    
    retrievePreferences();
    
    this.updateHandler = new UpdateHandler();
    
    new ElapsedTimeHandler();
    
    isComputing = false;

    setState(STATE_DEMO);
    
    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

  }
  
  // retrieve preferences
  
  void retrievePreferences() {
  
    SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
    
    this.graphHasLabels = prefs.getBoolean("displayAngle", false);
    this.timeInterval = Integer.parseInt(prefs.getString("timeInterval", "1"));
    this.numTriesPerGame = Integer.parseInt(prefs.getString("numTriesPerGame", "2"));
    //as an alternative we could load the default values programmatically from the XML file
    //PreferenceManager.setDefaultValues(this, R.xml.prefs, false);
    TrigFuncs.triangleType306090 = Integer.parseInt(prefs.getString("sideLengths306090", "2" /* change to getResources().getString(R.string.default_value)) */));
    System.out.println("FOOFOOFOO");
    System.out.println(TrigFuncs.triangleType306090);
    TrigFuncs.triangleType454590 = Integer.parseInt(prefs.getString("sideLengths454590", "6"/* change to getResources().getString(R.string.default_value)) */));
    System.out.println("FOOFOOFOO");
    System.out.println(TrigFuncs.triangleType454590);
    
  }
  
  
  // handle orientation changes
  
  @Override
  public void onConfigurationChanged(Configuration newConfig) {
    
    super.onConfigurationChanged(newConfig);

    if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
      
        ;//
        
    } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
      
        //Toast.makeText(this, "portrait", Toast.LENGTH_SHORT).show();
        
    }

  }
  
  // setup options menu
  
  @Override
  public boolean onCreateOptionsMenu(Menu menu) {

    MenuInflater inflater = getMenuInflater();

    inflater.inflate(R.menu.mainmenu, menu);

    return true;

  }

  @Override
  public boolean onPrepareOptionsMenu(Menu menu) {

    // MenuItem startItem = menu.findItem(R.id.start);

    return super.onPrepareOptionsMenu(menu);

  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {

    switch (item.getItemId()) {

      case R.id.demo:
        
        // check whether we're in the query state
        
        if (state == STATE_PLAY_QUERY) {
          
          // send a message to schedule another screen refresh

          updateHandler.sendMessage(this.timeInterval);
          
        }

        setState(STATE_DEMO);

        break;

      case R.id.start:

        isComputing = false;

        setState(STATE_PLAY_QUERY);
        
        currentNumTries = 0;
        
        numCorrectAnswers = 0;
        
        elapsedTime = 0;

        break;

      case R.id.calc:
        
        startActivityForResult(new Intent(this, FuncNamesActivity.class), CHOOSE_FUNC_NAME_AND_ARG_REQUEST);
        
        break;
        
      case R.id.preferences:
        
        startActivityForResult(new Intent(this, PrefsActivity.class), MANIPULATE_PREFERENCES_REQUEST);
        
        break;

    }

    return true;

  }
  
  @Override
  protected void onActivityResult(int requestCode, int resultCode, Intent data) {

    switch (requestCode) {

      // coming back from function name and argument selection
      
      case CHOOSE_FUNC_NAME_AND_ARG_REQUEST:

        if (resultCode == RESULT_OK) {
          
          isComputing = true;
          
          funcValIndexUser = -1;
          
          graphView.funcNameIndex = FuncNamesActivity.selectedFuncName;
          
          graphView.funcArgDegRad = FuncArgsActivity.selectedFuncArgDeg != -1 ? 0 : 1;
          
          graphView.funcArgIndex = FuncArgsActivity.selectedFuncArgDeg != -1 ? FuncArgsActivity.selectedFuncArgDeg : FuncArgsActivity.selectedFuncArgRad;
          
          setState(STATE_PLAY_ANSWRONG_DISPLAYRAY);
          
          this.updateHandler.removeMessages(UpdateHandler.MESSAGE_WHAT_UPDATE);
          
          this.updateHandler.sendMessage(EasyTrigActivity.this.timeInterval);
          
        }

        break;
        
      // coming back from preference selection

      case MANIPULATE_PREFERENCES_REQUEST:

        if (resultCode == RESULT_OK) {
          
          retrievePreferences();
          
          if (state == STATE_FINISH)
            
            // prevent wrong information appearing on finish screen due to updated preferences
            
            setState(STATE_DEMO);
          
        }
        
        break;

    }
    
  }

  // set button properties according to current state

  private void setButtonBackgrounds() {

    // retrieve function value index corresponding to solution to the problem

    int funcValIndexAns = TrigFuncs.evalAsIndex(graphView.funcNameIndex, graphView.funcArgIndex);

    switch (state) {

    // in these cases we make it impossible to click on the buttons coloring the solution button and the other default buttons

      case STATE_DEMO:
      case STATE_PLAY_ANSCORRECT:

        this.funcval_zero_Button.setBackgroundResource(funcValIndexAns == TrigFuncs.FUNC_VAL_ZERO ? R.drawable.funcval_zero_ansright : R.drawable.funcval_zero_default);
        this.funcval_plus_frac_1_2_Button.setBackgroundResource(funcValIndexAns == TrigFuncs.FUNC_VAL_PLUS_FRAC_1_2 ? R.drawable.funcval_plus_frac_1_2_ansright : R.drawable.funcval_plus_frac_1_2_default);
        this.funcval_minus_frac_1_2_Button.setBackgroundResource(funcValIndexAns == TrigFuncs.FUNC_VAL_MINUS_FRAC_1_2 ? R.drawable.funcval_minus_frac_1_2_ansright : R.drawable.funcval_minus_frac_1_2_default);
        this.funcval_plus_frac_sqrt3_3_Button.setBackgroundResource(funcValIndexAns == TrigFuncs.FUNC_VAL_PLUS_FRAC_SQRT3_3 ? R.drawable.funcval_plus_frac_sqrt3_3_ansright : R.drawable.funcval_plus_frac_sqrt3_3_default);
        this.funcval_minus_frac_sqrt3_3_Button.setBackgroundResource(funcValIndexAns == TrigFuncs.FUNC_VAL_MINUS_FRAC_SQRT3_3 ? R.drawable.funcval_minus_frac_sqrt3_3_ansright : R.drawable.funcval_minus_frac_sqrt3_3_default);
        this.funcval_plus_frac_sqrt2_2_Button.setBackgroundResource(funcValIndexAns == TrigFuncs.FUNC_VAL_PLUS_FRAC_SQRT2_2 ? R.drawable.funcval_plus_frac_sqrt2_2_ansright : R.drawable.funcval_plus_frac_sqrt2_2_default);
        this.funcval_minus_frac_sqrt2_2_Button.setBackgroundResource(funcValIndexAns == TrigFuncs.FUNC_VAL_MINUS_FRAC_SQRT2_2 ? R.drawable.funcval_minus_frac_sqrt2_2_ansright : R.drawable.funcval_minus_frac_sqrt2_2_default);
        this.funcval_plus_frac_sqrt3_2_Button.setBackgroundResource(funcValIndexAns == TrigFuncs.FUNC_VAL_PLUS_FRAC_SQRT3_2 ? R.drawable.funcval_plus_frac_sqrt3_2_ansright : R.drawable.funcval_plus_frac_sqrt3_2_default);
        this.funcval_minus_frac_sqrt3_2_Button.setBackgroundResource(funcValIndexAns == TrigFuncs.FUNC_VAL_MINUS_FRAC_SQRT3_2 ? R.drawable.funcval_minus_frac_sqrt3_2_ansright : R.drawable.funcval_minus_frac_sqrt3_2_default);
        this.funcval_plus_1_Button.setBackgroundResource(funcValIndexAns == TrigFuncs.FUNC_VAL_PLUS_1 ? R.drawable.funcval_plus_1_ansright : R.drawable.funcval_plus_1_default);
        this.funcval_minus_1_Button.setBackgroundResource(funcValIndexAns == TrigFuncs.FUNC_VAL_MINUS_1 ? R.drawable.funcval_minus_1_ansright : R.drawable.funcval_minus_1_default);
        this.funcval_plus_frac_2sqrt3_3_Button.setBackgroundResource(funcValIndexAns == TrigFuncs.FUNC_VAL_PLUS_FRAC_2SQRT3_3 ? R.drawable.funcval_plus_frac_2sqrt3_3_ansright : R.drawable.funcval_plus_frac_2sqrt3_3_default);
        this.funcval_minus_frac_2sqrt3_3_Button.setBackgroundResource(funcValIndexAns == TrigFuncs.FUNC_VAL_MINUS_FRAC_2SQRT3_3 ? R.drawable.funcval_minus_frac_2sqrt3_3_ansright : R.drawable.funcval_minus_frac_2sqrt3_3_default);
        this.funcval_plus_sqrt2_Button.setBackgroundResource(funcValIndexAns == TrigFuncs.FUNC_VAL_PLUS_SQRT2 ? R.drawable.funcval_plus_sqrt2_ansright : R.drawable.funcval_plus_sqrt2_default);
        this.funcval_minus_sqrt2_Button.setBackgroundResource(funcValIndexAns == TrigFuncs.FUNC_VAL_MINUS_SQRT2 ? R.drawable.funcval_minus_sqrt2_ansright : R.drawable.funcval_minus_sqrt2_default);
        this.funcval_plus_sqrt3_Button.setBackgroundResource(funcValIndexAns == TrigFuncs.FUNC_VAL_PLUS_SQRT3 ? R.drawable.funcval_plus_sqrt3_ansright : R.drawable.funcval_plus_sqrt3_default);
        this.funcval_minus_sqrt3_Button.setBackgroundResource(funcValIndexAns == TrigFuncs.FUNC_VAL_MINUS_SQRT3 ? R.drawable.funcval_minus_sqrt3_ansright : R.drawable.funcval_minus_sqrt3_default);
        this.funcval_plus_2_Button.setBackgroundResource(funcValIndexAns == TrigFuncs.FUNC_VAL_PLUS_2 ? R.drawable.funcval_plus_2_ansright : R.drawable.funcval_plus_2_default);
        this.funcval_minus_2_Button.setBackgroundResource(funcValIndexAns == TrigFuncs.FUNC_VAL_MINUS_2 ? R.drawable.funcval_minus_2_ansright : R.drawable.funcval_minus_2_default);
        this.funcval_undefined_Button.setBackgroundResource(funcValIndexAns == TrigFuncs.FUNC_VAL_UNDEFINED ? R.drawable.funcval_undefined_ansright : R.drawable.funcval_undefined_default);

        break;

      // in this case we make it possible to click on the buttons

      case STATE_PLAY_QUERY:

        this.funcval_zero_Button.setBackgroundResource(R.drawable.funcval_zero_selector);
        this.funcval_plus_frac_1_2_Button.setBackgroundResource(R.drawable.funcval_plus_frac_1_2_selector);
        this.funcval_minus_frac_1_2_Button.setBackgroundResource(R.drawable.funcval_minus_frac_1_2_selector);
        this.funcval_plus_frac_sqrt3_3_Button.setBackgroundResource(R.drawable.funcval_plus_frac_sqrt3_3_selector);
        this.funcval_minus_frac_sqrt3_3_Button.setBackgroundResource(R.drawable.funcval_minus_frac_sqrt3_3_selector);
        this.funcval_plus_frac_sqrt2_2_Button.setBackgroundResource(R.drawable.funcval_plus_frac_sqrt2_2_selector);
        this.funcval_minus_frac_sqrt2_2_Button.setBackgroundResource(R.drawable.funcval_minus_frac_sqrt2_2_selector);
        this.funcval_plus_frac_sqrt3_2_Button.setBackgroundResource(R.drawable.funcval_plus_frac_sqrt3_2_selector);
        this.funcval_minus_frac_sqrt3_2_Button.setBackgroundResource(R.drawable.funcval_minus_frac_sqrt3_2_selector);
        this.funcval_plus_1_Button.setBackgroundResource(R.drawable.funcval_plus_1_selector);
        this.funcval_minus_1_Button.setBackgroundResource(R.drawable.funcval_minus_1_selector);
        this.funcval_plus_frac_2sqrt3_3_Button.setBackgroundResource(R.drawable.funcval_plus_frac_2sqrt3_3_selector);
        this.funcval_minus_frac_2sqrt3_3_Button.setBackgroundResource(R.drawable.funcval_minus_frac_2sqrt3_3_selector);
        this.funcval_plus_sqrt2_Button.setBackgroundResource(R.drawable.funcval_plus_sqrt2_selector);
        this.funcval_minus_sqrt2_Button.setBackgroundResource(R.drawable.funcval_minus_sqrt2_selector);
        this.funcval_plus_sqrt3_Button.setBackgroundResource(R.drawable.funcval_plus_sqrt3_selector);
        this.funcval_minus_sqrt3_Button.setBackgroundResource(R.drawable.funcval_minus_sqrt3_selector);
        this.funcval_plus_2_Button.setBackgroundResource(R.drawable.funcval_plus_2_selector);
        this.funcval_minus_2_Button.setBackgroundResource(R.drawable.funcval_minus_2_selector);
        this.funcval_undefined_Button.setBackgroundResource(R.drawable.funcval_undefined_selector);

        break;

      // in these cases we make it impossible to click on the buttons and color he user choice button and the default buttons

      case STATE_PLAY_ANSWRONG_DISPLAYRAY:
      case STATE_PLAY_ANSWRONG_DISPLAYTRIANGLE:
      case STATE_PLAY_ANSWRONG_DISPLAYNUMERATOR:
      case STATE_PLAY_ANSWRONG_DISPLAYDENOMINATOR:
      case STATE_FINISH:

        this.funcval_zero_Button.setBackgroundResource(funcValIndexUser == TrigFuncs.FUNC_VAL_ZERO ? R.drawable.funcval_zero_answrong : R.drawable.funcval_zero_default);
        this.funcval_plus_frac_1_2_Button.setBackgroundResource(funcValIndexUser == TrigFuncs.FUNC_VAL_PLUS_FRAC_1_2 ? R.drawable.funcval_plus_frac_1_2_answrong : R.drawable.funcval_plus_frac_1_2_default);
        this.funcval_minus_frac_1_2_Button.setBackgroundResource(funcValIndexUser == TrigFuncs.FUNC_VAL_MINUS_FRAC_1_2 ? R.drawable.funcval_minus_frac_1_2_answrong : R.drawable.funcval_minus_frac_1_2_default);
        this.funcval_plus_frac_sqrt3_3_Button.setBackgroundResource(funcValIndexUser == TrigFuncs.FUNC_VAL_PLUS_FRAC_SQRT3_3 ? R.drawable.funcval_plus_frac_sqrt3_3_answrong : R.drawable.funcval_plus_frac_sqrt3_3_default);
        this.funcval_minus_frac_sqrt3_3_Button.setBackgroundResource(funcValIndexUser == TrigFuncs.FUNC_VAL_MINUS_FRAC_SQRT3_3 ? R.drawable.funcval_minus_frac_sqrt3_3_answrong : R.drawable.funcval_minus_frac_sqrt3_3_default);
        this.funcval_plus_frac_sqrt2_2_Button.setBackgroundResource(funcValIndexUser == TrigFuncs.FUNC_VAL_PLUS_FRAC_SQRT2_2 ? R.drawable.funcval_plus_frac_sqrt2_2_answrong : R.drawable.funcval_plus_frac_sqrt2_2_default);
        this.funcval_minus_frac_sqrt2_2_Button.setBackgroundResource(funcValIndexUser == TrigFuncs.FUNC_VAL_MINUS_FRAC_SQRT2_2 ? R.drawable.funcval_minus_frac_sqrt2_2_answrong : R.drawable.funcval_minus_frac_sqrt2_2_default);
        this.funcval_plus_frac_sqrt3_2_Button.setBackgroundResource(funcValIndexUser == TrigFuncs.FUNC_VAL_PLUS_FRAC_SQRT3_2 ? R.drawable.funcval_plus_frac_sqrt3_2_answrong : R.drawable.funcval_plus_frac_sqrt3_2_default);
        this.funcval_minus_frac_sqrt3_2_Button.setBackgroundResource(funcValIndexUser == TrigFuncs.FUNC_VAL_MINUS_FRAC_SQRT3_2 ? R.drawable.funcval_minus_frac_sqrt3_2_answrong : R.drawable.funcval_minus_frac_sqrt3_2_default);
        this.funcval_plus_1_Button.setBackgroundResource(funcValIndexUser == TrigFuncs.FUNC_VAL_PLUS_1 ? R.drawable.funcval_plus_1_answrong : R.drawable.funcval_plus_1_default);
        this.funcval_minus_1_Button.setBackgroundResource(funcValIndexUser == TrigFuncs.FUNC_VAL_MINUS_1 ? R.drawable.funcval_minus_1_answrong : R.drawable.funcval_minus_1_default);
        this.funcval_plus_frac_2sqrt3_3_Button.setBackgroundResource(funcValIndexUser == TrigFuncs.FUNC_VAL_PLUS_FRAC_2SQRT3_3 ? R.drawable.funcval_plus_frac_2sqrt3_3_answrong : R.drawable.funcval_plus_frac_2sqrt3_3_default);
        this.funcval_minus_frac_2sqrt3_3_Button.setBackgroundResource(funcValIndexUser == TrigFuncs.FUNC_VAL_MINUS_FRAC_2SQRT3_3 ? R.drawable.funcval_minus_frac_2sqrt3_3_answrong : R.drawable.funcval_minus_frac_2sqrt3_3_default);
        this.funcval_plus_sqrt2_Button.setBackgroundResource(funcValIndexUser == TrigFuncs.FUNC_VAL_PLUS_SQRT2 ? R.drawable.funcval_plus_sqrt2_answrong : R.drawable.funcval_plus_sqrt2_default);
        this.funcval_minus_sqrt2_Button.setBackgroundResource(funcValIndexUser == TrigFuncs.FUNC_VAL_MINUS_SQRT2 ? R.drawable.funcval_minus_sqrt2_answrong : R.drawable.funcval_minus_sqrt2_default);
        this.funcval_plus_sqrt3_Button.setBackgroundResource(funcValIndexUser == TrigFuncs.FUNC_VAL_PLUS_SQRT3 ? R.drawable.funcval_plus_sqrt3_answrong : R.drawable.funcval_plus_sqrt3_default);
        this.funcval_minus_sqrt3_Button.setBackgroundResource(funcValIndexUser == TrigFuncs.FUNC_VAL_MINUS_SQRT3 ? R.drawable.funcval_minus_sqrt3_answrong : R.drawable.funcval_minus_sqrt3_default);
        this.funcval_plus_2_Button.setBackgroundResource(funcValIndexUser == TrigFuncs.FUNC_VAL_PLUS_2 ? R.drawable.funcval_plus_2_answrong : R.drawable.funcval_plus_2_default);
        this.funcval_minus_2_Button.setBackgroundResource(funcValIndexUser == TrigFuncs.FUNC_VAL_MINUS_2 ? R.drawable.funcval_minus_2_answrong : R.drawable.funcval_minus_2_default);
        this.funcval_undefined_Button.setBackgroundResource(funcValIndexUser == TrigFuncs.FUNC_VAL_UNDEFINED ? R.drawable.funcval_undefined_answrong : R.drawable.funcval_undefined_default);

        break;

      // in these cases we make it impossible to click on the buttons and color the solution button, the user choice button, and the other buttons

      case STATE_PLAY_ANSWRONG_DISPLAYANSWER:

        this.funcval_zero_Button.setBackgroundResource(funcValIndexAns == TrigFuncs.FUNC_VAL_ZERO ? R.drawable.funcval_zero_ansright :
            funcValIndexUser == TrigFuncs.FUNC_VAL_ZERO ? R.drawable.funcval_zero_answrong : R.drawable.funcval_zero_default);
        this.funcval_plus_frac_1_2_Button.setBackgroundResource(funcValIndexAns == TrigFuncs.FUNC_VAL_PLUS_FRAC_1_2 ? R.drawable.funcval_plus_frac_1_2_ansright :
            funcValIndexUser == TrigFuncs.FUNC_VAL_PLUS_FRAC_1_2 ? R.drawable.funcval_plus_frac_1_2_answrong : R.drawable.funcval_plus_frac_1_2_default);
        this.funcval_minus_frac_1_2_Button.setBackgroundResource(funcValIndexAns == TrigFuncs.FUNC_VAL_MINUS_FRAC_1_2 ? R.drawable.funcval_minus_frac_1_2_ansright :
            funcValIndexUser == TrigFuncs.FUNC_VAL_MINUS_FRAC_1_2 ? R.drawable.funcval_minus_frac_1_2_answrong : R.drawable.funcval_minus_frac_1_2_default);
        this.funcval_plus_frac_sqrt3_3_Button.setBackgroundResource(funcValIndexAns == TrigFuncs.FUNC_VAL_PLUS_FRAC_SQRT3_3 ? R.drawable.funcval_plus_frac_sqrt3_3_ansright :
            funcValIndexUser == TrigFuncs.FUNC_VAL_PLUS_FRAC_SQRT3_3 ? R.drawable.funcval_plus_frac_sqrt3_3_answrong : R.drawable.funcval_plus_frac_sqrt3_3_default);
        this.funcval_minus_frac_sqrt3_3_Button.setBackgroundResource(funcValIndexAns == TrigFuncs.FUNC_VAL_MINUS_FRAC_SQRT3_3 ? R.drawable.funcval_minus_frac_sqrt3_3_ansright :
            funcValIndexUser == TrigFuncs.FUNC_VAL_MINUS_FRAC_SQRT3_3 ? R.drawable.funcval_minus_frac_sqrt3_3_answrong : R.drawable.funcval_minus_frac_sqrt3_3_default);
        this.funcval_plus_frac_sqrt2_2_Button.setBackgroundResource(funcValIndexAns == TrigFuncs.FUNC_VAL_PLUS_FRAC_SQRT2_2 ? R.drawable.funcval_plus_frac_sqrt2_2_ansright :
            funcValIndexUser == TrigFuncs.FUNC_VAL_PLUS_FRAC_SQRT2_2 ? R.drawable.funcval_plus_frac_sqrt2_2_answrong : R.drawable.funcval_plus_frac_sqrt2_2_default);
        this.funcval_minus_frac_sqrt2_2_Button.setBackgroundResource(funcValIndexAns == TrigFuncs.FUNC_VAL_MINUS_FRAC_SQRT2_2 ? R.drawable.funcval_minus_frac_sqrt2_2_ansright :
            funcValIndexUser == TrigFuncs.FUNC_VAL_MINUS_FRAC_SQRT2_2 ? R.drawable.funcval_minus_frac_sqrt2_2_answrong : R.drawable.funcval_minus_frac_sqrt2_2_default);
        this.funcval_plus_frac_sqrt3_2_Button.setBackgroundResource(funcValIndexAns == TrigFuncs.FUNC_VAL_PLUS_FRAC_SQRT3_2 ? R.drawable.funcval_plus_frac_sqrt3_2_ansright :
            funcValIndexUser == TrigFuncs.FUNC_VAL_PLUS_FRAC_SQRT3_2 ? R.drawable.funcval_plus_frac_sqrt3_2_answrong : R.drawable.funcval_plus_frac_sqrt3_2_default);
        this.funcval_minus_frac_sqrt3_2_Button.setBackgroundResource(funcValIndexAns == TrigFuncs.FUNC_VAL_MINUS_FRAC_SQRT3_2 ? R.drawable.funcval_minus_frac_sqrt3_2_ansright :
            funcValIndexUser == TrigFuncs.FUNC_VAL_MINUS_FRAC_SQRT3_2 ? R.drawable.funcval_minus_frac_sqrt3_2_answrong : R.drawable.funcval_minus_frac_sqrt3_2_default);
        this.funcval_plus_1_Button.setBackgroundResource(funcValIndexAns == TrigFuncs.FUNC_VAL_PLUS_1 ? R.drawable.funcval_plus_1_ansright :
            funcValIndexUser == TrigFuncs.FUNC_VAL_PLUS_1 ? R.drawable.funcval_plus_1_answrong : R.drawable.funcval_plus_1_default);
        this.funcval_minus_1_Button.setBackgroundResource(funcValIndexAns == TrigFuncs.FUNC_VAL_MINUS_1 ? R.drawable.funcval_minus_1_ansright :
            funcValIndexUser == TrigFuncs.FUNC_VAL_MINUS_1 ? R.drawable.funcval_minus_1_answrong : R.drawable.funcval_minus_1_default);
        this.funcval_plus_frac_2sqrt3_3_Button.setBackgroundResource(funcValIndexAns == TrigFuncs.FUNC_VAL_PLUS_FRAC_2SQRT3_3 ? R.drawable.funcval_plus_frac_2sqrt3_3_ansright :
            funcValIndexUser == TrigFuncs.FUNC_VAL_PLUS_FRAC_2SQRT3_3 ? R.drawable.funcval_plus_frac_2sqrt3_3_answrong : R.drawable.funcval_plus_frac_2sqrt3_3_default);
        this.funcval_minus_frac_2sqrt3_3_Button.setBackgroundResource(funcValIndexAns == TrigFuncs.FUNC_VAL_MINUS_FRAC_2SQRT3_3 ? R.drawable.funcval_minus_frac_2sqrt3_3_ansright :
            funcValIndexUser == TrigFuncs.FUNC_VAL_MINUS_FRAC_2SQRT3_3 ? R.drawable.funcval_minus_frac_2sqrt3_3_answrong : R.drawable.funcval_minus_frac_2sqrt3_3_default);
        this.funcval_plus_sqrt2_Button.setBackgroundResource(funcValIndexAns == TrigFuncs.FUNC_VAL_PLUS_SQRT2 ? R.drawable.funcval_plus_sqrt2_ansright :
            funcValIndexUser == TrigFuncs.FUNC_VAL_PLUS_SQRT2 ? R.drawable.funcval_plus_sqrt2_answrong : R.drawable.funcval_plus_sqrt2_default);
        this.funcval_minus_sqrt2_Button.setBackgroundResource(funcValIndexAns == TrigFuncs.FUNC_VAL_MINUS_SQRT2 ? R.drawable.funcval_minus_sqrt2_ansright :
            funcValIndexUser == TrigFuncs.FUNC_VAL_MINUS_SQRT2 ? R.drawable.funcval_minus_sqrt2_answrong : R.drawable.funcval_minus_sqrt2_default);
        this.funcval_plus_sqrt3_Button.setBackgroundResource(funcValIndexAns == TrigFuncs.FUNC_VAL_PLUS_SQRT3 ? R.drawable.funcval_plus_sqrt3_ansright :
            funcValIndexUser == TrigFuncs.FUNC_VAL_PLUS_SQRT3 ? R.drawable.funcval_plus_sqrt3_answrong : R.drawable.funcval_plus_sqrt3_default);
        this.funcval_minus_sqrt3_Button.setBackgroundResource(funcValIndexAns == TrigFuncs.FUNC_VAL_MINUS_SQRT3 ? R.drawable.funcval_minus_sqrt3_ansright :
            funcValIndexUser == TrigFuncs.FUNC_VAL_MINUS_SQRT3 ? R.drawable.funcval_minus_sqrt3_answrong : R.drawable.funcval_minus_sqrt3_default);
        this.funcval_plus_2_Button.setBackgroundResource(funcValIndexAns == TrigFuncs.FUNC_VAL_PLUS_2 ? R.drawable.funcval_plus_2_ansright :
            funcValIndexUser == TrigFuncs.FUNC_VAL_PLUS_2 ? R.drawable.funcval_plus_2_answrong : R.drawable.funcval_plus_2_default);
        this.funcval_minus_2_Button.setBackgroundResource(funcValIndexAns == TrigFuncs.FUNC_VAL_MINUS_2 ? R.drawable.funcval_minus_2_ansright :
            funcValIndexUser == TrigFuncs.FUNC_VAL_MINUS_2 ? R.drawable.funcval_minus_2_answrong : R.drawable.funcval_minus_2_default);
        this.funcval_undefined_Button.setBackgroundResource(funcValIndexAns == TrigFuncs.FUNC_VAL_UNDEFINED ? R.drawable.funcval_undefined_ansright :
            funcValIndexUser == TrigFuncs.FUNC_VAL_UNDEFINED ? R.drawable.funcval_undefined_answrong : R.drawable.funcval_undefined_default);

    }

  }

  // Transition to specified state.

  public void setState(int state) {
    
    switch (this.state) {
      
      case STATE_FINISH:
        
        //added recently
        // if (isComputing && (state == STATE_PLAY_ANSWRONG_DISPLAYANSWER))
        
        //  updateHandler.removeMessages(UpdateHandler.MESSAGE_WHAT_UPDATE);
        
         //end added recently
 
        // restart message updates

        this.updateHandler.sendMessage(this.timeInterval);
        
        break;
      
    }

    this.state = state;
    
    // actions specific to individual states

    switch (state) {

      case STATE_DEMO:
        
        if (isComputing) {
          
          // recently added
          isComputing = false;

          this.updateHandler.removeMessages(UpdateHandler.MESSAGE_WHAT_UPDATE);
          
          this.updateHandler.sendMessage(this.timeInterval);
          //recently added
          
        }
        
        // compute new randomized function name and argument

        this.graphView.computeFuncNameAndArg();

        break;

      case STATE_PLAY_QUERY:

        this.graphView.computeFuncNameAndArg();

        break;

      case STATE_PLAY_ANSCORRECT:

        ++numCorrectAnswers;
        
       break;

      case STATE_PLAY_ANSWRONG_DISPLAYRAY:
        
        break;

      case STATE_PLAY_ANSWRONG_DISPLAYTRIANGLE:

        break;

      case STATE_PLAY_ANSWRONG_DISPLAYNUMERATOR:

        break;

      case STATE_PLAY_ANSWRONG_DISPLAYDENOMINATOR:

        break;

      case STATE_PLAY_ANSWRONG_DISPLAYANSWER:

        break;
        
      case STATE_FINISH:
        
        System.out.println("Setting state to finish.");
        
        funcValIndexUser = -1;
        
        break;

    }

   // set button backgrounds

    setButtonBackgrounds();
    
    // redraw graph view

    this.graphView.invalidate();
     
  }

  @Override
  public void onClick(View v) {

    // check whether application is waiting for user to click on an answer

    if (state == STATE_PLAY_QUERY) {

      // retrieve function value index corresponding to user selection

      switch (v.getId()) {

        case R.id.funcval_zero:

          this.funcValIndexUser = TrigFuncs.FUNC_VAL_ZERO;

          break;

        case R.id.funcval_plus_frac_1_2:

          this.funcValIndexUser = TrigFuncs.FUNC_VAL_PLUS_FRAC_1_2;

          break;

        case R.id.funcval_minus_frac_1_2:

          this.funcValIndexUser = TrigFuncs.FUNC_VAL_MINUS_FRAC_1_2;

          break;

        case R.id.funcval_plus_frac_sqrt3_3:

          this.funcValIndexUser = TrigFuncs.FUNC_VAL_PLUS_FRAC_SQRT3_3;

          break;

        case R.id.funcval_minus_frac_sqrt3_3:

          this.funcValIndexUser = TrigFuncs.FUNC_VAL_MINUS_FRAC_SQRT3_3;

          break;

        case R.id.funcval_plus_frac_sqrt2_2:

          this.funcValIndexUser = TrigFuncs.FUNC_VAL_PLUS_FRAC_SQRT2_2;

          break;

        case R.id.funcval_minus_frac_sqrt2_2:

          this.funcValIndexUser = TrigFuncs.FUNC_VAL_MINUS_FRAC_SQRT2_2;

          break;

        case R.id.funcval_plus_frac_sqrt3_2:

          this.funcValIndexUser = TrigFuncs.FUNC_VAL_PLUS_FRAC_SQRT3_2;

          break;

        case R.id.funcval_minus_frac_sqrt3_2:

          this.funcValIndexUser = TrigFuncs.FUNC_VAL_MINUS_FRAC_SQRT3_2;

          break;

        case R.id.funcval_plus_1:

          this.funcValIndexUser = TrigFuncs.FUNC_VAL_PLUS_1;

          break;

        case R.id.funcval_minus_1:

          this.funcValIndexUser = TrigFuncs.FUNC_VAL_MINUS_1;

          break;

        case R.id.funcval_plus_frac_2sqrt3_3:

          this.funcValIndexUser = TrigFuncs.FUNC_VAL_PLUS_FRAC_2SQRT3_3;

          break;

        case R.id.funcval_minus_frac_2sqrt3_3:

          this.funcValIndexUser = TrigFuncs.FUNC_VAL_MINUS_FRAC_2SQRT3_3;

          break;

        case R.id.funcval_plus_sqrt2:

          this.funcValIndexUser = TrigFuncs.FUNC_VAL_PLUS_SQRT2;

          break;

        case R.id.funcval_minus_sqrt2:

          this.funcValIndexUser = TrigFuncs.FUNC_VAL_MINUS_SQRT2;

          break;

        case R.id.funcval_plus_sqrt3:

          this.funcValIndexUser = TrigFuncs.FUNC_VAL_PLUS_SQRT3;

          break;

        case R.id.funcval_minus_sqrt3:

          this.funcValIndexUser = TrigFuncs.FUNC_VAL_MINUS_SQRT3;

          break;

        case R.id.funcval_plus_2:

          this.funcValIndexUser = TrigFuncs.FUNC_VAL_PLUS_2;

          break;

        case R.id.funcval_minus_2:

          this.funcValIndexUser = TrigFuncs.FUNC_VAL_MINUS_2;

          break;

        case R.id.funcval_undefined:

          this.funcValIndexUser = TrigFuncs.FUNC_VAL_UNDEFINED;

          break;

      }

      // retrieve function argument index corresponding to correct answer

      int funcValIndexAns = TrigFuncs.evalAsIndex(graphView.funcNameIndex, graphView.funcArgIndex);

      // set current state according to whether user supplied correct or wrong answer

      setState(funcValIndexUser == funcValIndexAns ? STATE_PLAY_ANSCORRECT : STATE_PLAY_ANSWRONG_DISPLAYRAY);

      // cancel last message

      this.updateHandler.removeMessages(UpdateHandler.MESSAGE_WHAT_UPDATE);

      // restart message updates

      this.updateHandler.sendMessage(this.timeInterval);

    }

  }

  private class ElapsedTimeHandler extends Handler {

    public ElapsedTimeHandler() {

      sendMessage(EasyTrigActivity.this.timeInterval);

    }
    
    @Override
    public void handleMessage(Message msg) {
      
      sendMessage(INTERVAL_GRANULARITY_MILLISECONDS);
      
    }     
    
    private void sendMessage(long interval) {
      
      Message msg = this.obtainMessage(MESSAGE_WHAT_UPDATE);
      this.sendMessageDelayed(msg, INTERVAL_GRANULARITY_MILLISECONDS);
      System.out.println("hello");
      if (state == EasyTrigActivity.STATE_PLAY_QUERY)

        ++elapsedTime;
      
    }

    private static final int MESSAGE_WHAT_UPDATE = 0;
    
    // update every tenth of a second

    private static final int INTERVAL_GRANULARITY_MILLISECONDS = 100;

  }
  
  private class UpdateHandler extends Handler {

    public UpdateHandler() {

      sendMessage(EasyTrigActivity.this.timeInterval);

    }

    // Follow relevant state transition to next state.

    @Override
    public void handleMessage(Message msg) {
      
      // ensure we are not in a paused state or we are entering the demo state
      
      if (EasyTrigActivity.this.state != STATE_PLAY_QUERY && EasyTrigActivity.this.state != STATE_FINISH) {
        
        // take different actions based on the draw stage

        switch (EasyTrigActivity.this.state) {

          case STATE_DEMO:

            setState(STATE_DEMO);

            break;

          case STATE_PLAY_ANSCORRECT:
            
            if (++currentNumTries == numTriesPerGame)
          
              setState(STATE_FINISH);
            
            else
 
              setState(STATE_PLAY_QUERY);

            break;

          case STATE_PLAY_ANSWRONG_DISPLAYRAY:

            setState(STATE_PLAY_ANSWRONG_DISPLAYTRIANGLE);

            break;

          case STATE_PLAY_ANSWRONG_DISPLAYTRIANGLE:

            setState(STATE_PLAY_ANSWRONG_DISPLAYNUMERATOR);

            break;

          case STATE_PLAY_ANSWRONG_DISPLAYNUMERATOR:

            setState(STATE_PLAY_ANSWRONG_DISPLAYDENOMINATOR);

            break;

          case STATE_PLAY_ANSWRONG_DISPLAYDENOMINATOR:

            setState(STATE_PLAY_ANSWRONG_DISPLAYANSWER);

            break;

          case STATE_PLAY_ANSWRONG_DISPLAYANSWER:

            // here depending on attempteCounter decide whether to display problem or pause and launch high-scores activity
            
            System.out.println("HERE: isComputing: " + isComputing);
            System.out.println("HERE: currentNumTries: " + currentNumTries);
            
            if (!isComputing)
              
              if (++currentNumTries == numTriesPerGame)
          
                setState(STATE_FINISH);
            
              else
 
                setState(STATE_PLAY_QUERY);

            break;

        }

        EasyTrigActivity.this.graphView.invalidate();

        // in case we're in the query state we must make sure we send the next message given seconds after user clicks

        if (state != STATE_PLAY_QUERY || !(isComputing && state == STATE_PLAY_ANSWRONG_DISPLAYANSWER))

          sendMessage(EasyTrigActivity.this.timeInterval);
        
        // added recently
        if (isComputing && (state == STATE_PLAY_ANSWRONG_DISPLAYANSWER))
        
          updateHandler.removeMessages(UpdateHandler.MESSAGE_WHAT_UPDATE);
        
      }

    }

    private void sendMessage(long interval) {
      Message msg = this.obtainMessage(MESSAGE_WHAT_UPDATE);
      this.sendMessageDelayed(msg, INTERVAL_GRANULARITY_MILLISECONDS * interval);
      System.out.println("hello");
      
    }

    private static final int MESSAGE_WHAT_UPDATE = 0;

    private static final int INTERVAL_GRANULARITY_MILLISECONDS = 1000;

  }

  private LinearLayout centralLinearLayout;
  private GraphView graphView;

  private class GraphView extends View {

    public GraphView(Context context) {

      super(context);

      computeFuncNameAndArg();

    }

    @Override
    protected void onDraw(Canvas canvas) {

      if (EasyTrigActivity.this.graphHasLabels) {

       // set length of each graph axis

        this.axis_length = new Double(0.30 * this.getWidth()).intValue();

        // set radius of graph circle

        this.circle_radius = new Double(0.20 * this.getWidth()).intValue();
        
        // set vertical coordinates of circle origin

        this.origin_vertical_offset = new Double(1.65 * axis_length).intValue();

      } else {

       // set length of each graph axis

        this.axis_length = new Double(0.40 * this.getWidth()).intValue();

        // set radius of graph circle

        this.circle_radius = new Double(0.25 * this.getWidth()).intValue();

        // set vertical coordinates of circle origin

        this.origin_vertical_offset = new Double(1.35 * axis_length).intValue();
        
      }

      // set expression vertical offset

      this.expression_vertical_offset = 0;

      // draw graph
      
      if (EasyTrigActivity.this.state != EasyTrigActivity.STATE_FINISH) {

        drawGraph(canvas);

        drawFuncNameAndArg(canvas);
          
      } else {
        
       Paint paint = new Paint();
       paint = new Paint(Paint.ANTI_ALIAS_FLAG);
       paint.setStyle(Paint.Style.STROKE);
       paint.setColor(Color.BLACK);
       paint.setStrokeWidth(2.0f);
       paint.setTextSize(20);
       canvas.drawText("Correct: " + numCorrectAnswers, 30, 150, paint);
       canvas.drawText("Wrong: " + (numTriesPerGame - numCorrectAnswers), 30, 200, paint);
       canvas.drawText("Seconds: " + elapsedTime / 10, 30, 300, paint);
        
      }
      
      switch (EasyTrigActivity.this.state) {

        case EasyTrigActivity.STATE_DEMO:

          drawColoredAxis(canvas);

          break;

        case EasyTrigActivity.STATE_PLAY_QUERY:

          break;

        case EasyTrigActivity.STATE_PLAY_ANSCORRECT:

          break;

        case EasyTrigActivity.STATE_PLAY_ANSWRONG_DISPLAYRAY:

          drawColoredAxis(canvas);

          break;

        case EasyTrigActivity.STATE_PLAY_ANSWRONG_DISPLAYTRIANGLE:

          drawTriangle(canvas);
          drawFuncNameDef(canvas);

          break;

        case EasyTrigActivity.STATE_PLAY_ANSWRONG_DISPLAYNUMERATOR:

          drawFuncNameDef(canvas);
          drawSideEquation(canvas, TrigFuncs.getNumeratorSideTypeForFuncName(this.funcNameIndex));

          break;

        case EasyTrigActivity.STATE_PLAY_ANSWRONG_DISPLAYDENOMINATOR:

          drawFuncNameDef(canvas);
          drawSideEquation(canvas, TrigFuncs.getDenominatorSideTypeForFuncName(this.funcNameIndex));

          break;

        case EasyTrigActivity.STATE_PLAY_ANSWRONG_DISPLAYANSWER:

          // set correct button to orange

          break;

      }

    }

    private void drawGraph(Canvas canvas) {

      canvas.drawColor(Color.RED);
      paint = new Paint(Paint.ANTI_ALIAS_FLAG);
      paint.setStyle(Paint.Style.STROKE);
      paint.setColor(Color.BLACK);
      paint.setStrokeWidth(3.5f);

      canvas.drawCircle(this.getWidth() / 2, origin_vertical_offset, circle_radius, paint);

      for (int i = 0; i < TrigFuncs.rotation_angles.length; i++) {
        canvas.rotate(-TrigFuncs.rotation_angles[i], this.getWidth() / 2, origin_vertical_offset);
        drawAxis(canvas);
        canvas.rotate(TrigFuncs.rotation_angles[i], this.getWidth() / 2, origin_vertical_offset);
      }
      
    }

    private void drawAxis(Canvas canvas) {

      canvas.drawLine(this.getWidth() / 2, origin_vertical_offset, this.getWidth() / 2 + axis_length, origin_vertical_offset, paint);
      canvas.drawLine(this.getWidth() / 2 + axis_length, origin_vertical_offset, this.getWidth() / 2 + axis_length - arrow_pixels, origin_vertical_offset - arrow_pixels, paint);
      canvas.drawLine(this.getWidth() / 2 + axis_length, origin_vertical_offset, this.getWidth() / 2 + axis_length - arrow_pixels, origin_vertical_offset + arrow_pixels, paint);

    }

    private void drawColoredAxis(Canvas canvas) {

      // retrieve rotation angle index

      int index = TrigFuncs.getRotationAngleIndexFromFuncArgIndex(this.funcArgIndex);

      // retrieve bitmap corresponding to function argument

      int funcArgSmallResource;
      if (this.funcArgDegRad == 0)
        funcArgSmallResource = TrigFuncs.getFuncArgDegSmallDrawableResource(this.funcArgIndex);
      else
        funcArgSmallResource = TrigFuncs.getFuncArgRadSmallDrawableResource(this.funcArgIndex);
      Bitmap funcArgSmallBitmap = BitmapFactory.decodeResource(getResources(), funcArgSmallResource);

      // draw axis and bitmap

      paint.setColor(Color.MAGENTA);

      canvas.rotate(-TrigFuncs.rotation_angles[index], this.getWidth() / 2, origin_vertical_offset);

      if (EasyTrigActivity.this.graphHasLabels) {
        canvas.rotate(TrigFuncs.rotation_angles[index], this.getWidth() / 2 + axis_length + funcArgSmallBitmap.getWidth() / 2, origin_vertical_offset);
        canvas.drawBitmap(funcArgSmallBitmap, this.getWidth() / 2 + axis_length, origin_vertical_offset - funcArgSmallBitmap.getHeight() / 2, null);
        canvas.rotate(-TrigFuncs.rotation_angles[index], this.getWidth() / 2 + axis_length + funcArgSmallBitmap.getWidth() / 2, origin_vertical_offset);
      }

      drawAxis(canvas);

      canvas.rotate(TrigFuncs.rotation_angles[index], this.getWidth() / 2, origin_vertical_offset);

    }

    void drawTriangle(Canvas canvas) {

      // retrieve rotation angle index

      int index = TrigFuncs.getRotationAngleIndexFromFuncArgIndex(this.funcArgIndex);
      double rotationAngleRadians = TrigFuncs.rotation_angles[index] * Math.PI / 180.0;

      paint.setColor(Color.WHITE);

      Path path = new Path();
      path.moveTo(this.getWidth() / 2, origin_vertical_offset);
      path.lineTo((float) (this.getWidth() / 2 + this.circle_radius * Math.cos(rotationAngleRadians)),
          (float) (origin_vertical_offset - this.circle_radius * Math.sin(rotationAngleRadians)));
      path.lineTo((float) (this.getWidth() / 2 + this.circle_radius * Math.cos(rotationAngleRadians)), (float) (origin_vertical_offset));
      path.lineTo(this.getWidth() / 2, origin_vertical_offset);
      canvas.drawPath(path, paint);

    }
    
    void drawTriangleHypotenuseSide(Canvas canvas) {
      
      // retrieve rotation angle index

      int index = TrigFuncs.getRotationAngleIndexFromFuncArgIndex(this.funcArgIndex);
      double rotationAngleRadians = TrigFuncs.rotation_angles[index] * Math.PI / 180.0;
      
      paint.setColor(Color.BLUE);
      
      Path path = new Path();
      path.moveTo(this.getWidth() / 2, origin_vertical_offset);
      path.lineTo((float) (this.getWidth() / 2 + this.circle_radius * Math.cos(rotationAngleRadians)),
          (float) (origin_vertical_offset - this.circle_radius * Math.sin(rotationAngleRadians)));
      canvas.drawPath(path, paint);

    }
    
    void drawTriangleAdjacentSide(Canvas canvas) {
      
      // retrieve rotation angle index

      int index = TrigFuncs.getRotationAngleIndexFromFuncArgIndex(this.funcArgIndex);
      double rotationAngleRadians = TrigFuncs.rotation_angles[index] * Math.PI / 180.0;
      
      paint.setColor(Color.GREEN);
      
      Path path = new Path();
      path.moveTo((float) (this.getWidth() / 2 + this.circle_radius * Math.cos(rotationAngleRadians)), (float) (origin_vertical_offset));
      path.lineTo(this.getWidth() / 2, origin_vertical_offset);
      canvas.drawPath(path, paint);
      
      paint.setStyle(Paint.Style.FILL);
      
      if (TrigFuncs.isWithinEpsilon(this.getWidth() / 2 + this.circle_radius * Math.cos(rotationAngleRadians), this.getWidth() / 2))
  
        canvas.drawCircle(this.getWidth() / 2, origin_vertical_offset, 4.0f, paint);
            
      paint.setStyle(Paint.Style.STROKE);
      
    }
    
    void drawTriangleOppositeSide(Canvas canvas) {
      
      // retrieve rotation angle index

      int index = TrigFuncs.getRotationAngleIndexFromFuncArgIndex(this.funcArgIndex);
      double rotationAngleRadians = TrigFuncs.rotation_angles[index] * Math.PI / 180.0;
      
      paint.setColor(Color.CYAN);
      
      Path path = new Path();
      path.moveTo((float) (this.getWidth() / 2 + this.circle_radius * Math.cos(rotationAngleRadians)),
          (float) (origin_vertical_offset - this.circle_radius * Math.sin(rotationAngleRadians)));
      path.lineTo((float) (this.getWidth() / 2 + this.circle_radius * Math.cos(rotationAngleRadians)), (float) (origin_vertical_offset));
      canvas.drawPath(path, paint);

      paint.setStyle(Paint.Style.FILL);
      
      if (TrigFuncs.isWithinEpsilon((origin_vertical_offset - this.circle_radius * Math.sin(rotationAngleRadians)), (origin_vertical_offset)))
      
        canvas.drawCircle((float) (this.getWidth() / 2 + this.circle_radius * Math.cos(rotationAngleRadians)), (origin_vertical_offset), 4.0f, paint);
      
      paint.setStyle(Paint.Style.STROKE);
      
   }
 
 
    void computeFuncNameAndArg() {

      // retrieve function argument index and resource

      this.funcNameIndex = new Double(Math.random() * TrigFuncs.NUM_FUNC_NAMES).intValue();
      this.funcArgIndex = new Double(Math.random() * TrigFuncs.NUM_FUNC_ARGS).intValue();
      this.funcArgDegRad = new Double(Math.random() * 2).intValue();

      //EasyTrigActivity.this.graphHasLabels = !EasyTrigActivity.this.graphHasLabels;

    }

    void drawFuncNameAndArg(Canvas canvas) {

      // retrieve function name index and resource

      int funcNameResource = TrigFuncs.getFuncNameDrawableResource(this.funcNameIndex);
      int funcArgResource;
      if (this.funcArgDegRad == 0)
        funcArgResource = TrigFuncs.getFuncArgDegDrawableResource(this.funcArgIndex);
      else
        funcArgResource = TrigFuncs.getFuncArgRadDrawableResource(this.funcArgIndex);

      // draw function name and argument

      funcNameBitmap = BitmapFactory.decodeResource(getResources(), funcNameResource);
      funcArgBitmap = BitmapFactory.decodeResource(getResources(), funcArgResource);
      canvas.drawBitmap(funcNameBitmap, this.getWidth() / 2 - funcNameBitmap.getWidth(), this.getHeight() - funcNameBitmap.getHeight() - this.expression_vertical_offset, null);
      canvas.drawBitmap(funcArgBitmap, this.getWidth() / 2, this.getHeight() - funcArgBitmap.getHeight() - this.expression_vertical_offset, null);

    }

    Bitmap funcNameBitmap;
    Bitmap funcArgBitmap;
    Bitmap funcNameDefBitmap;

    void drawFuncNameDef(Canvas canvas) {

      // draw formula corresponding to function name

      int funcNameDefResource = TrigFuncs.getFuncNameDefDrawableResource(this.funcNameIndex);
      this.funcNameDefBitmap = BitmapFactory.decodeResource(getResources(), funcNameDefResource);
      canvas.drawBitmap(funcNameDefBitmap, this.getWidth() / 2 - funcNameDefBitmap.getWidth() / 2, this.getHeight() - funcNameBitmap.getHeight() - funcNameDefBitmap.getHeight()
          - 2 * this.expression_vertical_offset, null);
    }

    void drawSideEquation(Canvas canvas, int sideType) {
      
      // draw triangle side
      
      switch (sideType) {
        
        case TrigFuncs.SIDE_TYPE_HYPOTENUSE:
          
          drawTriangleHypotenuseSide(canvas);

          break;
          
        case TrigFuncs.SIDE_TYPE_ADJACENT:
          
          drawTriangleAdjacentSide(canvas);
          
          break;
          
        case TrigFuncs.SIDE_TYPE_OPPOSITE:
          
          drawTriangleOppositeSide(canvas);
          
          break;

      }

      // draw formula corresponding to side

      int sideEquationResource = TrigFuncs.getTriangleSideEquationDrawableResource(sideType, funcArgIndex);
      System.out.println("sideEquationResource: " + sideEquationResource);
      Bitmap sideEquationBitmap = BitmapFactory.decodeResource(getResources(), sideEquationResource);
      System.out.println("sideEquationBitmap: " + sideEquationBitmap);
      System.out.println("funcNameBitmap: " + funcNameBitmap);
      System.out.println("funcNameDefBitmap: " + funcNameDefBitmap);
      canvas.drawBitmap(sideEquationBitmap, this.getWidth() / 2 - sideEquationBitmap.getWidth() / 2, this.getHeight() - funcNameBitmap.getHeight() - funcNameDefBitmap.getHeight()
          - sideEquationBitmap.getHeight() - 2 * this.expression_vertical_offset, null);

    }

    // data used to keep track of state information

    private int funcArgIndex;
    private int funcArgDegRad;
    private int funcNameIndex;

    // data used to draw on the canvas

    private static final int arrow_pixels = 6;
    private int circle_radius;
    private int axis_length;
    private int origin_vertical_offset;
    private int expression_vertical_offset;

    // pait variable used to draw on the canvas
    
    private Paint paint;

  }
  
  // whether graph has labels

  boolean graphHasLabels;
  
  // interval between screen refreshes
  
  int timeInterval;
  
  // handler used to manage updates to the screen
  
  UpdateHandler updateHandler;
  
  // handler used to keep track of elapsed time 
  
  ElapsedTimeHandler elapsedTimeHandler;
  
  // function value index specified by user
  
  int funcValIndexUser;
  
  // main state variable
  
  int state;
  
  // state variable indicating whether a computation is being carried out
  
  boolean isComputing;

  // state names
  
  static final int STATE_DEMO = 0;
  static final int STATE_PLAY_QUERY = 1;
  static final int STATE_PLAY_ANSCORRECT = 2;
  static final int STATE_PLAY_ANSWRONG_DISPLAYRAY = 3;
  static final int STATE_PLAY_ANSWRONG_DISPLAYTRIANGLE = 4;
  static final int STATE_PLAY_ANSWRONG_DISPLAYNUMERATOR = 5;
  static final int STATE_PLAY_ANSWRONG_DISPLAYDENOMINATOR = 6;
  static final int STATE_PLAY_ANSWRONG_DISPLAYANSWER = 8;
  static final int STATE_FINISH = 9;
  
  // number of tries per game
  
  int numTriesPerGame;
  
  // current number of tries during play
  
  int currentNumTries;
  
  // number of correct answers variable used to compute score
  
  int numCorrectAnswers;
  
  // elapsed time variable used to compute score
  
  int elapsedTime;

  // variables used to identify intents
 
  private static final int MANIPULATE_PREFERENCES_REQUEST = 0;
  
  private static final int CHOOSE_FUNC_NAME_AND_ARG_REQUEST = 1;

  // user interface elements
  
  Button funcval_zero_Button;
  Button funcval_plus_frac_1_2_Button;
  Button funcval_minus_frac_1_2_Button;
  Button funcval_plus_frac_sqrt3_3_Button;
  Button funcval_minus_frac_sqrt3_3_Button;
  Button funcval_plus_frac_sqrt2_2_Button;
  Button funcval_minus_frac_sqrt2_2_Button;
  Button funcval_plus_frac_sqrt3_2_Button;
  Button funcval_minus_frac_sqrt3_2_Button;
  Button funcval_plus_1_Button;
  Button funcval_minus_1_Button;
  Button funcval_plus_frac_2sqrt3_3_Button;
  Button funcval_minus_frac_2sqrt3_3_Button;
  Button funcval_plus_sqrt2_Button;
  Button funcval_minus_sqrt2_Button;
  Button funcval_plus_sqrt3_Button;
  Button funcval_minus_sqrt3_Button;
  Button funcval_plus_2_Button;
  Button funcval_minus_2_Button;
  Button funcval_undefined_Button;
  
}